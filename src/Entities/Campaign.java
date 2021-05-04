package Entities;

public class Campaign {
	
	String campaignName;
	int discountAmount;
	
	
	public Campaign(String campaignName, int discountAmount) {
		super();
		this.campaignName = campaignName;
		this.discountAmount = discountAmount;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public int getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(int discountAmount) {
		this.discountAmount = discountAmount;
	}

}
