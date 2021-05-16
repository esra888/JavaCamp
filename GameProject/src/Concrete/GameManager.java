package Concrete;

import Abstract.GameServiceInterface;
import Entities.Game;

public class GameManager implements GameServiceInterface {
    @Override
    public void add(Game game) {
        System.out.println("Game added.");
    }

    @Override
    public void delete(Game game) {
        System.out.println("Game deleted ");
    }

    @Override
    public void update(Game game) {
        System.out.println("Game updated ");
    }
}
