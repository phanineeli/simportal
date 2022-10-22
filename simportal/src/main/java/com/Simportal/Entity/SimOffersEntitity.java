package com.Simportal.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="simoffers")
public class SimOffersEntitity {
	@Id
	@Column(name="offerid",nullable=false)
	Integer offerId;
	@Column(name="callqty",nullable=false)
	int callQty;
	@Column(name="cost",nullable=false)
	int cost;
	@Column(name="dataqty",nullable=false)
	int dataQty;
	@Column(nullable=false)
	int duration;
	@Column(name="offername",nullable=false)
	String offerName;
	@OneToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name="simid",nullable=false)
	SimDetails simId;
	public int getOfferId() {
		return offerId;
	}
	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}
	public int getCallQty() {
		return callQty;
	}
	public void setCallQty(int callQty) {
		this.callQty = callQty;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getDataQty() {
		return dataQty;
	}
	public void setDataQty(int dataQty) {
		this.dataQty = dataQty;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getOfferName() {
		return offerName;
	}
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}
	public SimDetails getSimId() {
		return simId;
	}
	public void setSimId(SimDetails simId) {
		this.simId = simId;
	}
}
