package com.yufan.entity;

public class StudentInfomation {
    private Integer kStuid;

    private Integer kMid;

    private Integer kGrade;

    private Integer kDid;

    private String kCname;

    private Integer kUid;

    public Integer getkStuid() {
        return kStuid;
    }

    public void setkStuid(Integer kStuid) {
        this.kStuid = kStuid;
    }

    public Integer getkMid() {
        return kMid;
    }

    public void setkMid(Integer kMid) {
        this.kMid = kMid;
    }

    public Integer getkGrade() {
        return kGrade;
    }

    public void setkGrade(Integer kGrade) {
        this.kGrade = kGrade;
    }

    public Integer getkDid() {
        return kDid;
    }

    public void setkDid(Integer kDid) {
        this.kDid = kDid;
    }

    public String getkCname() {
        return kCname;
    }

    public void setkCname(String kCname) {
        this.kCname = kCname == null ? null : kCname.trim();
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
		result = prime * result + ((kCname == null) ? 0 : kCname.hashCode());
		result = prime * result + ((kDid == null) ? 0 : kDid.hashCode());
		result = prime * result + ((kGrade == null) ? 0 : kGrade.hashCode());
		result = prime * result + ((kMid == null) ? 0 : kMid.hashCode());
		result = prime * result + ((kStuid == null) ? 0 : kStuid.hashCode());
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
		StudentInfomation other = (StudentInfomation) obj;
		if (kCname == null) {
			if (other.kCname != null)
				return false;
		} else if (!kCname.equals(other.kCname))
			return false;
		if (kDid == null) {
			if (other.kDid != null)
				return false;
		} else if (!kDid.equals(other.kDid))
			return false;
		if (kGrade == null) {
			if (other.kGrade != null)
				return false;
		} else if (!kGrade.equals(other.kGrade))
			return false;
		if (kMid == null) {
			if (other.kMid != null)
				return false;
		} else if (!kMid.equals(other.kMid))
			return false;
		if (kStuid == null) {
			if (other.kStuid != null)
				return false;
		} else if (!kStuid.equals(other.kStuid))
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
		return "StudentInfomation [kStuid=" + kStuid + ", kMid=" + kMid
				+ ", kGrade=" + kGrade + ", kDid=" + kDid + ", kCname="
				+ kCname + ", kUid=" + kUid + "]";
	}
    
}