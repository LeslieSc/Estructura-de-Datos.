package ThirdPartial;

public class ThirdPartialMain {
    public static void main(String[] args) {
        EjemploPila pila = new EjemploPila();

        pila.push("Plato 1");
        pila.push("Plato 2");
        pila.push("Plato 3");

        pila.peek();   // Muestra el elemento en la cima
        pila.pop();   // Elimina el elemento en la cima
        pila.pop();   // Elimina el siguiente
        pila.peek();   // Muestra el nuevo elemento en la cima

        EjemploCola cola = new EjemploCola();

        cola.add("Cliente 1");
        cola.add("Cliente 2");
        cola.add("Cliente 3");
        cola.add("Cliente 4");

        cola.peek();  // Mostrar cliente al frente
        cola.poll();  // Atender cliente 1
        cola.poll();  // Atender cliente 2
        cola.peek();  // Mostrar nuevo cliente al frente (Cliente 3)
        
    }

}
