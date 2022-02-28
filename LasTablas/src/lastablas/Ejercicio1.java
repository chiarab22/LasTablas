package lastablas;

public class Ejercicio1 {
    private int[] arr = new int[11];

    public void cuentaAtras(){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.println(arr[i]);
        }

        System.out.println();
        for (int i = arr.length -1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
