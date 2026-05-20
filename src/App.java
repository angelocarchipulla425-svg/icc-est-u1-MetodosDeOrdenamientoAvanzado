public class App {
    public static void main(String[] args) throws Exception {
        
        //Arreglo inicial
        int[] numeros = {38, 27, 43, 3, 9, 82, 10};

        //Llamada a merge sort
        MergeSort.mergeSort(numeros);
        // Mostrar arreglo ordenado

        System.out.println("Arreglo ordenado");

        for(int num : numeros){
            System.out.println(num + "");
        }

    }
}
