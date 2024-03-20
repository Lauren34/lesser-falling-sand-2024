package lesser.fallingsand;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

class SandTest {

    @Test
    public void fallToTheRight() {
        // given
        Sand sand = new Sand(3, 3);
        sand.put(1, 1);
        sand.put(1, 0);

        // when
        sand.fall();

        // then
        assertEquals("000\n000\n011\n", sand.toString());
    }

    @Test
    public void fallToTheLeft() {
        // given
        Sand sand = new Sand(3, 3);
        sand.put(1, 1);
        sand.put(1, 2);

        // when
        sand.fall();

        // then
        assertEquals("000\n000\n110\n", sand.toString());
    }

    @Test
    public void fallRandomDirectionRight() {
        // given
        Random random = mock(Random.class);
        doReturn(true).when(random).nextBoolean();
        Sand sand = new Sand(3, 3, random);
        sand.put(1, 1);
        sand.put(1, 2);

        // when
        sand.fall();

        // then
        assertEquals("000\n000\n011\n", sand.toString());
    }

    @Test
    public void fallRandomDirectionLeft() {
        // given
        Random random = mock(Random.class);
        doReturn(false).when(random).nextBoolean();
        Sand sand = new Sand(3, 3, random);
        sand.put(1, 1);
        sand.put(1, 2);

        // when
        sand.fall();

        // then
        assertEquals("000\n000\n110\n", sand.toString());
    }

    @Test
    public void fallSimultaneously() {
        // given
    }
}
