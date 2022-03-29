package modelo

open class Persona { //(cedula_p: String, edad_p: Int, nombre_p: String, sexo_p: Char, peso_p: Double, altura_p: Double)
    var cedula: Int = 0
    var edad : Int = 0
    var nombre : String = ""
    var sexo : Char = 'H'
    var peso : Double = 0.0
    var altura: Double = 0.0

    constructor(cedula: Int, edad: Int, nombre: String, sexo: Char, peso: Double, altura: Double ){
        this.cedula = cedula
        this.edad = edad
        this.nombre = nombre
        this.sexo = sexo
        this. peso = peso
        this.altura = altura
    }

    constructor(nombre: String, edad: Int, sexo: Char){
        this.nombre = nombre
        this.edad = edad
        this.sexo = sexo
    }

    constructor()
    constructor(nombre: String.Companion, edad: Int.Companion, sexo: Char.Companion, peso: Double.Companion, altura: Double.Companion)



/*
    var imc: String
        get() = calcularIMC.toString()
        set(Value) {
            setDataFromString(value)
        }

    var cedula: String
    var edad: Int
    var nombre: String
    var sexo: Char
    var peso: Double
    var altura: Double
*/

    /*
    var cedula: String = ""
    var edad : Int = 0
    var nombre : String = ""
    var sexo : String = ""
    var peso : Double = 0.0
    var altura: Double = 0.0

    constructor(nombre: String, edad: Int, sexo: String, peso: Double, altura: Double)

    constructor(_edad: String, _nombre: Int, _sexo: String)

    constructor(cedula: String, edad: Int, nombre: String, sexo: String, peso: Double, altura: Double ){
        this.cedula = cedula
        this.edad = edad
        this.nombre = nombre
        this.sexo = sexo
        this. peso = peso
        this.altura = altura
    }

    constructor()

    constructor(nombre: String, edad: Int,  sexo: Char, peso: Double, altura: Double ){
        this.cedula = cedula
        this.edad = edad
        this.nombre = nombre
        this.sexo = sexo
        this. peso = peso
        this.altura = altura
    }


    fun calcularIMC(){
        var imcPerson: Double = 0.0
        imcPerson = peso / (altura * altura)
        var count = when (true) {
            (imcPerson <= 18.4) -> -1
            (imcPerson in 18.5..29.9) -> 0
            (imcPerson >= 30) -> 1
            else -> print("Error")
        }
    }

    fun esMayorDeEdad(): Boolean {
        var age: Boolean = false
        if(edad >= 18){
            age = true
        }
        return age
    }

    private fun comprobarSexo(sexo: Char){
        if(sexo != 'H' && sexo != 'M' ){
            this.sexo = "H"
        }
    }

    override fun toString(): String {
        var sex: String
        if(this.sexo == 'H'){
            sex = "hombre"
        }else{
            sex = "mujer"
        }
        return "Informacion de la persona: \nNombre: $nombre\n Sexo: $sexo\n Edad: $edad\n Cedula: $cedula\n Peso: $peso\n Altura: $altura\n"
        return "Tu IMC es: ${calcularIMC()}"
    }
*/

    /*
    constructor(){
        var cedula: String = ""
        var edad : Int = 0
        var nombre : String = ""
        var sexo : String = ""
        var peso : Double = 0.0
        var altura: Double = 0.0
    }
) {
    constructor(){

    }

    constructor(nombre: String, edad: Int, sexo: String){
        this.nombre = nombre
        this.edad = edad
        this.sexo = sexo
    }
/*
    constructor(cedula : String, edad : Int, nombre: String, sexo: String, peso: Double, altura: Double){
        this.cedula = cedula
        this.edad = edad
        this.nombre = nombre
        this.sexo = sexo
        this.peso = peso
        this.altura = altura
    }
*/
    fun calcular(obj: Any): Int =
        when(obj){

        }
}

    /*
    fun calcularMC(): Int {
        var dividir : Int = (peso/(altura*altura)) as Int
        if(dividir < 10){
            return -1
        }else{
            if(dividir > 25) {
                return 1
            }
        }
                return 0
    }
     */

    fun esMayorDeEdad(){
        fun esMayor():Boolean{
            return edad > 17
    }

    fun comprobarSexo() {
        if(sexo != sexo){
            return "H"
        }
    }

   fun toString(): String{
        return this
    }
     */
}