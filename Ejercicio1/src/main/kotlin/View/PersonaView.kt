package View
import  modelo.Persona
import controller.PersonaController


class PersonaView {
    var persona = Persona()
    var personaController = PersonaController(persona)

    fun inicializa(){
        persona.altura = 180.0
        persona.peso = 80.0
       // println(persona.altura)

        personaController.persona = persona


        //println(personaController.calcularIMC(peso = persona.peso, altura = persona.altura))
    }

}