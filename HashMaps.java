package Interambio;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap; // importo paquetespara usar listas
import java.util.Map;


public class HashMaps {
    public static void main(String[] args) {
        
        // Declaracion del hash map     
        Map<Integer, String> mapa = new HashMap<>();

        // Agregar un par clave-valor
        mapa.put(1234, "Jorge");
        mapa.put(5678, "carlos");
        mapa.put(9057, "kiko");
        
        // verifica si el mapa contiene el valor especificado
        System.out.println("¿Esta el nombre Jorge?: " + mapa.containsValue("Jorge"));
        System.out.println("¿Esta el nombre Jorge?: " + mapa.containsValue("kikito"));

        // verifica si el mapa contiene la clave especificada
        System.out.println("¿Esta el valor 1234?: " + mapa.containsKey(1234));
        System.out.println("¿Esta el valor 12345?: " + mapa.containsKey(1456));

        // Devuelve una coleccion de todos los valores que contiene el map
        System.out.println("-------------------------- Valores del mapa --------------------------");
        System.out.println(mapa.values());

        System.out.println("-------------------------- Claves del mapa --------------------------");
        // Devuelve un Set de todas las clave en el map
        System.out.println(mapa.keySet());

        System.out.println("----------------------------------------------------");
        // Devuelve el valor asociado a la clave
        System.out.println("La persona buscada es: " + mapa.get(1234));

        // Eliminar
        mapa.remove(1234);

        // Recorreridos del Map
        System.out.println("----------------------- FOR -----------------------");
        List<Integer> claves = new ArrayList<>(mapa.keySet());
        for (int i = 0; i < claves.size(); i++) {
            Integer clave = claves.get(i);
            String valor = mapa.get(clave);
            System.out.println("Clave: " + clave + ", Valor: " + valor);
        }


        System.out.println("----------------------- FOREACH -----------------------");
        // Recorrer usando solo las claves
        for (Integer clave : mapa.keySet()) {
            String valor = mapa.get(clave);
            System.out.println("Clave: " + clave + ", Valor: " + valor);
        }

        System.out.println("----------------------- ITERATOR -----------------------");
        Iterator<Integer> it = mapa.keySet().iterator();
        while (it.hasNext()) {
            Integer clave = it.next();
            String valor = mapa.get(clave);
            System.out.println("Clave: " + clave + ", Valor: " + valor);
        }


    }
}
