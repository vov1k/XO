package io.hexlet.xo;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Game;
import io.hexlet.xo.model.Player;
import io.hexlet.xo.model.Figure;
import io.hexlet.xo.model.exception.AlreadyOccupiedException;
import io.hexlet.xo.model.exception.InvalidPointException;
import io.hexlet.xo.view.ConsoleView;

public class XOCLI {

    public static void main(final String[] args) throws AlreadyOccupiedException, InvalidPointException {
        final String name1 = "name1";
        final String name2 = "name2";

        final Player[] player = new Player[2];
        player[0] = new Player(name1, Figure.X);
        player[1] = new Player(name2, Figure.O);

        final Game xo = new Game(player, new Field(3), "XO");
        ConsoleView cv = new ConsoleView();
        cv.show(xo);
        while(cv.move(xo)) {
            cv.show(xo);
        }
    }

}
