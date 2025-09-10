package com.example.hola_4a

import java.lang.reflect.Constructor
import kotlin.math.sqrt

class tda_Triangulo2 {
   private var _L1: Float=0F
    var L1: Float
        get() = _L1
        set(value) {_L1=value}
    private var _L2: Float=0F
    var L2: Float
        get() =_L2
        set(value) {_L2=value}
    private var _L3: Float=0F
    var L3: Float
        get()=_L3
        set(value) {_L3=value}

    fun Constructor(l1: Float,l2: Float,l3: Float){
        _L1=l1
        _L2=l2
        _L3=l3
    }

    fun Area(): Float{
        val s: Float=(_L1+_L2+_L3)/2
        return sqrt(s*(s-_L1)*(s-_L2)*(s-_L3))
    }
}