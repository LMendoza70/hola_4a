package com.example.hola_4a
//existen dos tipos de contructores en kotlin primarios y secundarios
class tda_Triangulo(private var L1: Float,private var L2: Float,private var L3: Float) {
    var l1: Float
        get() = L1
        set(value)  {L1=value}

    fun Perimetro(): Float{
        return L1+L2+L3
    }
}