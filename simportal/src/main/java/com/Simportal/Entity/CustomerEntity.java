package com.Simportal.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class CustomerEntity {
	@OneToOne(cascade=CascadeType.REFRESH)
	@JoinColumn(name = "uniqueidnumber")
	@Id
	CusotmerIdentityEntity uniqueIdnumber;
	@OneToOne(cascade=CascadeType.REFRESH)
	@JoinColumn(name = "dateofbirth")
	CusotmerIdentityEntity dateOfBirth;
	@OneToOne(cascade=CascadeType.REFRESH)
	@JoinColumn(name = "emailaddresss")
	CusotmerIdentityEntity emailAddress;
	@OneToOne(cascade=CascadeType.REFRESH)
	@JoinColumn(name = "firstname")
	CusotmerIdentityEntity firstname;
	@OneToOne(cascade=CascadeType.REFRESH)
	@JoinColumn(name = "lastname")
	CusotmerIdentityEntity lastName;
	@Column(name="idtype",length = 50,nullable = false)
	String idType;
	@OneToOne(cascade=CascadeType.REFRESH)
	@JoinColumn(name = "customeraddress_addressid")
	CustomerAddressEntity addressId;
	@OneToOne(cascade=CascadeType.REFRESH)
	@JoinColumn(name = "simid")
	SimDetails simId;
	@OneToOne(cascade=CascadeType.REFRESH)
	@JoinColumn(name = "state")
	CustomerAddressEntity state;
	public CusotmerIdentityEntity getUniqueIdnumber() {
		return uniqueIdnumber;
	}
	public void setUniqueIdnumber(CusotmerIdentityEntity uniqueIdnumber) {
		this.uniqueIdnumber = uniqueIdnumber;
	}
	public CusotmerIdentityEntity getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(CusotmerIdentityEntity dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public CusotmerIdentityEntity getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(CusotmerIdentityEntity emailAddress) {
		this.emailAddress = emailAddress;
	}
	public CusotmerIdentityEntity getFirstname() {
		return firstname;
	}
	public void setFirstname(CusotmerIdentityEntity firstname) {
		this.firstname = firstname;
	}
	public CusotmerIdentityEntity getLastName() {
		return lastName;
	}
	public void setLastName(CusotmerIdentityEntity lastName) {
		this.lastName = lastName;
	}
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public CustomerAddressEntity getAddressId() {
		return addressId;
	}
	public void setAddressId(CustomerAddressEntity addressId) {
		this.addressId = addressId;
	}
	public SimDetails getSimId() {
		return simId;
	}
	public void setSimId(SimDetails simId) {
		this.simId = simId;
	}
	public CustomerAddressEntity getState() {
		return state;
	}
	public void setState(CustomerAddressEntity state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "CustomerEntity [uniqueIdnumber=" + uniqueIdnumber + ", dateOfBirth=" + dateOfBirth + ", emailAddress="
				+ emailAddress + ", firstname=" + firstname + ", lastName=" + lastName + ", idType=" + idType
				+ ", addressId=" + addressId + ", simId=" + simId + ", state=" + state + "]";
	}
	
}
