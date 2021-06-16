package com.kuze.bigdata.l2higherclasstype

trait FlyTrait {

  val name: String = "bird"

  def fly(name: String): Unit ={
    println(s"看， ${name} 在飞...")
  }

}
