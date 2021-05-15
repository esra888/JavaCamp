package Abstract;

import Entities.Campaign;
import Entities.Player;
import Entities.Sale;

public interface SaleServiceInterface {
    void sale(Sale sale,Player player);
    void sale(Sale sale, Player player, Campaign campaign);
}
