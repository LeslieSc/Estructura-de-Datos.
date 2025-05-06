package ThirdPartial;

import java.util.LinkedList;
import java.util.Queue;

public class EjemploCola {
    private Queue<String> cola = new LinkedList<>();

    // Método para agregar un cliente a la cola (ENQUEUE)
    public void add(String cliente) {
        cola.add(cliente);
        System.out.println("Cliente agregado: " + cliente);
    }

    // Método para consultar el cliente al frente (PEEK)
    public void peek() {
        if (!cola.isEmpty()) {
            System.out.println("Cliente al frente: " + cola.peek());
        } else {
            System.out.println("La cola está vacía.");
        }
    }

    // Método para atender (eliminar) al cliente al frente (DEQUEUE)
    public void poll() {
        if (!cola.isEmpty()) {
            System.out.println("Atendiendo a: " + cola.poll());
        } else {
            System.out.println("No hay clientes para atender.");
        }
    }
}
