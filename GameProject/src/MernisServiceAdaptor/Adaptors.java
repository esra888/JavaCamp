package MernisServiceAdaptor;

import Abstract.PlayerCheckServiceInterface;
import Entities.Player;
import MernisService.HTLKPSPublicSoap;

public class Adaptors implements PlayerCheckServiceInterface {
    @Override
    public boolean checkIfRealPlayer(Player player) {
        HTLKPSPublicSoap publicSoap = new HTLKPSPublicSoap();

        try {
            return publicSoap.TCKimlikNoDogrula(Long.valueOf(player.getNationalityId()),player.getFirstName().toUpperCase(),player.getLastName().toUpperCase(),player.getDateOfBirth().getYear());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
