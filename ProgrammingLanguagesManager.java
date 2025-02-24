import java.util.ArrayList;

class ProgrammingLanguagesManager {
    /**
     * Maneja un ArrayList de lenguajes de programación.
     */
    public void execute() {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");
        languages.add("Ruby");

        // Eliminar el lenguaje menos conocido
        languages.remove("Ruby");

        // Editar un lenguaje agregando "(actualmente)"
        languages.set(0, languages.get(0) + " (actualmente)");

        // Imprimir tamaño del ArrayList
        System.out.println("Tamaño actual: " + languages.size());

        // Eliminar todos los elementos
        languages.clear();
        System.out.println("Tamaño después de eliminar todo: " + languages.size());
    }

}


