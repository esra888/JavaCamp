package Concrete;

import Abstract.PlayerCheckServiceInterface;
import Abstract.PlayerServiceInterface;
import Entities.Player;

public class PlayerManager implements PlayerServiceInterface {

    private PlayerCheckServiceInterface playerCheckServiceInterface;
    public PlayerManager(PlayerCheckServiceInterface playerCheckServiceInterface) {
        this.playerCheckServiceInterface = playerCheckServiceInterface;
    }

    @Override
    public void add(Player player) {
        if(Check(player)) {
            System.out.println("Added to db : " + player.firstName);
        }else {
            System.out.println("Player is not valid.");
        }
    }

    @Override
    public void update(Player player) {
        if(Check(player)) {
            System.out.println("Player updated : " + player.firstName);
        }else {
            System.out.println("Player is not valid.");
        }
    }

    @Override
    public void delete(Player player) {
        if(Check(player)) {
            System.out.println("Deleted from db : " + player.firstName);
        }else {
            System.out.println("Player is not valid.");
        }
    }

    public boolean Check(Player player) {
        if(playerCheckServiceInterface.checkIfRealPlayer(player)) {
            return true;
        }else {
            return false;
        }
    }
}
