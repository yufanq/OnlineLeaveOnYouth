package com.yufan.entity;

import java.util.Date;

public class Commend {
    private Integer kCommid;

    private String kCommcontent;

    private Date kCommrelease;

    private UserInfomation userInfomation;

    private Integer kMid;

    public Integer getkCommid() {
        return kCommid;
    }

    public void setkCommid(Integer kCommid) {
        this.kCommid = kCommid;
    }

    public String getkCommcontent() {
        return kCommcontent;
    }

    public void setkCommcontent(String kCommcontent) {
        this.kCommcontent = kCommcontent == null ? null : kCommcontent.trim();
    }

    public Date getkCommrelease() {
        return kCommrelease;
    }

    public void setkCommrelease(Date kCommrelease) {
        this.kCommrelease = kCommrelease;
    }

   

    public UserInfomation getUserInfomation() {
		return userInfomation;
	}

	public void setUserInfomation(UserInfomation userInfomation) {
		this.userInfomation = userInfomation;
	}

	public Integer getkMid() {
        return kMid;
    }

    public void setkMid(Integer kMid) {
        this.kMid = kMid;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((kCommcontent == null) ? 0 : kCommcontent.hashCode());
		result = prime * result + ((kCommid == null) ? 0 : kCommid.hashCode());
		result = prime * result
				+ ((kCommrelease == null) ? 0 : kCommrelease.hashCode());
		result = prime * result + ((kMid == null) ? 0 : kMid.hashCode());
		result = prime * result
				+ ((userInfomation == null) ? 0 : userInfomation.hashCode());
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
		Commend other = (Commend) obj;
		if (kCommcontent == null) {
			if (other.kCommcontent != null)
				return false;
		} else if (!kCommcontent.equals(other.kCommcontent))
			return false;
		if (kCommid == null) {
			if (other.kCommid != null)
				return false;
		} else if (!kCommid.equals(other.kCommid))
			return false;
		if (kCommrelease == null) {
			if (other.kCommrelease != null)
				return false;
		} else if (!kCommrelease.equals(other.kCommrelease))
			return false;
		if (kMid == null) {
			if (other.kMid != null)
				return false;
		} else if (!kMid.equals(other.kMid))
			return false;
		if (userInfomation == null) {
			if (other.userInfomation != null)
				return false;
		} else if (!userInfomation.equals(other.userInfomation))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Commend [kCommid=" + kCommid + ", kCommcontent=" + kCommcontent
				+ ", kCommrelease=" + kCommrelease + ", userInfomation="
				+ userInfomation + ", kMid=" + kMid + "]";
	}

}