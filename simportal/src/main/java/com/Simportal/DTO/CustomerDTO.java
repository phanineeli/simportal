package com.Simportal.DTO;

import com.Simportal.Entity.CustomerEntity;

public class CustomerDTO {
CustomerIdentityDTO uniqueIdnumber;
CustomerIdentityDTO dateOfBirth;
CustomerIdentityDTO emailAddress;
CustomerIdentityDTO firstname;
CustomerIdentityDTO lastName;
String idType;
CustomerAddress addressId;
SimDetailsDTO simId;
CustomerAddress state;

public CustomerIdentityDTO getUniqueIdnumber() {
	return uniqueIdnumber;
}
public void setUniqueIdnumber(CustomerIdentityDTO uniqueIdnumber) {
	this.uniqueIdnumber = uniqueIdnumber;
}
public CustomerIdentityDTO getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(CustomerIdentityDTO dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public CustomerIdentityDTO getEmailAddress() {
	return emailAddress;
}
public void setEmailAddress(CustomerIdentityDTO emailAddress) {
	this.emailAddress = emailAddress;
}
public CustomerIdentityDTO getFirstname() {
	return firstname;
}
public void setFirstname(CustomerIdentityDTO firstname) {
	this.firstname = firstname;
}
public CustomerIdentityDTO getLastName() {
	return lastName;
}
public void setLastName(CustomerIdentityDTO lastName) {
	this.lastName = lastName;
}
public String getIdType() {
	return idType;
}
public void setIdType(String idType) {
	this.idType = idType;
}
public CustomerAddress getAddressId() {
	return addressId;
}
public void setAddressId(CustomerAddress addressId) {
	this.addressId = addressId;
}
public SimDetailsDTO getSimId() {
	return simId;
}
public void setSimId(SimDetailsDTO simId) {
	this.simId = simId;
}
public CustomerAddress getState() {
	return state;
}
public void setState(CustomerAddress state) {
	this.state = state;
}
public static CustomerDTO ValueOf(CustomerEntity cust) {
	CustomerDTO custdto = new CustomerDTO();
	CustomerIdentityDTO custid = CustomerIdentityDTO.valueOf(cust.getUniqueIdnumber());
	CustomerIdentityDTO custid1 = CustomerIdentityDTO.valueOf(cust.getDateOfBirth());
	CustomerIdentityDTO custid2 = CustomerIdentityDTO.valueOf(cust.getFirstname());
	CustomerIdentityDTO custid3 = CustomerIdentityDTO.valueOf(cust.getLastName());
	CustomerIdentityDTO custid4 = CustomerIdentityDTO.valueOf(cust.getEmailAddress());
	CustomerAddress custad = CustomerAddress.valueOf(cust.getAddressId());
	CustomerAddress custad1= CustomerAddress.valueOf(cust.getState());
	SimDetailsDTO   simdto =SimDetailsDTO.valueOf(cust.getSimId());
	custdto.setUniqueIdnumber(custid);
	custdto.setDateOfBirth(custid1);
	custdto.setEmailAddress(custid4);
	custdto.setFirstname(custid2);
	custdto.setLastName(custid3);
	custdto.setIdType(cust.getIdType());
	custdto.setAddressId(custad1);
	custdto.setSimId(simdto);
	custdto.setState(custad);
	
	return custdto;
	
}
@Override
public String toString() {
	return "CustomerDTO [uniqueIdnumber=" + uniqueIdnumber + ", dateOfBirth=" + dateOfBirth + ", emailAddress="
			+ emailAddress + ", firstname=" + firstname + ", lastName=" + lastName + ", idType=" + idType
			+ ", addressId=" + addressId + ", simId=" + simId + ", state=" + state + "]";
}
}
