package lastablas;

public class Ejercicio6 {
    private final int TAMAÑO = 3;
    private int i, j, val;
    int[][] tab2d = new int[TAMAÑO][TAMAÑO];

    public void queHace(){
        val = 1;
        for (int j = 0; j < TAMAÑO; j++) {
            for (int i = 0; i < TAMAÑO; i++) {
              tab2d[j][i] = val;
              val++;
              System.out.print(tab2d[j][i]);
            }
            System.out.println();
        }

    }
}
