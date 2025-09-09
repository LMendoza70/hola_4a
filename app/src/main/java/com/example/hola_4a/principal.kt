package com.example.hola_4a

fun main(){
    println("Hola 4A");
    val variable:variables = variables()
    val arreglos:arrays= arrays()
    variable.ejemplo1()
    //variable.cuadrado(55.2F)
    println("El cuadrado de 55.2 es : ${variable.cuadrado(55.2F)}")
    arreglos.ejemploCalificaciones()
}