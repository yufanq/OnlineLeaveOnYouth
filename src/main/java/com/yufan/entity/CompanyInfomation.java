package com.yufan.entity;

public class CompanyInfomation {
    private Integer kComid;

    private String kComprovince;

    private String kComcity;

    private String kComname;

    private String kComaddress;

    public Integer getkComid() {
        return kComid;
    }

    public void setkComid(Integer kComid) {
        this.kComid = kComid;
    }

    public String getkComprovince() {
        return kComprovince;
    }

    public void setkComprovince(String kComprovince) {
        this.kComprovince = kComprovince == null ? null : kComprovince.trim();
    }

    public String getkComcity() {
        return kComcity;
    }

    public void setkComcity(String kComcity) {
        this.kComcity = kComcity == null ? null : kComcity.trim();
    }

    public String getkComname() {
        return kComname;
    }

    public void setkComname(String kComname) {
        this.kComname = kComname == null ? null : kComname.trim();
    }

    public String getkComaddress() {
        return kComaddress;
    }

    public void setkComaddress(String kComaddress) {
        this.kComaddress = kComaddress == null ? null : kComaddress.trim();
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((kComaddress == null) ? 0 : kComaddress.hashCode());
		result = prime * result
				+ ((kComcity == null) ? 0 : kComcity.hashCode());
		result = prime * result + ((kComid == null) ? 0 : kComid.hashCode());
		result = prime * result
				+ ((kComname == null) ? 0 : kComname.hashCode());
		result = prime * result
				+ ((kComprovince == null) ? 0 : kComprovince.hashCode());
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
		CompanyInfomation other = (CompanyInfomation) obj;
		if (kComaddress == null) {
			if (other.kComaddress != null)
				return false;
		} else if (!kComaddress.equals(other.kComaddress))
			return false;
		if (kComcity == null) {
			if (other.kComcity != null)
				return false;
		} else if (!kComcity.equals(other.kComcity))
			return false;
		if (kComid == null) {
			if (other.kComid != null)
				return false;
		} else if (!kComid.equals(other.kComid))
			return false;
		if (kComname == null) {
			if (other.kComname != null)
				return false;
		} else if (!kComname.equals(other.kComname))
			return false;
		if (kComprovince == null) {
			if (other.kComprovince != null)
				return false;
		} else if (!kComprovince.equals(other.kComprovince))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CompanyInfomation [kComid=" + kComid + ", kComprovince="
				+ kComprovince + ", kComcity=" + kComcity + ", kComname="
				+ kComname + ", kComaddress=" + kComaddress + "]";
	}
    
}