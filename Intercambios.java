package Interambio;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Intercambios {
    
    private List<String> lista; // Variable de tipo arreglo donde se guardaran solos las claves
    private Map<String, String> mapa; // Mapa con las claves y valores
    private Map<String, Integer> mapaApariciones; // Mapa para contar las apariciones

    public Intercambios()
    {
        lista = new ArrayList<String>();
        mapa  = new HashMap<>();
        llenarMapa();

    }

    public void llenarMapa()
    {
        mapa.put("a","1");
        mapa.put("b","2");
        mapa.put("c","3");
    }

    public void deMapAArreglo()
    {
        Iterator<String> it = mapa.keySet().iterator();
        while (it.hasNext()) {
            String clave = it.next();
            if(!lista.contains(clave)) {
                lista.add(clave);
            }
        }
    }

    public Map cantidadRepetidas(String palabra) // palabra es ingresada por el usuario
    {

        if (mapaApariciones.containsKey(palabra)) {
            mapaApariciones.put(palabra, mapaApariciones.get(palabra) + 1);
        } else {
            mapaApariciones.put(palabra, 1);
        }
        return mapaApariciones;
    }
    
    public void mostrar()
    {
        Iterator<String> it = mapa.keySet().iterator();
        while (it.hasNext()) {
            String clave = it.next();
            String valor = mapa.get(clave);
            System.out.println("La palabra: " + clave + ", se repitió: " + valor + "veces.");
        }
    }
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class WordCounter {
    
    private List<String> lista; // Variable de tipo arreglo donde se guardaran solos las claves
    private Map<String, String> mapa; // Mapa con las claves y valores
    private Map<String, Integer> mapaApariciones; // Mapa para contar las apariciones

    /**
     * constructor
     */
    public WordCounter() {
        lista = new ArrayList<>();
        mapa = new Responder().getResponseMap();
        mapaApariciones = new HashMap<>();
        deMapAArreglo(); 
    }

    public void deMapAArreglo()
    {
        Iterator<String> it = mapa.keySet().iterator();
        while (it.hasNext()) {
            String clave = it.next();
            if(!lista.contains(clave)) {
                lista.add(clave);
            }
        }
    }

    public Map cantidadRepetidas(String palabra) // palabra es ingresada por el usuario
    {

        if (mapaApariciones.containsKey(palabra)) {
            mapaApariciones.put(palabra, mapaApariciones.get(palabra) + 1);
        } else {
            mapaApariciones.put(palabra, 1);
        }
        return mapaApariciones;
    }
    
    public void mostrar()
    {
        Iterator<String> it = mapaApariciones.keySet().iterator();
        while (it.hasNext()) {
            String clave = it.next();
            int cantidad = mapaApariciones.get(clave);
            System.out.println("La palabra: " + clave + ", se repitió: " + cantidad + " veces.");
        }
    }



}
