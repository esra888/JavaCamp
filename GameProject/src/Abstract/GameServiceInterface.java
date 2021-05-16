package Abstract;

import Entities.Game;
import Entities.Player;

public interface GameServiceInterface {
    void add(Game game);
    void delete(Game game);
    void update(Game game);
}
