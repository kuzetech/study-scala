package com.kuze.bigdata.l1classtype

/**
  * 单例类
  */
object ObjectDemo {

  // 单例类定义的成员变量 和 方法都是静态的
  val name: String = "zhangsan"
  var age: Int = 18

  def saySomething(msg: String): Unit = {
    println(msg)
  }

  def apply(food: String) = {
    println(s"米饭1碗 $food")
  }

  def main(args: Array[String]): Unit = {
    println(ObjectDemo.name)
    ObjectDemo.age = 20
    println(ObjectDemo.age)


    ObjectDemo.saySomething("今天有点冷")

    ObjectDemo.apply("西红柿炒番茄")

    // 语法糖，默认调用就是apply方法
    ObjectDemo("油焖大虾")

  }

}
