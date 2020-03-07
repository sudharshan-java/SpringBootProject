package com.nt.yadav;

public class Contact {
	
	private String name;
	private Integer contactNumber;
	public Integer getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Integer contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactAddrs() {
		return contactAddrs;
	}
	public void setContactAddrs(String contactAddrs) {
		this.contactAddrs = contactAddrs;
	}
	private String contactName;
	private String contactAddrs;
	@Override
	public String toString() {
		return "Contact [contactNumber=" + contactNumber + ", contactName=" + contactName + ", contactAddrs="
				+ contactAddrs + "]";
	}
    
}
