package lastablas;

public class Tablero {
    private final int TAMAÑO =4;
    char[][] tablero = new char[TAMAÑO][TAMAÑO];
    final char desconocido = '?';

    public Tablero(char[][] tablero) {
        this.tablero = tablero;
    }

    public Tablero() {
    }

    public Tablero generarTablero(){
        for (int i = 0; i < TAMAÑO; i++) {
            for (int j = 0; j < TAMAÑO; j++) {
                tablero[i][j] = desconocido;
            }
        }
        return new Tablero(tablero);
    }
}
