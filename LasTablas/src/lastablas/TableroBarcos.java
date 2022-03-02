package lastablas;

public class TableroBarcos {
    private final int SIZE = 4;
    protected char[][] tablero = new char[SIZE][SIZE];

    protected final char desconocido = '?';
    protected final char agua = '~';
    private int filaGanadora;
    private int colGanadora;

    protected boolean win;

    public TableroBarcos(char[][] tablero, int filaGanadora, int colGanadora) {
        this.tablero = tablero;
        this.filaGanadora = filaGanadora;
        this.colGanadora = colGanadora;
    }

    public TableroBarcos() {
    }

    public char[][] getTablero() {
        return tablero;
    }

    public int getFilaGanadora() {
        return filaGanadora;
    }

    public int getColGanadora() {
        return colGanadora;
    }

    public void setWin(boolean win) {
        this.win = win;
}

    public TableroBarcos generarTablero() {
        filaGanadora = (int)(Math.random()*4);
        colGanadora = (int)(Math.random()*4);
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                tablero[i][j] = desconocido;
            }
        }
        return new TableroBarcos(tablero, filaGanadora, colGanadora);
    }


    public void modificarTablero(int fila, int col){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(fila==i&&col==j){
                    tablero[i][j] = agua;
                }
            }

        }
    }


    public void imprimirTablero(TableroBarcos tab) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(tab.getTablero()[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean heGanado() {
        return win;
    }
}
