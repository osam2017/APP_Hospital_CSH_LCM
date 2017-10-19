package com.example.administrator.hospitalproject;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.widget.EditText;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import static com.loopj.android.http.AsyncHttpClient.log;

public class Dao {
    private Context context;
    private SQLiteDatabase database;

    public Dao(Context context) {
        this.context = context;

        database = context.openOrCreateDatabase("LocalDATA.db", SQLiteDatabase.CREATE_IF_NECESSARY, null);
        try{
            String sql = "CREATE TABLE IF NOT EXISTS Articles  (ID integer primary key autoincrement,"
                    + "                                         userName text ,"
                    + "                                         userNum text ,"
                    + "                                         deptId text ,"
                    + "                                         SxId text ,"
                    + "                                         pastContent text ,"
                    + "                                         dtContent text );";
            database.execSQL(sql);

        } catch (Exception e){
            Log.e("test", "CREATE TABLE FAILED! -" + e );
            e.printStackTrace();
        }
    }


    public void makeJsonData(){

    }
    public void insertData(String userName, String userNum, String deptId, String SxId , String pastContent, String dtContent){


        //FileDownloader fileDownloader = new FileDownloader(context);


        try {

            String sql = "INSERT INTO Articles(userName, userNum, deptId, SxId, pastContent, dtContent)"
                    + " VALUES(" +"'" + userName + "','" + userNum + "','" + deptId + "', '" + SxId + "', '"
                    + pastContent + "', '" + dtContent + "');";
            Log.i("Dao_insertData","userName: " + userName);
            Log.i("Dao_insertData","deptId: " + deptId);
            Log.i("Dao_insertData","SxId: " + SxId);
            try {
                database.execSQL(sql);

            } catch (Exception e) {
                Log.e("test", "DB ERROR " + e);
                e.printStackTrace();
            }
            // fileDownloader.downFile("http://127.0.0.1:5009/image/" + imgName, imgName);
            //Log.i("test",   "http://10.53.128.137:5009/image/" + imgName);
        }catch (Exception e){
            Log.e("test", "insert ERROR! -" + e);
            e.printStackTrace();
        }
    }

    public ArrayList<Article> getArticleList(){

        ArrayList<Article> articleList = new ArrayList<Article>();

        int articleNumber;
        String userName;
        String userNum;
        String deptId;
        String SxId;
        String pastContent;
        String dtContent;

        String sql = "SELECT * FROM Articles;";

        Cursor cursor = database.rawQuery(sql, null);

        while (cursor.moveToNext()){
            userName = cursor.getString(1);
            Log.e("cursor", "getString" + userName);

            userNum = cursor.getString(2);
            deptId = cursor.getString(3);
            SxId = cursor.getString(4);
            pastContent = cursor.getString(5);
            dtContent = cursor.getString(6);
            articleList.add(new Article(userName, userNum, deptId, SxId, pastContent, dtContent));
        }
        log.i("ArrayList", cursor.getString(1));
        cursor.close();

        return articleList;
    }

    public Article getArticleByArticleNumber(int articleNumber){

        Article article = null;

//        int articleNumber;
        String userName;
        String userNum;
        String deptId;
        String SxId;
        String pastContent;
        String dtContent;

        String sql = "SELECT * FROM Articles WHERE ArticleNumber = " + articleNumber + ";";
        Cursor cursor = database.rawQuery(sql, null);

        cursor.moveToNext();

        articleNumber = cursor.getInt(1);
        userName = cursor.getString(2);
        userNum = cursor.getString(3);
        deptId = cursor.getString(4);
        SxId = cursor.getString(5);
        pastContent = cursor.getString(6);
        dtContent = cursor.getString(7);
        //article = new Article(articleNumber, userName, userNum, deptId, SxId, pastContent, dtContent);

        cursor.close();
        return article;
    }


    /*
     * JSON파싱을 위한 테스트 문자열입니다.
     * 각 데이터는 다음과 같습니다.
     * ArticleNumber - 글번호 중복X 숫자
     * Title - 글제목 문자열
     * Writer - 작성자
     * Id - 작성자ID
     * Content - 글내용
     * WriteDate - 작성일
     * ImgName - 사진명
     */
    public String getJsonTestData() {

        StringBuilder sb = new StringBuilder();
        sb.append("");

        sb.append("[");

        sb.append("      {");
        sb.append("         'userName':'최슿오',");
        sb.append("         'userNum':'16-76022415',");
        sb.append("         'deptId':'6613d02f3e2153283f23bf621145f877',");
        sb.append("         'SxId':'하지만 곧 기말고사지...',");
        sb.append("         'pastContent':'2013-09-23-10-10',");
        sb.append("         'dtContent':'photo1.jpg'");
        sb.append("      },");
        sb.append("      {");
        sb.append("         'ArticleNumber':'2',");
        sb.append("         'Title':'대출 최고 3000만원',");
        sb.append("         'Writer':'김미영 팀장',");
        sb.append("         'Id':'6326d02f3e2153266f23bf621145f734',");
        sb.append("         'Content':'김미영팀장입니다. 고갱님께서는 최저이율로 최고 3000만원까지 30분 이내 통장입금가능합니다.',");
        sb.append("         'WriteDate':'2013-09-24-11-22',");
        sb.append("         'ImgName':'photo2.jpg'");
        sb.append("      },");
        sb.append("      {");
        sb.append("         'ArticleNumber':'3',");
        sb.append("         'Title':'MAC등록신청',");
        sb.append("         'Writer':'학생2',");
        sb.append("         'Id':'8426d02f3e2153283246bf6211454262',");
        sb.append("         'Content':'1a:2b:3c:4d:5e:6f',");
        sb.append("         'WriteDate':'2013-09-25-12-33',");
        sb.append("         'ImgName':'photo3.jpg'");
        sb.append("      }");

        sb.append("]");

        return sb.toString();
    }

}
