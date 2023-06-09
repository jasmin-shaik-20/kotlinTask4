
//class and object
class Car {
    var brand = ""
    var model = ""
    var year = 0
}


class Student(var name:String,var email:String,var phoneno:Long){
      fun display(){
          println("student is added")
      }

}

open class Person1(age: Int, name: String) {
    init {
        println("My name is $name.")
        println("My age is $age")
    }
}

class MathTeacher(age: Int, name: String): Person1(age, name) {

    fun teachMaths() {
        println("I teach in primary school.")
    }
}

class Footballer(age: Int, name: String): Person1(age, name) {
    fun playFootball() {
        println("I play for LA Galaxy.")
    }
}


interface MyInterface {

    val test: Int

    fun foo() : String

    fun hello() {
        println("Hello there, pal!")
    }
}

class InterfaceImp : MyInterface {

    override val test: Int = 25
    override fun foo() = "Lol"

}



fun main() {
    val c1 = Car()
    c1.brand = "Ford"
    c1.model = "Mustang"
    c1.year = 1969
    println(c1.brand)
    println(c1.model)
    println(c1.year)


    //constructor
    val s=Student("Jasmin","jasmin@gmail.com",9390547915)
    println(s.email)
    println(s.name)
    println(s.phoneno)


    //class functions
    s.display()

    //inheritance
    val t1 = MathTeacher(25, "Jack")
    t1.teachMaths()
    val f1 = Footballer(29, "Christiano")
    f1.playFootball()


    //interface
    val obj = InterfaceImp()

    println("test = ${obj.test}")
    print("Calling hello(): ")

    obj.hello()

    print("Calling and printing foo(): ")
    println(obj.foo())



}