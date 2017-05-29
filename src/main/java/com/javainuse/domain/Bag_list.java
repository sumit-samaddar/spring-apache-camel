package com.javainuse.domain;

public class Bag_list {
	private String category;

	private String status;

	private String bag_id;

	private String parent_type;

	private String seal_id;

	private String tracking_id;

	private String parent_id;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBag_id() {
		return bag_id;
	}

	public void setBag_id(String bag_id) {
		this.bag_id = bag_id;
	}

	public String getParent_type() {
		return parent_type;
	}

	public void setParent_type(String parent_type) {
		this.parent_type = parent_type;
	}

	public String getSeal_id() {
		return seal_id;
	}

	public void setSeal_id(String seal_id) {
		this.seal_id = seal_id;
	}

	public String getTracking_id() {
		return tracking_id;
	}

	public void setTracking_id(String tracking_id) {
		this.tracking_id = tracking_id;
	}

	public String getParent_id() {
		return parent_id;
	}

	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}

	@Override
	public String toString() {
		return "ClassPojo [category = " + category + ", status = " + status + ", bag_id = " + bag_id
				+ ", parent_type = " + parent_type + ", seal_id = " + seal_id + ", tracking_id = " + tracking_id
				+ ", parent_id = " + parent_id + "]";
	}
}
