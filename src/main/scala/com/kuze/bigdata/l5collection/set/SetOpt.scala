package com.kuze.bigdata.l5collection.set

import scala.collection.mutable

object SetOpt {

  def main(args: Array[String]): Unit = {

    val set: Set[Int] = Set[Int](1,3,2,4,1)
    val ints: Set[Int] = set.+(8)
    println(ints.toBuffer) //ArrayBuffer(1, 2, 3, 8, 4),无序的

    val hset = mutable.HashSet[Int](1,2,3,4)
    hset.add(5)
    hset.remove(5)

    println(hset(6))


  }

}
