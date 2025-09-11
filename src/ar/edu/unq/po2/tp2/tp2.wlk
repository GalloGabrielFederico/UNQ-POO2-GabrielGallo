class Empresa {
  const nombre

  const cuit 

  const empleados = {}

  const recibos = []

  method generarRecibos() {
    recibos = empleados.forEach({empleado => new ReciboDeHaberes().getRecibo(empleado)})
  }
}

class Empleado {
  const nombre

  const direccion

  const estadoCivil

  const edad

  method getEdad() {
    return edad
  }

  method getSueldoBruto()

  method getRetenciones() 

  method getSueldo(){
    return self.getSueldoBruto() - self.getRetenciones()
  } 
}

class EmpleadoPermanente inherits Empleado {
  var cantHijos

  var antiguedad

  const asignacionPorhijo = 150

  const asignacionPorConyuge = 100

  const asignacionPorAntiguedad = 50

  override method getSueldoBruto() {
    return asignacionPorhijo*cantHijos + self.asignacionPorConyuge() + asignacionPorAntiguedad*antiguedad
  }

  method asignacionPorConyuge() {
    return if(estadoCivil == "casado"){
            asignacionPorAntiguedad
           }
           else{
            0
           }
  }

  override method getRetenciones() {
    return self.retencionesAportesJubilatorios() + self.retencionesOS() 
  }

  method retencionesOS() {
    return 0.1*self.getSueldoBruto() + 20*cantHijos
  }

  method retencionesAportesJubilatorios() {
    return 0.15*self.getSueldoBruto()
  }
}


class EmpleadoTemporario inherits Empleado {
  const fechaDeFin

  var cantHorasExtras

  override method getSueldoBruto() {
    return cantHorasExtras * 40
  }

  override method getRetenciones() {
    return self.retencionesOS() + self.retencionesAportesJubilatorios()
  }

  method retencionesOS() {
    return if(self.getEdad() > 50){
            0.1 * self.getSueldoBruto() + 25
           }
           else{
            0.1 * self.getSueldoBruto()
           }
  }

  method retencionesAportesJubilatorios() {
    return 0.1 * self.getSueldoBruto() + 5 * cantHorasExtras
  }
}


class ReciboDeHaberes {
  method getRecibo(empleado) {
    
  }
}

class EmpleadoContratado inherits Empleado {
  const numeroDeContrato

  const medioDePago =  ""

  const sueldoBasico 

  const gastosAdministrativos = 50

  override method getSueldoBruto() {
    return sueldoBasico
  }

  override method getRetenciones() {
    return gastosAdministrativos
  }
}