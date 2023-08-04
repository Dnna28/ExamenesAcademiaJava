import java.util.LinkedList;

public class EjemploLinkedList {
    public static void main(String[] args) {
        // Crear una LinkedList de enteros
        LinkedList<Integer> miLinkedList = new LinkedList<>();

        // Agregar elementos a la LinkedList
        miLinkedList.add(10);
        miLinkedList.add(20);
        miLinkedList.add(30);

        // Acceder a elementos de la LinkedList
        int primerElemento = miLinkedList.get(0); // 10

        // Iterar sobre la LinkedList
        for (int numero : miLinkedList) {
            System.out.println(numero);
        }
    }
}
