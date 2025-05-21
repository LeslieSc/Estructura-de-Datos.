class NodoDoble:
    def __init__(self, dato):
        self.dato = dato
        self.siguiente = None
        self.anterior = None

class ListaDoble:
    def __init__(self):
        self.cabeza = None

    def insertar(self, dato):
        nuevo = NodoDoble(dato)
        nuevo.siguiente = self.cabeza
        if self.cabeza:
            self.cabeza.anterior = nuevo
        self.cabeza = nuevo

    def mostrar(self):
        actual = self.cabeza
        while actual:
            print(actual.dato, end=" <-> ")
            actual = actual.siguiente
        print("None")

# Ejemplo de uso
lista = ListaDoble()
lista.insertar(10)
lista.insertar(20)
lista.insertar(30)
lista.mostrar()  # Salida: 30 <-> 20 <-> 10 <-> None
