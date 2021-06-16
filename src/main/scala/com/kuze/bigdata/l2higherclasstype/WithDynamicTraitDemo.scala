package com.kuze.bigdata.l2higherclasstype

import com.kuze.bigdata.l1classtype.TraitDemo

/**
  * 动态混入N个特质
  */
object WithDynamicTraitDemo {

  class Teacher (var sex: String, var age: Int){}

  def main(args: Array[String]): Unit = {

    val teacher = new Teacher("男",1) with FlyTrait with TraitDemo {
      override def hello(name: String): Unit = {
        println(s"hello $name")
      }
    }

    teacher.hello("你好")

  }

}
