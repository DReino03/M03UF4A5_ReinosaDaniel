fun main() {

    val persona1 = Persona()
    println("Persona 1 (Constructor sin parámetros): $persona1")

    val persona2 = Persona("Daniel", "García")
    println("Persona 2 : $persona2")

    val persona3:Persona = Persona("12345678A", "Pepito", "Pérez", 30, false)
    println("Persona 3 (Constructor con todos los parámetros): $persona3")


    persona1.aniversari().toString()
    println("Después de celebrar el aniversario: $persona1")

    persona2.casament().toString()
    println("Después de casarse: $persona2")

    persona3.divorci().toString()
    println("Después de divorciarse: $persona3")
}