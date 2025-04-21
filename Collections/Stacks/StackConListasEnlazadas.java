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

// Clase que implementa un stack usando una lista enlazada
class LinkedListStack {
    private Node top; // Apunta al nodo superior del stack

    // Constructor para inicializar el stack
    public LinkedListStack() {
        this.top = null;
    }

    // Método para agregar un elemento al stack
    public void push(int data) {
        Node newNode = new Node(data); // Crear un nuevo nodo
        newNode.next = top;            // El nuevo nodo apunta al nodo superior
        top = newNode;                 // El nuevo nodo se convierte en el top
    }

    // Método para eliminar el elemento superior del stack
    public int pop() {
        if (isEmpty()) { // Verificamos si el stack está vacío
            throw new IllegalStateException("Stack is empty");
        }
        int poppedData = top.data;   // Guardamos el valor del nodo superior
        top = top.next;              // El top apunta al siguiente nodo
        return poppedData;           // Devolvemos el dato del nodo eliminado
    }

    // Método para obtener el elemento superior sin eliminarlo
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.data; // Devolvemos el dato del nodo superior
    }

    // Método para verificar si el stack está vacío
    public boolean isEmpty() {
        return top == null; // Si el top es null, el stack está vacío
    }
}

// Clase principal para probar el stack
public class Main {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack(); // Crear un stack

        // Usando el stack
        stack.push(10); // Agregar 10 al stack
        stack.push(20); // Agregar 20 al stack
        stack.push(30); // Agregar 30 al stack

        System.out.println("Top element: " + stack.peek()); // Ver el elemento superior

        System.out.println("Pop element: " + stack.pop()); // Eliminar y mostrar el elemento superior

        System.out.println("Top element after pop: " + stack.peek()); // Ver el nuevo elemento superior
    }
}

