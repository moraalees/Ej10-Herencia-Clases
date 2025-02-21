package src

fun main(){
    val persona = Persona("Nancy", 16)
    val empleado = Empleado("Barbie", 42, 200, 432)
    val gerente = Gerente("Rugrat", 31, 800.0, 33.99, 31.3, true)

    persona.celebrarCumple()
    println(persona)

    empleado.calcularSalario()
    empleado.trabajar()
    println(empleado)

    gerente.calcularSalario()
    gerente.administrar()
    println(gerente)
}