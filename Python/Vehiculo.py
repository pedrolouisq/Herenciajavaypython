class Vehiculo:
    def __init__(self, fecha_fabricacion, chasis, motor):
        self.fecha_fabricacion = fecha_fabricacion
        self.chasis = chasis
        self.motor = motor

    def get_fecha_fabricacion(self):
        return self.fecha_fabricacion

    def get_chasis(self):
        return self.chasis

    def get_motor(self):
        return self.motor

    def obtener_datos(self):
        return f"Fecha de fabricación: {self.fecha_fabricacion}, Chasis: {self.chasis}, Motor: {self.motor}"
