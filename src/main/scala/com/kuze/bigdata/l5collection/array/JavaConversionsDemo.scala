package com.kuze.bigdata.l5collection.array

import java.util

import scala.collection.JavaConversions
import scala.collection.mutable.ArrayBuffer

object JavaConversionsDemo {

  def main(args: Array[String]): Unit = {

    val array = ArrayBuffer[String]()
    val students: util.List[String] = JavaConversions.bufferAsJavaList(array)

  }

}
