package ThirdPartial;

import java.util.Stack;

public class EjemploPila {
    private Stack<String> pila = new Stack<>();

    // Método para agregar un elemento (PUSH)
    public void push(String item) {
        pila.push(item);
        System.out.println("Elemento agregado: " + item);
    }

    // Método para consultar el elemento en la cima (PEEK)
    public void peek() {
        if (!pila.isEmpty()) {
            System.out.println("Elemento en la cima: " + pila.peek());
        } else {
            System.out.println("La pila está vacía.");
        }
    }

    // Método para eliminar el elemento en la cima (POP)
    public void pop() {
        if (!pila.isEmpty()) {
            System.out.println("Elemento removido: " + pila.pop());
        } else {
            System.out.println("La pila está vacía, no se puede eliminar.");
        }
    }
}