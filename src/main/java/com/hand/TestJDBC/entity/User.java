package com.hand.TestJDBC.entity;

import java.sql.Date;

public class User extends IdEntity {

	private String un;
	private String pw;
	private Date create_date;

	public String getUn() {
		return un;
	}

	public void setUn(String un) {
		this.un = un;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	@Override
	public String toString() {
		return "User [un=" + un + ", pw=" + pw + ", create_date=" + create_date + ", id=" + id + "]";
	}
}