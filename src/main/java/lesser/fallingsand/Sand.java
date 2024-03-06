package lesser.fallingsand;

public class Sand {
    private int[][] field= new int [3] [3];

    public Sand(int cols, int rows) {
        this.field = new int[rows][cols];
    }

    public Sand() {

    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int y = 0; y < field.length; y++) {
            for (int x = 0; x < field[y].length; x++) {
                builder.append(field[y][x]);
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    public int get(int x, int y) {
        return field[y][x];
    }

    public void put(int x, int y) {
            field[y][x] = 1;
        }


    public void fall() {
        int[][] nextField = new int[field.length][field[0].length];
        for (int y = field.length - 2; y >= 0; y--) {
            for (int x = 0; x < field[y].length; x++) {
                if (field[y][x] == 1 && y < 2 && field[y + 1][x] == 0) {
                    field[y + 1][x] = 1;
                    if (y < field.length - 1 && field[y + 1][x] == 0) { // If the cell below is empty
                        field[y + 1][x] = 1;
                        field[y][x] = 0;


                    }
                }
            }
        }
    }
}
