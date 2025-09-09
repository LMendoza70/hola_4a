package com.example.hola_4a

class arrays {
    fun ejemploCalificaciones(){
        var calificaciones: List<Int>
        calificaciones= listOf(10,9,5,7,8,8,9)
        println("la primer calificacion es : ${calificaciones[0]}")

        println("Imprimiendo el Array...")
        //estructura de for en c# for(int i=0; i<final; i++)
        //definimos el contador
        var x:Int =1
        for (c in calificaciones){
            println("La calificacion :${x} es  : ${c}")
            x++
        }
    }
}