package com.reskill.user.dto;

public class BuyerDTO {
	
	private String buyerId;
	private String name;
	private String email;
	private long phoneNumber;
	private boolean isPrivileged;
	private float rewardPoints;
	private boolean isActive;
	public String getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public boolean isPrivileged() {
		return isPrivileged;
	}
	public void setPrivileged(boolean isPrivileged) {
		this.isPrivileged = isPrivileged;
	}
	public float getRewardPoints() {
		return rewardPoints;
	}
	public void setRewardPoints(float rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	

}
