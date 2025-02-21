package src

class Gerente(
    nombre: String,
    edad: Int,
    salarioBase: Double,
    porcentajeImpuestos: Double,
    val bonus: Double,
    val exentoImpuestos: Boolean = false
) : Empleado(nombre, edad, salarioBase, porcentajeImpuestos) {

    init {
        require(porcentajeImpuestos == 33.99){ "El porcentaje de impuestos debe de ser siempre 33.99%." }
    }

    override fun calcularSalario() : Double {
        if (exentoImpuestos){
            val salario = salarioBase + bonus
            println("Su salario sumado al bonus es de $salario€.")
            return salario
        } else {
            val salario = (salarioBase * porcentajeImpuestos / 100) + bonus
            println("Su salario sumado al bonus con el porcentaje es de $salario€.")
            return salario
        }
    }

    fun administrar(): String{
        return "El gerente $nombre está administrando."
    }

    override fun toString(): String {
        return super.toString() + ", Bonus: $bonus, Exento: $exentoImpuestos."
    }
}