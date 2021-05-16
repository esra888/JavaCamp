package MernisServiceAdaptor;

import Abstract.PlayerCheckServiceInterface;
import Entities.Player;
import MernisService.HTLKPSPublicSoap;

public class Adaptors implements PlayerCheckServiceInterface {
    @Override
    public boolean checkIfRealPlayer(Player player) {
        HTLKPSPublicSoap publicSoap = new HTLKPSPublicSoap();

        try {
            return publicSoap.TCKimlikNoDogrula(Long.valueOf(player.nationalityId),player.firstName.toUpperCase(),player.lastName.toUpperCase(),player.dateOfBirth.getYear());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
