package com.yufan.entity;

import java.util.Date;

public class CrowdInfomation {
    private Integer kCroid;

    private String kCroname;

    private Date kCrocreatetime;

    private Byte kCrojurisdiction; // 0 

    private Integer kUid;

    public Integer getkCroid() {
        return kCroid;
    }

    public void setkCroid(Integer kCroid) {
        this.kCroid = kCroid;
    }

    public String getkCroname() {
        return kCroname;
    }

    public void setkCroname(String kCroname) {
        this.kCroname = kCroname == null ? null : kCroname.trim();
    }

    public Date getkCrocreatetime() {
        return kCrocreatetime;
    }

    public void setkCrocreatetime(Date kCrocreatetime) {
        this.kCrocreatetime = kCrocreatetime;
    }

    public Byte getkCrojurisdiction() {
        return kCrojurisdiction;
    }

    public void setkCrojurisdiction(Byte kCrojurisdiction) {
        this.kCrojurisdiction = kCrojurisdiction;
    }

    public Integer getkUid() {
        return kUid;
    }

    public void setkUid(Integer kUid) {
        this.kUid = kUid;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((kCrocreatetime == null) ? 0 : kCrocreatetime.hashCode());
		result = prime * result + ((kCroid == null) ? 0 : kCroid.hashCode());
		result = prime
				* result
				+ ((kCrojurisdiction == null) ? 0 : kCrojurisdiction.hashCode());
		result = prime * result
				+ ((kCroname == null) ? 0 : kCroname.hashCode());
		result = prime * result + ((kUid == null) ? 0 : kUid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CrowdInfomation other = (CrowdInfomation) obj;
		if (kCrocreatetime == null) {
			if (other.kCrocreatetime != null)
				return false;
		} else if (!kCrocreatetime.equals(other.kCrocreatetime))
			return false;
		if (kCroid == null) {
			if (other.kCroid != null)
				return false;
		} else if (!kCroid.equals(other.kCroid))
			return false;
		if (kCrojurisdiction == null) {
			if (other.kCrojurisdiction != null)
				return false;
		} else if (!kCrojurisdiction.equals(other.kCrojurisdiction))
			return false;
		if (kCroname == null) {
			if (other.kCroname != null)
				return false;
		} else if (!kCroname.equals(other.kCroname))
			return false;
		if (kUid == null) {
			if (other.kUid != null)
				return false;
		} else if (!kUid.equals(other.kUid))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CrowdInfomation [kCroid=" + kCroid + ", kCroname=" + kCroname
				+ ", kCrocreatetime=" + kCrocreatetime + ", kCrojurisdiction="
				+ kCrojurisdiction + ", kUid=" + kUid + "]";
	}
    
}