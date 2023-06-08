class Person
{
    var name:String="abc"
    var age:Int=20
}


//with
fun main(args: Array<String>) {
    val person = Person()
    val newage=with(person)
    {
        println(name)
        println(age)
        age+5
    }


//apply
    val per=Person().apply {
        this.name="jasmin"
        this.age=21
    }
    with(per)
    {
        println(name)
        println(age)
    }

    //also
    person.also {
        it.name="apple"
        println("${it.name}")
    }

    //let

    var name:String?="jasmin"
    var len = name?.let {
        println(it.reversed())
        println(it.capitalize())
        it.length
    }
}