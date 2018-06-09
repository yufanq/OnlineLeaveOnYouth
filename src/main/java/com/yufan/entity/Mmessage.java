package com.yufan.entity;

import java.util.Date;

public class Mmessage {
    private Integer kMid;

    private String kMname;

    private Date kMdate;

    private String kMdeatail;

    private Integer kUid;

    private Integer kCroid;

    private Byte kMjuridiction; // 0 申请消息  // 1  评论
    
    private Byte kMtype;

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

    public Date getkMdate() {
        return kMdate;
    }

    public void setkMdate(Date kMdate) {
        this.kMdate = kMdate;
    }

    public String getkMdeatail() {
        return kMdeatail;
    }

    public void setkMdeatail(String kMdeatail) {
        this.kMdeatail = kMdeatail == null ? null : kMdeatail.trim();
    }

    public Integer getkUid() {
        return kUid;
    }

    public void setkUid(Integer kUid) {
        this.kUid = kUid;
    }

    public Integer getkCroid() {
        return kCroid;
    }

    public void setkCroid(Integer kCroid) {
        this.kCroid = kCroid;
    }

    public Byte getkMjuridiction() {
        return kMjuridiction;
    }

    public void setkMjuridiction(Byte kMjuridiction) {
        this.kMjuridiction = kMjuridiction;
    }
}