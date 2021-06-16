package com.kuze.bigdata.l5collection.map

import scala.collection.mutable

object MapOpt {

  def main(args: Array[String]): Unit = {

    //无法修改值
    val map: Map[String, Int] = Map[String,Int]("a"->1)

    val hmap: mutable.HashMap[String, Int] = mutable.HashMap[String,Int]("a"->0)
    hmap("a") = 1
    hmap.put("b",2)
    hmap.remove("b")

    println(hmap.toBuffer)

    //存在返回some，不存在返回none
    val option1: Option[Int] = hmap.get("a")
    println(option1.isEmpty)
    val option2: Option[Int] = hmap.get("c")
    println(option2.isEmpty)

    option1 match {
      case Some(10) => println(option1.get)
      case Some(1) => println(option1.get)
      case None => println("没有这个key")
      case _ => println("无法匹配")
    }

  }

}
