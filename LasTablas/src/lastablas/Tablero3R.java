package lastablas;

public class Tablero3R {
    private final int SIZE = 4;
    protected char[][] tablero = new char[SIZE][SIZE];

    private final char x = 'x';
    private final char o = 'o';
    private final char VACIA = '_';

    public Tablero3R() {
    }

    public Tablero3R(char[][] tablero) {
        this.tablero = tablero;
    }

    public Tablero3R generarTablero() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                tablero[i][j] = VACIA;
            }
        }
        return new Tablero3R(tablero);
    }
 
}
