package com.example.hola_4a

class cls_ArreglosMutables {
    var Calificaciones=mutableListOf<Float>()

    fun Captura(){
        println("Captura tus calificaciones")
        for (i in 1..7){
            println("Captura la calificacion ${i}: ")
            val cal: Float=readln().toFloat()
            Calificaciones.add(cal)
        }
    }

    fun Imprimir(){
        println("Las Calificaciones capturadas son: ")
        for (i in 1..7){
            println("La calificacion ${i} es ${Calificaciones[i-1]}")
        }
    }

}