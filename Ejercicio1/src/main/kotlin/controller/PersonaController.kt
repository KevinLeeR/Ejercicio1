package controller
import modelo.Persona
import View.PersonaView

class PersonaController {

    val PESO_IDEAL = 0
    val SOBREPESO = 1
    var BAJOPESO = -1

    var persona = Persona()

    constructor(persona: Persona){
        this.persona = persona
    }

    constructor()

    fun calcularIMC(peso: Double, altura: Double):Int{

        if((persona.peso/100) / (persona.altura * persona.altura) < 18.5)
            return BAJOPESO
        if((persona.peso/100) / (persona.altura) < 25.0)
            return PESO_IDEAL
        else
            return SOBREPESO

        /*
        var imcPerson: Double = 0.0
        imcPerson = peso / (altura * altura)
        var count = when (true) {
            (imcPerson <= 18.4) -> -1
            (imcPerson in 18.5..29.9) -> 0
            (imcPerson >= 30) -> 1
            else -> print("Error")
        }
        */

    }

    fun esMayorDeEdad(): Boolean {
        return persona.edad >= 18
    }

    private fun comprobarSexo(sexo: Char){
        if(persona.sexo != 'H' || persona.sexo != 'M' ){
            persona.sexo = 'H'
        }
    }
/*
    override fun toString(): String {
    }
    */
}