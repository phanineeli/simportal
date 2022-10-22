package com.Simportal.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customeraddress")
public class CustomerAddressEntity {
	@Id
	@Column(name="addressid")
	 Integer addressId;
	@Column(nullable = false, length = 50)
	 String address;
	@Column(nullable = false, length = 50)
	 String city;
	@Column(nullable = false)
	 Integer pincode;
	@Column(nullable = false, length = 50)
	 String state;
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
