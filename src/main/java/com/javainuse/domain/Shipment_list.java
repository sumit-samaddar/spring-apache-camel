package com.javainuse.domain;

public class Shipment_list {
	private String status;

	private String shipment_price;

	private String service_type;

	private String logistics_promised_date;

	private String order_id;

	private Customer customer;

	private String amount;

	private String customer_promised_date;

	private String parent_type;

	private String shipment_type;

	private String payment_mode;

	private String shipment_id;

	private String[] categories;

	private String parent_id;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getShipment_price() {
		return shipment_price;
	}

	public void setShipment_price(String shipment_price) {
		this.shipment_price = shipment_price;
	}

	public String getService_type() {
		return service_type;
	}

	public void setService_type(String service_type) {
		this.service_type = service_type;
	}

	public String getLogistics_promised_date() {
		return logistics_promised_date;
	}

	public void setLogistics_promised_date(String logistics_promised_date) {
		this.logistics_promised_date = logistics_promised_date;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCustomer_promised_date() {
		return customer_promised_date;
	}

	public void setCustomer_promised_date(String customer_promised_date) {
		this.customer_promised_date = customer_promised_date;
	}

	public String getParent_type() {
		return parent_type;
	}

	public void setParent_type(String parent_type) {
		this.parent_type = parent_type;
	}

	public String getShipment_type() {
		return shipment_type;
	}

	public void setShipment_type(String shipment_type) {
		this.shipment_type = shipment_type;
	}

	public String getPayment_mode ()
    {
        return payment_mode;
    }

	public void setPayment_mode (String payment_mode)
    {
        this.payment_mode = payment_mode;
    }

	public String getShipment_id() {
		return shipment_id;
	}

	public void setShipment_id(String shipment_id) {
		this.shipment_id = shipment_id;
	}

	public String[] getCategories() {
		return categories;
	}

	public void setCategories(String[] categories) {
		this.categories = categories;
	}

	public String getParent_id() {
		return parent_id;
	}

	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}

	@Override
	public String toString() {
		return "ClassPojo [status = " + status + ", shipment_price = " + shipment_price + ", service_type = "
				+ service_type + ", logistics_promised_date = " + logistics_promised_date + ", order_id = " + order_id
				+ ", customer = " + customer + ", amount = " + amount + ", customer_promised_date = "
				+ customer_promised_date + ", parent_type = " + parent_type + ", shipment_type = " + shipment_type
				+ ", payment_mode = " + payment_mode + ", shipment_id = " + shipment_id + ", categories = " + categories
				+ ", parent_id = " + parent_id + "]";
	}
}
