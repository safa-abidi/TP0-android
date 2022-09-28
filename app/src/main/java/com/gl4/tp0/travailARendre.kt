package com.gl4.tp0

import kotlin.math.abs

data class Point(var x: Int, var y: Int){}

fun distance(p: Point, q: Point): Int{
    return abs(p.x - q.x) + abs(p.y - q.y)
}

class Rectangle(var p: Point = Point(0,0), var q: Point = Point(1,1)){
    override fun toString(): String {
        return "p=$p q=$q"
    }
    fun surface(): Int{
        val longeur = distance(p,Point(p.x,q.y))
        val largeur = distance(p,Point(q.x,p.y))
        return largeur*longeur
    }

}

fun main(args: Array<String>){
    print("hello\n")
    val rectangles = listOf(
        Rectangle(),
        Rectangle(q = Point(1,3)),
        Rectangle(p = Point(1,3)),
        Rectangle(Point(8,5), Point(9,3))
    )

    for(i in 0 until rectangles.size){
        print("la surface = ${rectangles[i].surface()}\n")
    }

}