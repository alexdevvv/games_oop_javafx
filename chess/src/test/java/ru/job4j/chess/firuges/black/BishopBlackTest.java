package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack bishopBlack = new BishopBlack(Cell.B1);
        assertThat(bishopBlack.position(), is(Cell.B1) );

    }

    @Test
    public void copy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.B1);
        Figure expect = bishopBlack.copy(Cell.C3);
        assertThat(expect.position(), is(Cell.C3));
    }

    @Test
    public void way() {
        Figure figure = new BishopBlack(Cell.C1);
        Cell[] expect = figure.way(Cell.G5);
        assertThat(expect, is(new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }
}