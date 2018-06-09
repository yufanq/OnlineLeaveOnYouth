package com.yufan.entity;

public class EmployeeInfomation {
    private Integer kEid;

    private String kEdepartment;

    private String kEposition;

    private String kEpay;

    private Integer kUid;

    private Integer kComid;

    public Integer getkEid() {
        return kEid;
    }

    public void setkEid(Integer kEid) {
        this.kEid = kEid;
    }

    public String getkEdepartment() {
        return kEdepartment;
    }

    public void setkEdepartment(String kEdepartment) {
        this.kEdepartment = kEdepartment == null ? null : kEdepartment.trim();
    }

    public String getkEposition() {
        return kEposition;
    }

    public void setkEposition(String kEposition) {
        this.kEposition = kEposition == null ? null : kEposition.trim();
    }

    public String getkEpay() {
        return kEpay;
    }

    public void setkEpay(String kEpay) {
        this.kEpay = kEpay == null ? null : kEpay.trim();
    }

    public Integer getkUid() {
        return kUid;
    }

    public void setkUid(Integer kUid) {
        this.kUid = kUid;
    }

    public Integer getkComid() {
        return kComid;
    }

    public void setkComid(Integer kComid) {
        this.kComid = kComid;
    }
}