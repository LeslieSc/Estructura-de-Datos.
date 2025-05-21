class Grafo:
    def __init__(self, n):
        self.lista = [[] for _ in range(n)]

    def agregar_arista(self, a, b):
        self.lista[a].append(b)
        self.lista[b].append(a)  # No dirigido

    def mostrar(self):
        for i, vecinos in enumerate(self.lista):
            print(f"{i}: {' '.join(map(str, vecinos))}")

# Ejemplo de uso
grafo = Grafo(4)
grafo.agregar_arista(0, 1)
grafo.agregar_arista(0, 2)
grafo.agregar_arista(1, 3)
grafo.mostrar()
# Salida:
# 0: 1 2
# 1: 0 3
# 2: 0
# 3: 1
