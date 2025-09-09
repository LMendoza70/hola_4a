package com.example.hola_4a

/*
        * Datos enteros Byte, Short, Int, Long
        * Datos flotantes Float, Double
        * Datos Booleanos Boolean
        * Datos Caracter Char
        * Cadenas de texto String
        *
        * mencion de que val es equivalemte a las constantes en c#
        * y var es equivalente a las variables
        * */
class variables {
    fun ejemplo1() {
        var score: Int=0;
        var miByte: Byte

        val name: String ="Garnol...";
        score+=100;
        //name="Chuyman...";
        println("Felicidades $name tu nuevo score es $score")
    }

    fun cuadrado(valor: Float): Float{
        var res: Float=0F;
        res=valor*valor;
        return  res;
    }
}