package com.yufan.entity;

public class MajorInfomation {
    private Integer kMid;

    private String kMname;

    private Integer kDid;

    public Integer getkMid() {
        return kMid;
    }

    public void setkMid(Integer kMid) {
        this.kMid = kMid;
    }

    public String getkMname() {
        return kMname;
    }

    public void setkMname(String kMname) {
        this.kMname = kMname == null ? null : kMname.trim();
    }

    public Integer getkDid() {
        return kDid;
    }

    public void setkDid(Integer kDid) {
        this.kDid = kDid;
    }
}