package com.yufan.entity;

public class GroupNumberInfomation {
    private Integer kGid;

    private Byte kGstatus; // 0 在线  1 离线

    private Byte kGlevel; // 0 群主  1管理员 2普通成员  

    private UserInfomation userInfomation; // 用户 信息

    private CrowdInfomation crowdInfomation; // 群信息

    public Integer getkGid() {
        return kGid;
    }

    public void setkGid(Integer kGid) {
        this.kGid = kGid;
    }

    public Byte getkGstatus() {
        return kGstatus;
    }

    public void setkGstatus(Byte kGstatus) {
        this.kGstatus = kGstatus;
    }

    public Byte getkGlevel() {
        return kGlevel;
    }

    public void setkGlevel(Byte kGlevel) {
        this.kGlevel = kGlevel;
    }

	public UserInfomation getUserInfomation() {
		return userInfomation;
	}

	public void setUserInfomation(UserInfomation userInfomation) {
		this.userInfomation = userInfomation;
	}

	public CrowdInfomation getCrowdInfomation() {
		return crowdInfomation;
	}

	public void setCrowdInfomation(CrowdInfomation crowdInfomation) {
		this.crowdInfomation = crowdInfomation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((crowdInfomation == null) ? 0 : crowdInfomation.hashCode());
		result = prime * result + ((kGid == null) ? 0 : kGid.hashCode());
		result = prime * result + ((kGlevel == null) ? 0 : kGlevel.hashCode());
		result = prime * result
				+ ((kGstatus == null) ? 0 : kGstatus.hashCode());
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
		GroupNumberInfomation other = (GroupNumberInfomation) obj;
		if (crowdInfomation == null) {
			if (other.crowdInfomation != null)
				return false;
		} else if (!crowdInfomation.equals(other.crowdInfomation))
			return false;
		if (kGid == null) {
			if (other.kGid != null)
				return false;
		} else if (!kGid.equals(other.kGid))
			return false;
		if (kGlevel == null) {
			if (other.kGlevel != null)
				return false;
		} else if (!kGlevel.equals(other.kGlevel))
			return false;
		if (kGstatus == null) {
			if (other.kGstatus != null)
				return false;
		} else if (!kGstatus.equals(other.kGstatus))
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
		return "GroupNumberInfomation [kGid=" + kGid + ", kGstatus=" + kGstatus
				+ ", kGlevel=" + kGlevel + ", userInfomation=" + userInfomation
				+ ", crowdInfomation=" + crowdInfomation + "]";
	}

   
}