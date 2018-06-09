package com.yufan.entity;

import java.util.Date;

public class UserInfomation {
    private Integer kUid;

    private String kUname;

    private Boolean kUgender;

    private Date kUbirth;

    private Integer kUage;

    private Integer kUstature;

    private Byte kUstatus;

    private String kUaccount;

    private String kUpassword;

    public Integer getkUid() {
        return kUid;
    }

    public void setkUid(Integer kUid) {
        this.kUid = kUid;
    }

    public String getkUname() {
        return kUname;
    }

    public void setkUname(String kUname) {
        this.kUname = kUname == null ? null : kUname.trim();
    }

    public Boolean getkUgender() {
        return kUgender;
    }

    public void setkUgender(Boolean kUgender) {
        this.kUgender = kUgender;
    }

    public Date getkUbirth() {
        return kUbirth;
    }

    public void setkUbirth(Date kUbirth) {
        this.kUbirth = kUbirth;
    }

    public Integer getkUage() {
        return kUage;
    }

    public void setkUage(Integer kUage) {
        this.kUage = kUage;
    }

    public Integer getkUstature() {
        return kUstature;
    }

    public void setkUstature(Integer kUstature) {
        this.kUstature = kUstature;
    }

    public Byte getkUstatus() {
        return kUstatus;
    }

    public void setkUstatus(Byte kUstatus) {
        this.kUstatus = kUstatus;
    }

    public String getkUaccount() {
        return kUaccount;
    }

    public void setkUaccount(String kUaccount) {
        this.kUaccount = kUaccount == null ? null : kUaccount.trim();
    }

    public String getkUpassword() {
        return kUpassword;
    }

    public void setkUpassword(String kUpassword) {
        this.kUpassword = kUpassword == null ? null : kUpassword.trim();
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((kUaccount == null) ? 0 : kUaccount.hashCode());
		result = prime * result + ((kUage == null) ? 0 : kUage.hashCode());
		result = prime * result + ((kUbirth == null) ? 0 : kUbirth.hashCode());
		result = prime * result
				+ ((kUgender == null) ? 0 : kUgender.hashCode());
		result = prime * result + ((kUid == null) ? 0 : kUid.hashCode());
		result = prime * result + ((kUname == null) ? 0 : kUname.hashCode());
		result = prime * result
				+ ((kUpassword == null) ? 0 : kUpassword.hashCode());
		result = prime * result
				+ ((kUstature == null) ? 0 : kUstature.hashCode());
		result = prime * result
				+ ((kUstatus == null) ? 0 : kUstatus.hashCode());
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
		UserInfomation other = (UserInfomation) obj;
		if (kUaccount == null) {
			if (other.kUaccount != null)
				return false;
		} else if (!kUaccount.equals(other.kUaccount))
			return false;
		if (kUage == null) {
			if (other.kUage != null)
				return false;
		} else if (!kUage.equals(other.kUage))
			return false;
		if (kUbirth == null) {
			if (other.kUbirth != null)
				return false;
		} else if (!kUbirth.equals(other.kUbirth))
			return false;
		if (kUgender == null) {
			if (other.kUgender != null)
				return false;
		} else if (!kUgender.equals(other.kUgender))
			return false;
		if (kUid == null) {
			if (other.kUid != null)
				return false;
		} else if (!kUid.equals(other.kUid))
			return false;
		if (kUname == null) {
			if (other.kUname != null)
				return false;
		} else if (!kUname.equals(other.kUname))
			return false;
		if (kUpassword == null) {
			if (other.kUpassword != null)
				return false;
		} else if (!kUpassword.equals(other.kUpassword))
			return false;
		if (kUstature == null) {
			if (other.kUstature != null)
				return false;
		} else if (!kUstature.equals(other.kUstature))
			return false;
		if (kUstatus == null) {
			if (other.kUstatus != null)
				return false;
		} else if (!kUstatus.equals(other.kUstatus))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserInfomation [kUid=" + kUid + ", kUname=" + kUname
				+ ", kUgender=" + kUgender + ", kUbirth=" + kUbirth
				+ ", kUage=" + kUage + ", kUstature=" + kUstature
				+ ", kUstatus=" + kUstatus + ", kUaccount=" + kUaccount
				+ ", kUpassword=" + kUpassword + "]";
	}
    
}