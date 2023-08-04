import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {
        // Crear un ArrayList de enteros
        ArrayList<Integer> miArrayList = new ArrayList<>();

        // Agregar elementos al ArrayList
        miArrayList.add(10);
        miArrayList.add(20);
        miArrayList.add(30);

        // Acceder a elementos del ArrayList
        int primerElemento = miArrayList.get(0); // 10

        // Iterar sobre el ArrayList
        for (int numero : miArrayList) {
            System.out.println(numero);
        }
    }
}
