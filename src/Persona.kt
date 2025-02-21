package src

open class Persona(val nombre: String, var edad: Int) {

    override fun toString(): String {
        return "Nombre: $nombre ($edad años)"
    }

    fun celebrarCumple(){
        edad += 1
        println("Felicidades $nombre, ahora tienes $edad años.")
    }

}