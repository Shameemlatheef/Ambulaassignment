package com.example.Exception;

import java.time.LocalTime;

public class MyError {

	private LocalTime localtime;
	private String msg;
	private String description;
	@Override
	public String toString() {
		return "MyError [localtime=" + localtime + ", msg=" + msg + ", description=" + description + "]";
	}
	public LocalTime getLocaltime() {
		return localtime;
	}
	public void setLocaltime(LocalTime localtime) {
		this.localtime = localtime;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public MyError(LocalTime localtime, String msg, String description) {
		super();
		this.localtime = localtime;
		this.msg = msg;
		this.description = description;
	}
	public MyError() {
		super();
	}
}
