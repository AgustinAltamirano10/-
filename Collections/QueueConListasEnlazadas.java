// Clase para representar un nodo en la lista enlazada
class Node {
    int data;  // Dato que contiene el nodo
    Node next; // Referencia al siguiente nodo

    // Constructor para inicializar el nodo
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Clase que implementa una cola (queue) usando una lista enlazada
class LinkedListQueue {
    private Node front; // Apunta al primer nodo (frente de la cola)
    private Node rear;  // Apunta al último nodo (final de la cola)

    // Constructor para inicializar la cola
    public LinkedListQueue() {
        front = null;
        rear = null;
    }

    // Método para agregar un elemento al final de la cola (enqueue)
    public void enqueue(int data) {
        Node newNode = new Node(data); // Crear un nuevo nodo con el dato

        if (rear == null) {  // Si la cola está vacía
            front = newNode; // El nuevo nodo será tanto el frente como el final
            rear = newNode;
        } else {
            rear.next = newNode; // El nodo final actual apunta al nuevo nodo
            rear = newNode;      // El nuevo nodo se convierte en el final de la cola
        }
    }

    // Método para eliminar un elemento del frente de la cola (dequeue)
    public int dequeue() {
        if (isEmpty()) { // Verificamos si la cola está vacía
            throw new IllegalStateException("Queue is empty");
        }

        int dequeuedData = front.data; // Guardamos el dato del nodo que vamos a eliminar
        front = front.next;            // El frente de la cola apunta al siguiente nodo

        if (front == null) { // Si la cola quedó vacía, también el rear debe ser null
            rear = null;
        }

        return dequeuedData; // Devolvemos el dato del nodo eliminado
    }

    // Método para ver el elemento al frente de la cola sin eliminarlo
    public int peek() {
        if (isEmpty()) { // Si la cola está vacía
            throw new IllegalStateException("Queue is empty");
        }
        return front.data; // Devolvemos el dato del nodo al frente de la cola
    }

    // Método para verificar si la cola está vacía
    public boolean isEmpty() {
        return front == null; // Si el frente es null, la cola está vacía
    }
}

// Clase principal para probar la implementación de la cola
public class Main {
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue(); // Crear una nueva cola

        // Usando la cola
        queue.enqueue(10); // Agregar 10 a la cola
        queue.enqueue(20); // Agregar 20 a la cola
        queue.enqueue(30); // Agregar 30 a la cola

        System.out.println("Front element: " + queue.peek()); // Ver el elemento al frente

        System.out.println("Dequeue element: " + queue.dequeue()); // Eliminar y mostrar el elemento al frente

        System.out.println("Front element after dequeue: " + queue.peek()); // Ver el nuevo elemento al frente
    }
}
