package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface SaleServiceInterface {
    void sale(Player player, Game game);
    void campaignSale(Player player,Game game, Campaign campaign);
}
