package com.yufan.entity;

public class DepartmentInfomation {
    private Integer kDid;

    private String kDname;

    private Integer kSid;

    public Integer getkDid() {
        return kDid;
    }

    public void setkDid(Integer kDid) {
        this.kDid = kDid;
    }

    public String getkDname() {
        return kDname;
    }

    public void setkDname(String kDname) {
        this.kDname = kDname == null ? null : kDname.trim();
    }

    public Integer getkSid() {
        return kSid;
    }

    public void setkSid(Integer kSid) {
        this.kSid = kSid;
    }
}