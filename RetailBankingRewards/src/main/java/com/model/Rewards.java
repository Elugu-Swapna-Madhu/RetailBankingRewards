package com.model;

public class Rewards {
	
	private double RewardId;
	private String RewardName;
	private String RewardCode;
	private String RewardStatus;
	private String RewardDescription;
	private String RewardExpiryDate;
	
	public double getRewardId() {
		return RewardId;
	}
	public void setRewardId(double rewardId) {
		RewardId = rewardId;
	}
	public String getRewardName() {
		return RewardName;
	}
	public void setRewardName(String rewardName) {
		RewardName = rewardName;
	}
	public String getRewardCode() {
		return RewardCode;
	}
	public void setRewardCode(String rewardCode) {
		RewardCode = rewardCode;
	}
	public String getRewardStatus() {
		return RewardStatus;
	}
	public void setRewardStatus(String rewardStatus) {
		RewardStatus = rewardStatus;
	}
	public String getRewardDescription() {
		return RewardDescription;
	}
	public void setRewardDescription(String rewardDescription) {
		RewardDescription = rewardDescription;
	}
	public String getRewardExpiryDate() {
		return RewardExpiryDate;
	}
	public void setRewardExpiryDate(String rewardExpiryDate) {
		RewardExpiryDate = rewardExpiryDate;
	}
	
	
	public Rewards(double rewardId, String rewardName, String rewardCode, String rewardStatus, String rewardDescription,
			String rewardExpiryDate) {
		super();
		RewardId = rewardId;
		RewardName = rewardName;
		RewardCode = rewardCode;
		RewardStatus = rewardStatus;
		RewardDescription = rewardDescription;
		RewardExpiryDate = rewardExpiryDate;
	}
	public Rewards() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Rewards [RewardId=" + RewardId + ", RewardName=" + RewardName + ", RewardCode=" + RewardCode
				+ ", RewardStatus=" + RewardStatus + ", RewardDescription=" + RewardDescription + ", RewardExpiryDate="
				+ RewardExpiryDate + "]";
	}

	
}
