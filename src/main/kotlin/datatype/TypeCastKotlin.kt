package net.println.kotlin.chapter2

import datatype.Child
import datatype.Parent

/**
 * Created by benny on 2/26/17.
 */
fun main(args: Array<String>) {
    val parent: Parent = Parent()

    val child: Child? = parent as? Child
    println(child)

    val string: String? = "Hello"
    if(string != null)
        println(string.length)


}