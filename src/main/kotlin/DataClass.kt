data class employee(var name:String,var age:Int)
fun main() {

    //toString()
    var emp = employee("Jasmin", 21)
    println(emp.toString())

    //copy()
    var emp1=emp.copy()
    println(emp1)
    var emp2=emp.copy(name = "xyz")
    println(emp2)

    //equals()
   if(emp.equals(emp1)==true){
       println("Both are equal")
   }
    else
   {
       println("Both are not equal")
   }

    //hashcode()
    println("${emp.hashCode()}")
    println("${emp1.hashCode()}")
    println("${emp2.hashCode()}")

}