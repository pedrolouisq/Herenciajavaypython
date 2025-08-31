from Vehiculo import Vehiculo

class Automovil(Vehiculo):
    def __init__(self, marca, modelo, precio, fecha_fabricacion, chasis, motor):
        super().__init__(fecha_fabricacion, chasis, motor)
        self.marca = marca
        self.modelo = modelo
        self.precio = precio

    def get_marca(self):
        return self.marca

    def get_modelo(self):
        return self.modelo

    def get_precio(self):
        return self.precio

    def mostrar_datos(self):
        return (f"{self.obtener_datos()}, Marca: {self.marca}, "
                f"Modelo: {self.modelo}, Precio: ${self.precio}")
