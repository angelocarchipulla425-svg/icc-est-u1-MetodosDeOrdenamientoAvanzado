
public class MergeSort {
    

    public static void mergeSort(int[] arr) {
        // Caso base: si el arreglo tiene 1 o 0 elementos, ya está ordenado
        if (arr.length < 2) {
            return;
        }

        // Paso 1: Encontrar la mitad
        int medio = arr.length / 2;
        
        // Creamos los arreglos para la mitad izquierda y derecha
        int[] izquierda = new int[medio];
        int[] derecha = new int[arr.length - medio];

        // Llenamos los sub-arreglos con los datos originales
        for (int i = 0; i < medio; i++) {
            izquierda[i] = arr[i];
        }
        for (int i = medio; i < arr.length; i++) {
            derecha[i - medio] = arr[i];
        }

        // Recursividad: ordenamos ambas mitades
        mergeSort(izquierda);
        mergeSort(derecha);

        // Paso 2 y 3: Mezclamos las mitades ya ordenadas en el arreglo original
        mezclar(arr, izquierda, derecha);
    }

    private static void mezclar(int[] arrOriginal, int[] izquierda, int[] derecha) {
        int i = 0, j = 0, k = 0;

        // Comparamos elementos de izquierda y derecha
        while (i < izquierda.length && j < derecha.length) {
            if (izquierda[i] <= derecha[j]) {
                arrOriginal[k++] = izquierda[i++];
            } else {
                arrOriginal[k++] = derecha[j++];
            }
        }

        // Si sobraron elementos en la izquierda, los copiamos
        while (i < izquierda.length) {
            arrOriginal[k++] = izquierda[i++];
        }

        // Si sobraron elementos en la derecha, los copiamos
        while (j < derecha.length) {
            arrOriginal[k++] = derecha[j++];
        }
    }

    

}