package com.Simportal.DTO;

import com.Simportal.Entity.SimDetails;

public class SimDetailsDTO {
	Integer simId;
	long serviceNumber;
	long simNumber;
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
	@Override
	public String toString() {
		return "SimDetailsDTO [simId=" + simId + ", serviceNumber=" + serviceNumber + ", simNumber=" + simNumber
				+ ", simStatus=" + simStatus + "]";
	}
	public static SimDetailsDTO valueOf(SimDetails sim) {
		SimDetailsDTO simdto = new SimDetailsDTO();
		simdto.setSimId(sim.getSimId());
		simdto.setServiceNumber(sim.getServiceNumber());
		simdto.setSimNumber(sim.getSimNumber());
		simdto.setSimStatus(sim.getSimStatus());
		return simdto;
	}

}
