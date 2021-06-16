package com.kuze.bigdata.l3keyword

trait ScalaType {

  type T

  def learn(s: T) = {
    println(s)
  }

}

object TypeString extends ScalaType {

  override type T = String

  def main(args: Array[String]): Unit = {
    TypeString.learn("String")
  }

}

object TypeInt extends ScalaType {

  override type T = Int

  def main(args: Array[String]): Unit = {
    TypeInt.learn(100)
  }

}