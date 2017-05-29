package com.javainuse.domain;

public class Data {
	private Consignment_list[] consignment_list;

	private Shipment_list[] shipment_list;

	private Bag_list[] bag_list;

	public Consignment_list[] getConsignment_list() {
		return consignment_list;
	}

	public void setConsignment_list(Consignment_list[] consignment_list) {
		this.consignment_list = consignment_list;
	}

	public Shipment_list[] getShipment_list() {
		return shipment_list;
	}

	public void setShipment_list(Shipment_list[] shipment_list) {
		this.shipment_list = shipment_list;
	}

	public Bag_list[] getBag_list() {
		return bag_list;
	}

	public void setBag_list(Bag_list[] bag_list) {
		this.bag_list = bag_list;
	}

	@Override
	public String toString() {
		return "ClassPojo [consignment_list = " + consignment_list + ", shipment_list = " + shipment_list
				+ ", bag_list = " + bag_list + "]";
	}
}
