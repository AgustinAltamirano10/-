package Interambio;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List; // Importo el paquete apra usar listas

public class ArrayLists {
    public static void main(String[] args) {
        
        List<Persona> lista = new ArrayList<Persona>(); // Declaracion de la lista a utiliza
        Persona person = new Persona(1, "kiko", 21);
        Persona person1 = new Persona(2, "messi", 22);
        Persona person2 = new Persona(3, "rony", 23);
        Persona person3 = new Persona(4, "juan", 24);

        lista.add(person); // Agrego un elemento a la lista del tipo Persona
        lista.add(person1);
        lista.add(person2);
        lista.add(person3);

        // Recorrer la lista por incice
        System.out.println("----------------------- FOR -----------------------");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNombre()); // Muestra todos los nombres de los elementos de la lista
        }

        System.out.println("----------------------- FOREACH -----------------------");
        // Recorrer elemento por elemento con foreach
        for (Persona perso:lista) { // por cada perona(perso) que este dentro de la lista hacer:
            System.out.println(perso.getNombre());
        }


        // Recorrer la lista con iterator
        System.out.println("----------------------- ITERATOR -----------------------");
        Iterator<Persona> iterador = lista.iterator();
        while (iterador.hasNext()) {
            Persona p = iterador.next();
            System.out.println(p.getNombre());
        }

        // Métodos
        // Tamaño lista
        System.out.println("Tamaño: " + lista.size());

        // Obtener primero y ultimo
        System.out.println("Primer elemento: " + lista.get(0).toString());
        System.out.println("segundo elemento: " + lista.get(1).toString());

        // Borrar toda la lista
        lista.clear();

        // Comprobar si la lista esta vacia
        System.out.println("¿Está Vacia? " + lista.isEmpty());
    }
}
