package Concrete;

import Abstract.SaleServiceInterface;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class SaleManager implements SaleServiceInterface {
    @Override
    public void sale(Player player, Game game) {
        System.out.println("The customer purchased " + game.getName() + " for this price " + game.getPrice());
    }

    @Override
    public void campaignSale(Player player, Game game, Campaign campaign) {
        System.out.println("The customer purchased " + game.getName() + " for this price " + (game.getPrice() - (game.getPrice() * campaign.getDiscountRate() /100)) + " by using " + campaign.getCampaignName() + " campaign");
    }

}
