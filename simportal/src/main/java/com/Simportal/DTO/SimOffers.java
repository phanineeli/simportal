package com.Simportal.DTO;

import com.Simportal.Entity.SimOffersEntitity;

public class SimOffers {
Integer offerId;
Integer callQty;
Integer cost;
Integer dataQty;
Integer duration;
String offerName;
SimDetailsDTO simId;
public Integer getOfferId() {
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
public SimDetailsDTO getSimId() {
	return simId;
}
public void setSimId(SimDetailsDTO simId) {
	this.simId = simId;
}
public static SimOffers valueOf(SimOffersEntitity siof) {
	SimOffers simo = new SimOffers();
	simo.setOfferId(siof.getOfferId());
	simo.setOfferName(siof.getOfferName());
	simo.setCallQty(siof.getCallQty());
	simo.setCost(siof.getCost());
	simo.setDataQty(siof.getCallQty());
	simo.setDuration(siof.getDuration());
	SimDetailsDTO simd= SimDetailsDTO.valueOf(siof.getSimId());
	simo.setSimId(simd);
	return simo;
}
@Override
public String toString() {
	return "SimOffers [offerId=" + offerId + ", callQty=" + callQty + ", cost=" + cost + ", dataQty=" + dataQty
			+ ", duration=" + duration + ", offerName=" + offerName + ", simId=" + simId + "]";
}
}
