package com.bean;

import java.util.Date;

public class Customer {

	private int customerNo;
	private String customerName;
	private String gender;
	private Date dob;
	private String mobileNo;
	private String emailAdress;
	
	public int getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailAdress() {
		return emailAdress;
	}
	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}
	@Override
	public String toString() {
		return "Customer [customerNo=" + customerNo + ", customerName=" + customerName + ", gender=" + gender + ", dob="
				+ dob + ", mobileNo=" + mobileNo + ", emailAdress=" + emailAdress + "]";
	}
	
	
}
