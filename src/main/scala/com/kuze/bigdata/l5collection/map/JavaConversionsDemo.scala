package com.kuze.bigdata.l5collection.map

import java.util

import scala.collection.JavaConversions

object JavaConversionsDemo {

  def main(args: Array[String]): Unit = {

    val map = Map(
      "k1" -> 1,
      "k2" -> 2,
      "k3" -> 3
    )

    val javaMap: util.Map[String, Int] = JavaConversions.mapAsJavaMap(map)



  }

}
