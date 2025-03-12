class Pila:
    def __init__(self, n):
        self.n = n
        self.arreglo = [0] * n
        self.top = -1

    def push(self, e):
        if not self.isFull():
            self.top += 1
            self.arreglo[self.top] = e
        else:
            raise Exception("Pila llena")

    def pop(self):
        if not self.isEmpty():
            valor = self.arreglo[self.top]
            self.top -= 1
            return valor
        else:
            raise Exception("Pila vacía")

    def peek(self):
        if not self.isEmpty():
            return self.arreglo[self.top]
        else:
            raise Exception("Pila vacía")

    def isEmpty(self):
        return self.top == -1

    def isFull(self):
        return self.top == self.n - 1
    
    def size(self):
        return self.n

class Cola:
    def __init__(self, n):
        self.n = n
        self.arreglo = [0] * n
        self.inicio = 0
        self.fin = -1
        self.cantidad = 0

    def insert(self, e):
        if not self.isFull():
            self.fin = (self.fin + 1) % self.n
            self.arreglo[self.fin] = e
            self.cantidad += 1
        else:
            raise Exception("Cola llena")

    def remove(self):
        if not self.isEmpty():
            valor = self.arreglo[self.inicio]
            self.inicio = (self.inicio + 1) % self.n
            self.cantidad -= 1
            return valor
        else:
            raise Exception("Cola vacía")

    def peek(self):
        if not self.isEmpty():
            return self.arreglo[self.inicio]
        else:
            raise Exception("Cola vacía")

    def isEmpty(self):
        return self.cantidad == 0

    def isFull(self):
        return self.cantidad == self.n

    def size(self):
        return self.cantidad

print("--- Prueba de la Pila ---")
pila = Pila(3)
pila.push(10)
pila.push(20)
pila.push(30)
print("Capacidad de elementos en la pila = ", pila.size())
print(pila.peek())  
print("pop() = ", pila.pop())     
print(pila.peek()) 
print("pop() = ", pila.pop())    
print(pila.peek()) 
print("pop() = ", pila.pop())     
      
print("\n--- Prueba de la Cola ---")
cola = Cola(3)
cola.insert(10)
cola.insert(20)
cola.insert(30)
print("Cantidad de elementos en la cola = ", cola.size())
print(cola.peek())  
print("remove() = ", cola.remove())  
print(cola.peek())  
print("remove() = ", cola.remove())  
print(cola.peek())  
print("remove() = ", cola.remove())  
