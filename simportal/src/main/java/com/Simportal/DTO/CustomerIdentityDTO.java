package com.Simportal.DTO;

import java.time.LocalDate;

import com.Simportal.Entity.CusotmerIdentityEntity;

public class CustomerIdentityDTO {
 long uniqueIdNumber;
 LocalDate dateOfBirth;
 String firstName;
 String LastNAme;
 String emailAddress;
 String state;
public long getUniqueIdNumber() {
	return uniqueIdNumber;
}
public void setUniqueIdNumber(long uniqueIdNumber) {
	this.uniqueIdNumber = uniqueIdNumber;
}
public LocalDate getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(LocalDate dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastNAme() {
	return LastNAme;
}
public void setLastNAme(String lastNAme) {
	LastNAme = lastNAme;
}
public String getEmailAddress() {
	return emailAddress;
}
public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public static CustomerIdentityDTO valueOf(CusotmerIdentityEntity custid) {
	CustomerIdentityDTO cuid =new CustomerIdentityDTO();
	cuid.setUniqueIdNumber(custid.getUniqueIdNumber());
	cuid.setDateOfBirth(custid.getDateOfBirth());
	cuid.setFirstName(custid.getFirstName());
	cuid.setLastNAme(custid.getLastNAme());
	cuid.setEmailAddress(custid.getEmailAddress());
	cuid.setState(custid.getState());
	return cuid;
}
@Override
public String toString() {
	return "CustomerIdentityDTO [uniqueIdNumber=" + uniqueIdNumber + ", dateOfBirth=" + dateOfBirth + ", firstName="
			+ firstName + ", LastNAme=" + LastNAme + ", emailAddress=" + emailAddress + ", state=" + state + "]";
}
}

