package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }



    @Override
    public Cell[] way(Cell dest) {
        int size = ;
        Cell[] steps = new Cell[size];
        int deltaX = ...;
        int deltaY = ...;
        for (int index = 0; index < size; index++) {
            steps[index] = ...
        }
        return steps;
    }

//    @Override
//    public Cell[] way(Cell dest) {
//        Cell[] newCell = new Cell[];
//
//        throw new ImpossibleMoveException(
//                String.format("Could not way by diagonal from %s to %s", position, dest)
//
//        );
//    }

    public boolean isDiagonal(Cell source, Cell dest) {
        return false;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
