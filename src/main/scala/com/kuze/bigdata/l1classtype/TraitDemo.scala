package com.kuze.bigdata.l1classtype

/**
  * 特质 = 接口
  * 在java接口只能定义未实现的方法
  * 在scala特质中可以定义有实现的方法，也可以定义没有实现的方法
  *
  */
trait TraitDemo {

  def hello(name: String)

  def small(name: String) = {
    println(s"老赵对 $name 妩媚一笑")
  }

}
