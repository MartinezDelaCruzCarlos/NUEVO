package cap_6.pkg2;

/*
 * @author Martinez De la Cruz Carlos
 */
public class CAP_62 {

    public static void main(String[] args) {
        int array[] = {54, 43, 32, 21, 98, 76, 54, 42, 41, 71, 3, 0};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        ordenacionShell(array);
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void ordenacionShell(int a[]) {
        int intervalo, i, j, k;
        int n = a.length;
        intervalo = n / 2;
        while (intervalo > 0) {
            for (i = intervalo; i < n; i++) {
                j = i - intervalo;
                while (j >= 0) {
                    k = j + intervalo;
                    if (a[j] <= a[k]) {
                        j = -1; // par de elementos ordenado
                    } else {
                        intercambiar(a, j, j + 1);
                        j -= intervalo;
                    }
                }
            }
            intervalo = intervalo / 2;
        }
    }

    public static void intercambiar(int[] a, int i, int j) {
        int aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }
}
