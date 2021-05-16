import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.PlayerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;
import MernisServiceAdaptor.Adaptors;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PlayerManager playerManager = new PlayerManager(new Adaptors());
        Player player = new Player(1,"ad","soyad", LocalDate.of(1987,7,20),"34162873868");


        if(playerManager.Check(player)) {

            playerManager.add(player);
            GameManager gameManager = new GameManager();
            Game game = new Game(1, "logoextreme", 100);
            gameManager.add(game);

            CampaignManager campaignManager = new CampaignManager();
            Campaign campaign = new Campaign(1, "code", 30);
            campaignManager.add(campaign);

            SaleManager saleManager = new SaleManager();
            saleManager.sale(player, game);
            saleManager.campaignSale(player, game, campaign);
        } else{

            System.out.println("please enter real person.");
        }
    }
}


