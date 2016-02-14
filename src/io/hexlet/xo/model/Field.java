package io.hexlet.xo.model;

import io.hexlet.xo.model.exception.AlreadyOccupaiedException;
import io.hexlet.xo.model.exception.InvalidPointException;

import java.awt.*;

public class Field {

    private final int FIELD_SIZE = 3;

    private final int MIN_COORDINATE = 0;

    private final int MAX_COORDINATE = FIELD_SIZE;


    private final Figure[][] field = new Figure[FIELD_SIZE][FIELD_SIZE];

    public int getSize() {
        return FIELD_SIZE;
    }

    public Figure getFigure(final Point point) throws InvalidPointException {
        if(!checkPoint(point)) {
            throw new InvalidPointException();
        }
        return field[point.x][point.y];
    }

    public void setFigure(final Point point, final Figure figure) throws InvalidPointException, AlreadyOccupaiedException {
        if(!checkPoint(point)) {
            throw new InvalidPointException();
        }

        if(field[point.x][point.y] != null) {
            throw new AlreadyOccupaiedException();
        }

        field[point.x][point.y] = figure;
    }

    private boolean checkPoint(final Point point) {
        return checkCoordinate(point.x) && checkCoordinate(point.y);
    }

    private boolean checkCoordinate(final int coordinate) {
        return coordinate >= MIN_COORDINATE && coordinate < FIELD_SIZE;
    }
}
