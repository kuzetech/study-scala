package com.kuze.bigdata.l5collection.array

import scala.collection.mutable.ArrayBuffer

object ArrayInit {

  def main(args: Array[String]): Unit = {

    //定长数组
    val arr0 = new Array(2)
    val arr1 = new Array[Int](10)
    val arr2 = Array[Int](1,2,3,4,5)

    //简化定义
    val arr5: Array[Int] = Array(1, 2)
    val arr6: Array[String] = Array("hello hello tom", "hello jerry")

    //变长数组
    val arr3 = ArrayBuffer[Int]()
    val arr4 = ArrayBuffer[Int](10,2)

    val arr7 = ArrayBuffer(1, 2)
    val arr8 = ArrayBuffer("hello hello tom", "hello jerry")

  }

}
