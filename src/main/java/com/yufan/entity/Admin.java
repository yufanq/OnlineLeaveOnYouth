package com.yufan.entity;

public class Admin {

	private Integer kAid;

    private String kAccount;

    private String kPassword;

    public Integer getkAid() {
        return kAid;
    }

    public void setkAid(Integer kAid) {
        this.kAid = kAid;
    }

    public String getkAccount() {
        return kAccount;
    }

    public void setkAccount(String kAccount) {
        this.kAccount = kAccount == null ? null : kAccount.trim();
    }

    public String getkPassword() {
        return kPassword;
    }

    public void setkPassword(String kPassword) {
        this.kPassword = kPassword == null ? null : kPassword.trim();
    }
    @Override
	public String toString() {
		return "Admin [kAid=" + kAid + ", kAccount=" + kAccount
				+ ", kPassword=" + kPassword + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((kAccount == null) ? 0 : kAccount.hashCode());
		result = prime * result + ((kAid == null) ? 0 : kAid.hashCode());
		result = prime * result
				+ ((kPassword == null) ? 0 : kPassword.hashCode());
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
		Admin other = (Admin) obj;
		if (kAccount == null) {
			if (other.kAccount != null)
				return false;
		} else if (!kAccount.equals(other.kAccount))
			return false;
		if (kAid == null) {
			if (other.kAid != null)
				return false;
		} else if (!kAid.equals(other.kAid))
			return false;
		if (kPassword == null) {
			if (other.kPassword != null)
				return false;
		} else if (!kPassword.equals(other.kPassword))
			return false;
		return true;
	}

}