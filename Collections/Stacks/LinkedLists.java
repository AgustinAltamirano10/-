package Collections.Stacks;
import java.util.Iterator;
import java.util.Stack; // importo paquetespara usar pilas



public class LinkedLists {
    public static void main(String[] args) {
        // Declaracion de una pila
        Stack<Integer> pila = new Stack<Integer>();

        // Comprobar si la pila esta vacia
        System.out.println("¿Está Vacía? " + pila.isEmpty());

        // Agregar elementos
        pila.push(1); // Incide 0
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);


        // Recorrer la pila por incice
        System.out.println("----------------------- FOR -----------------------");
        for (int i = 0; i < pila.size(); i++) {
            Integer p = pila.get(i);
            System.out.println(p);
        }

        System.out.println("----------------------- FOREACH -----------------------");
        // Recorrer elemento por elemento con foreach
        for (Integer p : pila) {
            System.out.println(p);
        }


        // Recorrer la pila con iterator
        System.out.println("----------------------- ITERATOR -----------------------");
        Iterator<Integer> it = pila.iterator();
        while (it.hasNext()) {
            Integer p = it.next();
            System.out.println(p);
        }

        // Eliminar el ultimo registro que entro
        pila.pop();

        // Buscar un elemento
        System.out.println("¿en que posicion esta el 3?: " + pila.search(3));

        // ver el tope de la pila
        System.out.println("Tope: " + pila.peek());

    }  
}
