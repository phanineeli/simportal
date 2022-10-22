package com.Simportal.DTO;

import com.Simportal.Entity.CustomerAddressEntity;

public class CustomerAddress {
 Integer addressId;
 String address;
 String city;
 Integer pincode;
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
public static CustomerAddress valueOf(CustomerAddressEntity custadd) {
	CustomerAddress custad =new CustomerAddress();
	custad.setAddressId(custadd.getAddressId());
	custad.setAddress(custadd.getAddress());
	custad.setCity(custadd.getCity());
	custad.setPincode(custadd.getPincode());
	custad.setState(custadd.getState());
	return custad;
	
}
@Override
public String toString() {
	return "CustomerAddress [addressId=" + addressId + ", address=" + address + ", city=" + city + ", pincode="
			+ pincode + ", state=" + state + "]";
}
}
