package com.yufan.entity;

public class SchoolInfomation {
    private Integer kSid;

    private String kSprovince;

    private String kScity;

    private String kSname;

    private String kSaddress;

    public Integer getkSid() {
        return kSid;
    }

    public void setkSid(Integer kSid) {
        this.kSid = kSid;
    }

    public String getkSprovince() {
        return kSprovince;
    }

    public void setkSprovince(String kSprovince) {
        this.kSprovince = kSprovince == null ? null : kSprovince.trim();
    }

    public String getkScity() {
        return kScity;
    }

    public void setkScity(String kScity) {
        this.kScity = kScity == null ? null : kScity.trim();
    }

    public String getkSname() {
        return kSname;
    }

    public void setkSname(String kSname) {
        this.kSname = kSname == null ? null : kSname.trim();
    }

    public String getkSaddress() {
        return kSaddress;
    }

    public void setkSaddress(String kSaddress) {
        this.kSaddress = kSaddress == null ? null : kSaddress.trim();
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((kSaddress == null) ? 0 : kSaddress.hashCode());
		result = prime * result + ((kScity == null) ? 0 : kScity.hashCode());
		result = prime * result + ((kSid == null) ? 0 : kSid.hashCode());
		result = prime * result + ((kSname == null) ? 0 : kSname.hashCode());
		result = prime * result
				+ ((kSprovince == null) ? 0 : kSprovince.hashCode());
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
		SchoolInfomation other = (SchoolInfomation) obj;
		if (kSaddress == null) {
			if (other.kSaddress != null)
				return false;
		} else if (!kSaddress.equals(other.kSaddress))
			return false;
		if (kScity == null) {
			if (other.kScity != null)
				return false;
		} else if (!kScity.equals(other.kScity))
			return false;
		if (kSid == null) {
			if (other.kSid != null)
				return false;
		} else if (!kSid.equals(other.kSid))
			return false;
		if (kSname == null) {
			if (other.kSname != null)
				return false;
		} else if (!kSname.equals(other.kSname))
			return false;
		if (kSprovince == null) {
			if (other.kSprovince != null)
				return false;
		} else if (!kSprovince.equals(other.kSprovince))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SchoolInfomation [kSid=" + kSid + ", kSprovince=" + kSprovince
				+ ", kScity=" + kScity + ", kSname=" + kSname + ", kSaddress="
				+ kSaddress + "]";
	}
    
}