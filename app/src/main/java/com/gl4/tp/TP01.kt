package com.gl4.tp

import kotlin.math.abs

fun main() {
    println("Hello")
    var p1 = Point(2, 1)
    var p2 = Point(7,0)
    println("la distance entre p1 et p2 est : "+ distance(p1,p2))
    println("--------------")
    val rectangles = listOf<Rectangle>(
        Rectangle(),
        Rectangle(q= Point(6,5)),
        Rectangle(p= Point(3,5)),
        Rectangle(p= Point(7,9),q= Point(2,6))
    )
    for( i in 0 until rectangles.size){
        print("la surface du rectangle "+i+" est : ")
        println(rectangles[i].surface())
    }
}
data class Point(val x:Int, val y:Int)
fun distance(p1:Point,p2:Point): Int {
    return abs(p1.x - p2.x) + abs(p1.y-p2.y)
}
class Rectangle(val p : Point = Point(0,0), val q : Point = Point(1,1)){
    override fun toString(): String {
        return "p=${p} q=${q}  "
    }
    fun surface(): Int {
        val largeur = q.x - p.x
        val hauteur = q.y - p.y
        return largeur*hauteur
    }
}