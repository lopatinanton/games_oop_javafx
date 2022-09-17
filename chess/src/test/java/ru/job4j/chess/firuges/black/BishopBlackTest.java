package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BishopBlackTest {

    @Test
    public void position() {
        Figure bishopBlack = new BishopBlack(Cell.A1);
        assertEquals(Cell.A1, bishopBlack.position());
    }

    @Test
    public void copy() {
        Figure bishopBlack = new BishopBlack(Cell.A1);
        Figure bishopBlack1 = new BishopBlack(Cell.B1);
        assertEquals(bishopBlack1.position(), bishopBlack.copy(Cell.B1).position());
    }

    @Test
    public void way() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        Cell[] steps = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertArrayEquals(steps, bishopBlack.way(Cell.G5));
    }

    @Test
    public void isDiagonal() {
        ImpossibleMoveException exception = assertThrows(
                ImpossibleMoveException.class,
                () -> {
                    BishopBlack bishopBlack = new BishopBlack(Cell.C1);
                    bishopBlack.way(Cell.G3);
                });
        assertThat(exception.getMessage()).isEqualTo("Could not move by diagonal from C1 to G3");
    }

}

