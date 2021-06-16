package com.kuze.bigdata.l2higherclasstype

/**
  * 使用关键字abstract 定义一个抽象类
  * 和java一样可以有具体实现的方法
  * 也可以有没有具体实现的方法
  */
abstract class AbstractDemo {

  def eat(food: String): String

  def swimming(style: String) = {
    println(s"$style 这么游...")
  }

}
