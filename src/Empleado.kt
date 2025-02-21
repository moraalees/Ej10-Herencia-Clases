package src

class Empleado(nombre: String, edad: Int, val salarioBase: Double, val porcentajeImpuestos: Double): Persona(nombre, edad) {

    constructor(nombre: String, edad: Int, salarioBase: Int, porcentajeImpuestos: Int = 10) :
            this(nombre, edad, salarioBase.toDouble(), porcentajeImpuestos.toDouble())

    fun calcularSalario(){
        val salario = salarioBase * porcentajeImpuestos / 100
        println("Su salario es de $salario€.")
    }

    fun trabajar(){
        println("$nombre está trabajando.")
    }

    override fun toString(): String {
        return super.toString() + ", Salario: ${"%.2f".format(salarioBase)}€"
    }
}