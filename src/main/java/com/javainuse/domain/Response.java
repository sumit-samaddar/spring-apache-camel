package com.javainuse.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Response {

	private List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();

	private String error_code;

	private String msg;

	private String stat;

	public List<Map<String, Object>> getData() {
		return data;
	}

	public void setData(List<Map<String, Object>> data) {
		this.data = data;
	}

	public String getError_code() {
		return error_code;
	}

	public void setError_code(String error_code) {
		this.error_code = error_code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

	@Override
	public String toString() {
		return "ClassPojo [data = " + data + ", error_code = " + error_code + ", msg = " + msg + ", stat = " + stat
				+ "]";
	}

}
