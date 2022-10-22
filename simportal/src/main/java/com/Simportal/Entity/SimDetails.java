package com.Simportal.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="simdetails")
public class SimDetails {
	@Id
	@Column(name="simid",nullable = false)
	Integer simId;
	@Column(name="servicenumber",nullable = false)
	long serviceNumber;
	@Column(name="simnumber",nullable = false)
	long simNumber;
	@Column(name="simstatus",nullable = false, length = 50)
	String simStatus;
	public int getSimId() {
		return simId;
	}
	public void setSimId(int simId) {
		this.simId = simId;
	}
	public long getServiceNumber() {
		return serviceNumber;
	}
	public void setServiceNumber(long serviceNumber) {
		this.serviceNumber = serviceNumber;
	}
	public long getSimNumber() {
		return simNumber;
	}
	public void setSimNumber(long simNumber) {
		this.simNumber = simNumber;
	}
	public String getSimStatus() {
		return simStatus;
	}
	public void setSimStatus(String simStatus) {
		this.simStatus = simStatus;
	}
}
