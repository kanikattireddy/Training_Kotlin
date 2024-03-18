package com.example.javalib2

//fun walking :Unit{} //here unit is like void type
/*
fun playing()
{
    println("playing")
}
fun getsum(a:Int ,b:Int):Int
{
    return a + b
}
// is  is used to check what is the data type
fun getTypeFun(myobj : Any) : String{
    return when(myobj)
    {
        is String-> " it is a type of string"
        is Int-> "it is a type of Int"
        is Boolean-> "it is type boolean"
        else->" no data "
    }
}

fun main()
{
    println(getTypeFun("abc"))
    println(getsum(5,6))
    // ? as null safety
    /*
    var myName:String? = null
    var college:String? = "JNTUA"
    college = null
    var city : String? = "bangalore"
    println(" length of the city is ${city?.length}")
    var name = null
    // !! non null assertion operator
    var country:String? = null
    //println("length of country is ${country?.length}") // application will not crash
    println("length of country is ${country!!.length}") // application will crash and gives error
    if(country!=null)
    {
        println("${country.length}")
    }
    else
    {
        println("-1")
    }
    // elvis operator // if the value is null left side will execute otherwise -1 will execute
    var res = country?.length ?: -1
    println(res)
     */

  /*  var myName:String? = null
    myName?.let {  // here let will give access to the function if the value is not null
        println(myName.length)
    }
    println("end of the program")

    // as? safe cast operator
    // if the variables are same cast type there is no need of as?
    var college: Any? = "abc" // here Any is super class of all classes
    //var age: Int? = college as Int // here without as? will gives error
    var age: Int? = college as? Int // with as? it will give null value
    print(age)
   */



}

 */

/*
fun getData(name : String = "pavan",age : Int = 26)

{
    println(" my name is $name and my age is $age")
}
fun getData()
{
    println(" print the data")
}
fun main()
{
    getData("naveen",29)
    getData("ajith")
    getData(age=44)
    getData()
}

fun addNumbers(a:Int , b:Int) : Int
{
    return a+b
}
var myLambdaAdd: (Int , Int)->Int ={a,b->a+b}
var myLambdaMul: (Int , Int)->Int ={a,b->a*b}
fun myHigherOrderFun(x : Int , y : Int , myFun:(Int , Int)->Int):Int{
    var res = myFun(x,y)
    return res
}


fun tigerEating(food : String)
{
    println("tiger is eating  food $food")
}
fun myHigherOrderFun(myFavFood : String ,myFun:(String)->Unit)
{
    myFun(myFavFood)
}


var myLambdaMul: (Int , Int)->Int ={a,b->a*b}
fun tigerEating(food : String)
{
    println("tiger is eating $food")
}
fun myHigherOrderFun( ):(Int , Int)->Int
{
    return  myLambdaMul
}

fun findMax(a : Int, b : Int):Int = if(a>b) a else b

fun showArea(length : Int , breadth : Int) : Int
{
    fun calculateArea(): Int = length * breadth
    var area =calculateArea()
    return area
}


// custom accessor
val myAge : Int
    get(){
        return 100
    }


open class Animal
{
    open fun animalEating()
    {
        println("Animal is eating")
    }
}
class Tiger : Animal()
{
    var name =" abc"
    fun tigerEating()
    {
        println(" tiger is eating")
    }
    override fun animalEating() {
        super.animalEating()
    }
}
 */
class Tiger( var age : Int = 34)
{

    init
    {
        println("this is primary constructor")
       // this.age=age
    }
    var name = "abc"
    fun eating()
    {
        println("the tiger is eating and his age is $age")
    }
}
fun main()
{
    var tiger = Tiger()
    tiger.eating()


    //println(myAge)
  //  println(showArea(5,3))
//    var res = findMax(4,5)
  //  println(res)
 /*   var myArr = arrayOf(11,22,33,67,34,68,35,89)
    var evenNum = myArr.filter { it % 2 == 0 }.map { it * 10 }
    println(evenNum )
 //   var mapRes = myArr.map { it * 10 }
 //   println(mapRes)

    myArr.reduce { res, myCurEle ->
        println("my current element is $myCurEle")
        println(" the result is $res")
        res+myCurEle

    }
    //var res = myHigherOrderFun()
    //println(res(5,6))
    //println(myHigherOrderFun("meat",::tigerEating)) // here :: is reflection
    // println(myLambda(4,5))
    //println(myHigherOrderFun(2,3, myLambdaAdd))

  */
}