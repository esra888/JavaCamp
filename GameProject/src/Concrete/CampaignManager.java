package Concrete;

import Abstract.CampaignServiceInterface;
import Entities.Campaign;

public class CampaignManager implements CampaignServiceInterface {
    @Override
    public void add(Campaign campaign) {
        System.out.println("Campaign added. ");
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println("Campaign updated. ");
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println("Campaign deleted. ");
    }
}
