package lesser.fallingsand;

import java.util.Random;


class Sand {
    private final int[][] field;
    private final Random random;
    private int height;
    private int width;

    public Sand(int width, int height) {
        this.height = height;
        this.width = width;
        field = new int[height][width];
        random = new Random();
    }

    public Sand(int width, int height, Random random) {
        this.height = height;
        this.width = width;
        field = new int[height][width];
        this.random = random;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                builder.append(field[y][x]);
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    /**
     * @return the value in field
     */
    public int get(int x, int y) {
        return field[y][x];
    }

    /**
     * Sets the value in field to be 1
     */
    public void put(int x, int y) {
        field[y][x] = 1;
    }

    public void randomSand(int n) {
        for (int i = 0; i < n; i++) {
            int x = random.nextInt(field[0].length);
            int y = random.nextInt(field.length);
            field[y][x] = 1;
        }
    }

    public void fall() {
        for (int y = field.length - 2; y >= 0; y--) {
            for (int x = 0; x < field[y].length; x++) {
                if (field[y][x] == 1) {
                    if (y + 1 < field.length) {
                        if (field[y + 1][x] == 0) {
                            field[y][x] = 0;
                            field[y + 1][x] = 1;
                        } else if (random.nextBoolean()) {
                            if (x + 1 < field[y].length && field[y + 1][x + 1] == 0) {
                                field[y][x] = 0;
                                field[y + 1][x + 1] = 1;
                            }
                        } else {
                            if (x - 1 >= 0 && field[y + 1][x - 1] == 0) {
                                field[y][x] = 0;
                                field[y + 1][x - 1] = 1;
                            }


                        }
                    }
                }
            }

        }
    }
}
