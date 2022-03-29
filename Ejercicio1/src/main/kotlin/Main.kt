// Kevin Lee Rojas
import View.PersonaView
import modelo.Persona
import controller.PersonaController

fun main(args: Array<String>){
    var cedula: String
    var nombre: String
    var edad: Int
    var sexo: Char
    var peso: Double
    var altura: Double

    val personaView = PersonaView()
    personaView.inicializa()

    var persona1 = Persona(nombre = String, edad = Int, sexo = Char, peso = Double, altura = Double)

    val personaController = PersonaController()
    personaController.calcularIMC(peso = persona1.peso, altura = persona1.altura)

    println("Ingrese tu nombre: ")
    persona1.nombre = readLine()?.toString()!!

    println("Ingrese tu edad: ")
    persona1.edad = readLine()?.toInt()!!

    println("Ingrese tu peso: ")
    persona1.peso = readLine()?.toDouble()!!

    println("Ingrese tu altura: ")
    persona1.altura = readLine()?.toDouble()!!

    println("Informacion del usuario")
    println(persona1.nombre)
    println(persona1.edad)
    println(persona1.peso)
    println(persona1.altura)
    println(personaController.calcularIMC(persona1.peso, persona1.altura))
    println("-1 = Bajo Peso")
    println("0 = Peso Ideal")
    println("1 = Sobre Peso")

    var persona2 = Persona(nombre = "Kevin", edad = 25, sexo = 'h')
    //var persona3 = Persona(nombre = String, edad = Int, sexo = Char, peso = Double, altura = Double)

    //persona1.toString()
    persona2.toString()
    //persona3.toString()

   // println(persona1.toString())
    println(persona2.nombre)
    println(persona2.edad)
    println(persona2.sexo)

    //println(persona3.toString())



    /*
    var mensajeIMC:Int
        get() = this.toString()
        set(imc)
    }
*/
    /*
    var cedula: String
    var nombre: String
    var edad: Int
    var sexo: String
    var peso: Double
    var altura: Double

    println("Ingrese tu nombre: ")
    nombre = readLine()?.toString()

    println("Ingrese tu edad: ")
    edad = readLine()?.toIntg()

    println("Ingrese tu peso: ")
    peso = readLine()?.toDouble()

    println("Ingrese tu altura: ")
    altura = readLine()?.toDouble()

    val p1 = Persona()
    val p2 = Persona(nombre, edad, sexo)
    val p3 = Persona(nombre, edad, sexo, peso, altura)

*/
    println("FIN")
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}