package com.example.administrator.hospitalproject;

public class Article {

    private String userName;
    private String userNum;
    private String deptId;
    private String SxId;
    private String pastContent;
    private String dtContent;

    public Article (String userName, String userNum,
                    String deptId, String SxId, String pastContent, String dtContent){
        this.userName = userName;
        this.userNum = userNum;
        this.deptId = deptId;
        this.SxId = SxId;
        this.pastContent = pastContent;
        this.dtContent = dtContent;
    }




    public String getUserName() {
        return userName;
    }

    public String getUserNum() {
        return userNum;
    }

    public String getDeptId() {
        return deptId;
    }

    public String getSxId() {
        return SxId;
    }

    public String getPastContent() {
        return pastContent;
    }

    public String getDtContent() {
        return dtContent;
    }
}