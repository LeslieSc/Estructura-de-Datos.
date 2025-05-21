class Nodo:
    def __init__(self, dato):
        self.dato = dato
        self.izq = None
        self.der = None

class Arbol:
    def __init__(self):
        self.raiz = None

    def insertar(self, dato):
        self.raiz = self._insertar_rec(self.raiz, dato)

    def _insertar_rec(self, nodo, dato):
        if nodo is None:
            return Nodo(dato)
        if dato < nodo.dato:
            nodo.izq = self._insertar_rec(nodo.izq, dato)
        else:
            nodo.der = self._insertar_rec(nodo.der, dato)
        return nodo

    def in_orden(self, nodo):
        if nodo:
            self.in_orden(nodo.izq)
            print(nodo.dato, end=" ")
            self.in_orden(nodo.der)

# Ejemplo de uso
arbol = Arbol()
arbol.insertar(5)
arbol.insertar(3)
arbol.insertar(7)
arbol.in_orden(arbol.raiz)  # Salida: 3 5 7
