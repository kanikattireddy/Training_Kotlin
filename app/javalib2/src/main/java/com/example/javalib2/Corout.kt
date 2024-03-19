package com.example.javalib2

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

class Corout {
}
fun main()= runBlocking {
    println("main thread is strats ${Thread.currentThread().name}")
    var myJob : Job = GlobalScope.launch {
        println("coroutine is strats ${Thread.currentThread().name}")
       // networkCall(1000)
     for(i in 1..10)
      {
        //  networkCall(1000)
          delay(1000)
          println(i)
      }

        println("coroutine is ends ${Thread.currentThread().name}")

    }
   // var Data = myJob.await()
   delay(5000)
    myJob.cancel()
  //  println(Data)
    myJob.join()
    println("main thread is ends ${Thread.currentThread().name}")
}
suspend fun networkCall(time : Long)
{
    delay(time)
}
    /*
    println("main thread is strats ${Thread.currentThread().name}")
    GlobalScope.launch {
        println("coroutine is strats ${Thread.currentThread().name}")
        println("coroutine is ends ${Thread.currentThread().name}")
    }
    println("main thread is ends ${Thread.currentThread().name}")


    println("main thread is strats ${Thread.currentThread().name}")
    Thread{
        println("worker thread is strats ${Thread.currentThread().name}")
        Thread.sleep(3000)
        println("worker thread is ends ${Thread.currentThread().name}")
    }
    println("main thread is ends ${Thread.currentThread().name}")
}

     */