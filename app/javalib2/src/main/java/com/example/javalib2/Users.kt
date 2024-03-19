package com.example.javalib2

/*data class Users(var userName:String, var email : String) {
//}
enum class HttpStatus(val code:Int)
{
    OK(200),
    NOT_FOUND(404),
    SERVER_ERROR(500),
    BAD_REQUEST(300)

}

sealed class NetworkCall{
    data class Success( var data : String) : NetworkCall()
    data class Failure( var data : String) : NetworkCall()

}
fun getData():NetworkCall
{
    return NetworkCall.Success("200")
}
 */
class Dog()
{
    var legs =4
    lateinit var  myName : String
    fun playing()
    {
        println("dog is playing")
      //  println(myName)
    }

}
// extension function
fun Dog.eating()
{
    println("dog is eating")
}
fun main()
{
    val pi:Float by lazy {  // lazy function will be used with val only
        3.14f
    }
    var dog = Dog()
    dog.playing()
    dog.eating()

    infix fun Int.myAdd(num:Int):Int{
        return num+this
    }

    var res = 5 myAdd 10
    println(res)
}
   /* var mydata = getData()

    when(mydata)
    {
        is NetworkCall.Success-> println("received data from server $mydata")
        is NetworkCall.Failure-> println("received failure from server $mydata")
    }
}
    var myStatusCode = HttpStatus.OK.code

    when(myStatusCode)
    {
        200-> println("response from server")
        400-> println("file not found")
    }
    /*
    var user1 = Users("pavan","reddyp678")
    var user2 = Users("pavan","reddyp678")

    if(user1 == user2)
        println("both are equal")
    else
        println(" not equal")
     println(user2.email)
    user1.email="not now"



}

   */