package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack bb = new BishopBlack(Cell.B1);
        assertThat(bb.position(), is(Cell.B1));

    }

    @Test
    public void copy() {
        BishopBlack bb = new BishopBlack(Cell.B1);
        BishopBlack bb2 = (BishopBlack) bb.copy(Cell.D3);
        assertThat(bb2.position(), is(Cell.D3));
    }

    @Test
    public void way() {
        BishopBlack bb = new BishopBlack(Cell.C1);
        Cell[] cells = bb.way(Cell.G5);
        Cell[] expect = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(expect, is(cells));
    }

    @Test
    public void isDiagonal() {
        BishopBlack bb = new BishopBlack(Cell.C1);
        boolean expect = bb.isDiagonal(bb.position(), Cell.H6);
        assertThat(expect, is(true));

    }
}