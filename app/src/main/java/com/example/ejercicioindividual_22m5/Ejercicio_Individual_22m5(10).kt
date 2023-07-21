package com.example.ejercicioindividual_22m5

// Abrir para que pueda ser heredada, tiene una variable para ver si esta prendida la pantalla
open class Phone(var isScreenLightOn: Boolean = false) {

    //funcion prendido booleano pantalla encendido verdadero abierta para heredarla
    open fun switchOn() {
        isScreenLightOn = true
    }
    //funcion apagado, pantalla apagada
    fun switchOff() {
        isScreenLightOn = false
    }
    //la pantalla esta prendida o apagada si el telefono esta prendido o apagado
    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}
//nueva clase de telefono hereda de telefono, booleano es para saber si esta abierto o cerrado
class FoldablePhone(isThePhoneFolded: Boolean = false) : Phone() {
    private var isFolded = isThePhoneFolded

    //se sobreescribe el metodo heredado
    override fun switchOn() {
        if (!isFolded) {
            //si no esta cerrado heredamos el metodos que tendra la pantalla encendida
            super.switchOn()
        } else {
            isScreenLightOn = false
        }
    }

    fun foldPhone() {
        isFolded = true
        switchOff()
    }

    fun unfoldPhone() {
        isFolded = false
    }

    fun isThePhoneFolded(): Boolean {
        return isFolded
    }
}

fun main() {

    //creamos objetos el telefono normal solo puede prenderse y revisar su pantalla
    val telefononormal = Phone()
    telefononormal.switchOn()
    telefononormal.checkPhoneScreenLight()

    val telefonoplegable = FoldablePhone()
    telefonoplegable.switchOn()
    telefonoplegable.checkPhoneScreenLight()

    //el telefono plegable puede estar abierto o cerrado
    telefonoplegable.foldPhone()
    telefonoplegable.switchOn()
    telefonoplegable.checkPhoneScreenLight()

    telefonoplegable.unfoldPhone()
    telefonoplegable.switchOn()
    telefonoplegable.checkPhoneScreenLight()
}