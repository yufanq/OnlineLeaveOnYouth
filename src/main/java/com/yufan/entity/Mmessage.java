package com.yufan.entity;

import java.util.Date;

public class Mmessage {
    private Integer kMid;

    private String kMname;

    private Date kMdate;

    private String kMdeatail;

    private Integer kUid;

    private Integer kCroid;

    private Byte kMjuridiction;

    private Byte kMtype; // 0 申请入群消息  1 活动发布消息   2 反馈消息  3 活动通知

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

    public Byte getkMtype() {
        return kMtype;
    }

    public void setkMtype(	Byte kMtype) {
        this.kMtype = kMtype;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kCroid == null) ? 0 : kCroid.hashCode());
		result = prime * result + ((kMdate == null) ? 0 : kMdate.hashCode());
		result = prime * result
				+ ((kMdeatail == null) ? 0 : kMdeatail.hashCode());
		result = prime * result + ((kMid == null) ? 0 : kMid.hashCode());
		result = prime * result
				+ ((kMjuridiction == null) ? 0 : kMjuridiction.hashCode());
		result = prime * result + ((kMname == null) ? 0 : kMname.hashCode());
		result = prime * result + ((kMtype == null) ? 0 : kMtype.hashCode());
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
		Mmessage other = (Mmessage) obj;
		if (kCroid == null) {
			if (other.kCroid != null)
				return false;
		} else if (!kCroid.equals(other.kCroid))
			return false;
		if (kMdate == null) {
			if (other.kMdate != null)
				return false;
		} else if (!kMdate.equals(other.kMdate))
			return false;
		if (kMdeatail == null) {
			if (other.kMdeatail != null)
				return false;
		} else if (!kMdeatail.equals(other.kMdeatail))
			return false;
		if (kMid == null) {
			if (other.kMid != null)
				return false;
		} else if (!kMid.equals(other.kMid))
			return false;
		if (kMjuridiction == null) {
			if (other.kMjuridiction != null)
				return false;
		} else if (!kMjuridiction.equals(other.kMjuridiction))
			return false;
		if (kMname == null) {
			if (other.kMname != null)
				return false;
		} else if (!kMname.equals(other.kMname))
			return false;
		if (kMtype == null) {
			if (other.kMtype != null)
				return false;
		} else if (!kMtype.equals(other.kMtype))
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
		return "Mmessage [kMid=" + kMid + ", kMname=" + kMname + ", kMdate="
				+ kMdate + ", kMdeatail=" + kMdeatail + ", kUid=" + kUid
				+ ", kCroid=" + kCroid + ", kMjuridiction=" + kMjuridiction
				+ ", kMtype=" + kMtype + "]";
	}


}