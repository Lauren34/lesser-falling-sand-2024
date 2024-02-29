package lesser.fallingsand;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class sandTest {

    @Test
    public void string() {
        //give
        Sand sand = new Sand();

        //when
        String actual = sand.toString();
        //then
        assertEquals("000\n000\n000\n", actual);
    }

    @Test
    public void put() {
        //give
        Sand sand = new Sand();

        //when
        sand.put(1, 0);

        //then
        assertEquals("000\n000\n000\n", sand.toString());

    }

    @Test
    public void fall() {
        //give
        Sand sand = new Sand();

        //when
        sand.put(1, 0);

        //then
        assertEquals("000\n000\n000\n", sand.toString());
    }

    @Test
    public void fallOnGround() {
        //give
        Sand sand = new Sand();

        //when
        sand.put(1, 2);

        //then
        assertEquals("000\n000\n000\n", sand.toString());
    }

    @Test
    public void fallOnOtherSand() {
        //give
        Sand sand = new Sand();
        sand.put(1, 1);
        sand.put(1, 2);

        //when
        sand.fall();

        //then
        assertEquals("000\n010\n000\n", sand.toString());
    }
}