package com.kuze.bigdata.l6tuple

object TupleOpt {

  def main(args: Array[String]): Unit = {

    val tuple: (Int, String, Boolean, Unit.type) = (1,"a",true,Unit)

    //1
    println(tuple._1)
    //a
    println(tuple._2)
    //true
    println(tuple._3)
    //object scala.Unit
    println(tuple._4)

    //1
    //a
    //true
    //object scala.Unit
    tuple.productIterator.foreach(o=>println(o))

    //ArrayBuffer(1, a, true, object scala.Unit)
    println(tuple.productIterator.toList.toBuffer)

    val tuple2: (Int, Int) = (2,4)
    val swap: (Int, Int) = tuple2.swap
    //ArrayBuffer(2, 4)
    println(tuple2.productIterator.toBuffer)
    //ArrayBuffer(4, 2)
    println(swap.productIterator.toBuffer)


  }

}
