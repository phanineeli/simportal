package com.Simportal.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customeridentity")
public class CusotmerIdentityEntity {
	 @Id
	 @Column(name="uniqueidnumber")
	 long uniqueIdNumber;
	 @Column(name="dateofbirth")
	 LocalDate dateOfBirth;
	 @Column(name="firstname")
	 String firstName;
	 @Column(name="lastname")
	 String LastNAme;
	 @Column(name="emailaddress")
	 String emailAddress;
	 @Column(name = "state")
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
}
