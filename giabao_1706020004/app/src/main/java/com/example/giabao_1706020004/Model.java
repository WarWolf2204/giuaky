package com.example.giabao_1706020004;

public class Model {
    private String code;
    private String credit;
    private String namesubject;

    public  Model(String mNamesubject ,String mCode ,String mCredit)
    {

        this.code = mCode;
        this.credit = mCredit;
        this.namesubject = mNamesubject;

    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getNamesubject() {
        return namesubject;
    }

    public void setNamesubject(String namesubject) {
        this.namesubject = namesubject;
    }
}
