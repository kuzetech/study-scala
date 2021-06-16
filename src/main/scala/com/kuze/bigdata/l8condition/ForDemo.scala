package com.kuze.bigdata.l8condition

object ForDemo {

  def main(args: Array[String]): Unit = {

    val result : Any = if(true) 1 else "b"

    val inclusive: Range.Inclusive = 1 to 10

    val range: Range = 1 until 10

    val arr = Array(1,2,3)

    for( ele <- arr if ele % 2 == 0 ){
      println(ele)
    }

    for( i <- 1 to 10 ; j <- 1 until 10 if i != j ){
      println(s"i=${i},j=${j}")
    }

  }

}
