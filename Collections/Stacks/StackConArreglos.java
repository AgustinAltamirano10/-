public class ArrayStack<T> {
    private static final int INIT_CAPACITY = 8;
    private T[] array;   // Arreglo que almacena los elementos
    private int size;    // Cantidad de elementos en la pila

    // Constructor
    public ArrayStack() {
        array = (T[]) new Object[INIT_CAPACITY];
        size = 0;
    }

    // Agrega un elemento a la cima de la pila
    public void push(T item) {
        if (size == array.length) {
            resize(2 * array.length); // Duplica tamaño si está llena
        }
        array[size] = item;
        size++;
    }

    // Quita y retorna el elemento de la cima
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("La pila está vacía");
        }
        size--;
        T item = array[size];
        array[size] = null; // Evita fugas de memoria
        return item;
    }

    // Retorna el elemento en la cima sin quitarlo
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("La pila está vacía");
        }
        return array[size - 1];
    }

    // Retorna true si la pila está vacía
    public boolean isEmpty() {
        return size == 0;
    }

    // Método auxiliar para cambiar el tamaño del arreglo
    private void resize(int newCapacity) {
        T[] newArray = (T[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    // Demo de uso
    public static void main(String[] args) {
        ArrayStack<Integer> pila = new ArrayStack<>();

        // Insertando elementos
        pila.push(10);
        pila.push(20);
        pila.push(30);

        // Mostrando el tope
        System.out.println("Tope: " + pila.peek());  // 30

        // Quitando elementos
        System.out.println("Pop: " + pila.pop());    // 30
        System.out.println("Pop: " + pila.pop());    // 20

        // Estado actual
        System.out.println("Tope actual: " + pila.peek()); // 10
    }
}
