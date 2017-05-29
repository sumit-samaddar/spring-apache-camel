package com.javainuse.domain;

public class Consignment_list {
	private String consignment_id;

	private String awb;

	private String status;

	private String total_weight;

	private String date;

	public String getConsignment_id() {
		return consignment_id;
	}

	public void setConsignment_id(String consignment_id) {
		this.consignment_id = consignment_id;
	}

	public String getAwb() {
		return awb;
	}

	public void setAwb(String awb) {
		this.awb = awb;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTotal_weight() {
		return total_weight;
	}

	public void setTotal_weight(String total_weight) {
		this.total_weight = total_weight;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "ClassPojo [consignment_id = " + consignment_id + ", awb = " + awb + ", status = " + status
				+ ", total_weight = " + total_weight + ", date = " + date + "]";
	}
}