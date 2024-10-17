package main.kt.week2.Class

open class Employe (val name: String){
    fun sayhelo(name: String){
        println("hello $name myname is ${this.name}")

    }
}

class manager (name: String) : Employe(name)

class member (name: String) : Employe(name)