package Entities;

import Abstract.EntityInterface;

public class Campaign implements EntityInterface {
    private int campaignId;
    private String campaignName;
    private double discountRate;

    public Campaign() {
    }

    public Campaign(int campaignId, String campaignName, double discountRate) {
        this.campaignId = campaignId;
        this.campaignName = campaignName;
        this.discountRate = discountRate;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public int getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(int campaignId) {
        this.campaignId = campaignId;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}
