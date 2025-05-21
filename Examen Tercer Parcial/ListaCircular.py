class NodoCircular:
    def __init__(self, dato):
        self.dato = dato
        self.siguiente = None

class ListaCircular:
    def __init__(self):
        self.cabeza = None

    def insertar(self, dato):
        nuevo = NodoCircular(dato)
        if not self.cabeza:
            self.cabeza = nuevo
            nuevo.siguiente = nuevo
        else:
            actual = self.cabeza
            while actual.siguiente != self.cabeza:
                actual = actual.siguiente
            actual.siguiente = nuevo
            nuevo.siguiente = self.cabeza

    def mostrar(self):
        if not self.cabeza:
            print("Lista vacía")
            return
        actual = self.cabeza
        while True:
            print(actual.dato, end=" -> ")
            actual = actual.siguiente
            if actual == self.cabeza:
                break
        print("(vuelve al inicio)")

# Ejemplo de uso
lista = ListaCircular()
lista.insertar(10)
lista.insertar(20)
lista.insertar(30)
lista.mostrar()  # Salida: 10 -> 20 -> 30 -> (vuelve al inicio)
