package com.yufan.entity;

public class Contact {
    private Integer kConid;

    private String kConcellphonenumber;

    private String kConemail;

    private String kConqqnumber;

    private String kConwecharid;

    private Integer kUid;

    public Integer getkConid() {
        return kConid;
    }

    public void setkConid(Integer kConid) {
        this.kConid = kConid;
    }

    public String getkConcellphonenumber() {
        return kConcellphonenumber;
    }

    public void setkConcellphonenumber(String kConcellphonenumber) {
        this.kConcellphonenumber = kConcellphonenumber == null ? null : kConcellphonenumber.trim();
    }

    public String getkConemail() {
        return kConemail;
    }

    public void setkConemail(String kConemail) {
        this.kConemail = kConemail == null ? null : kConemail.trim();
    }

    public String getkConqqnumber() {
        return kConqqnumber;
    }

    public void setkConqqnumber(String kConqqnumber) {
        this.kConqqnumber = kConqqnumber == null ? null : kConqqnumber.trim();
    }

    public String getkConwecharid() {
        return kConwecharid;
    }

    public void setkConwecharid(String kConwecharid) {
        this.kConwecharid = kConwecharid == null ? null : kConwecharid.trim();
    }

    public Integer getkUid() {
        return kUid;
    }

    public void setkUid(Integer kUid) {
        this.kUid = kUid;
    }
}