package com.yufan.entity;

import java.util.Date;

public class PictureDetail {
    private Integer kPid;

    private String kPaddress;

    private Date kPdate;

    private Integer kUid;

    private Integer kMid;

    public Integer getkPid() {
        return kPid;
    }

    public void setkPid(Integer kPid) {
        this.kPid = kPid;
    }

    public String getkPaddress() {
        return kPaddress;
    }

    public void setkPaddress(String kPaddress) {
        this.kPaddress = kPaddress == null ? null : kPaddress.trim();
    }

    public Date getkPdate() {
        return kPdate;
    }

    public void setkPdate(Date kPdate) {
        this.kPdate = kPdate;
    }

    public Integer getkUid() {
        return kUid;
    }

    public void setkUid(Integer kUid) {
        this.kUid = kUid;
    }

    public Integer getkMid() {
        return kMid;
    }

    public void setkMid(Integer kMid) {
        this.kMid = kMid;
    }
}