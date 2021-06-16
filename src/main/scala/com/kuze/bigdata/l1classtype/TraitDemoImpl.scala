package com.kuze.bigdata.l1classtype

/**
  * 特质实现类
  */
object TraitDemoImpl extends TraitDemo{

  /**
    * 如果特质中hello方法没有实现的话，子类在实现的时候可以不加override关键字也可以加
    */
  override def hello(name: String): Unit = {
    println(s"hello $name")
  }

  /**
    * 如果特质中某个方法有具体的实现，在子类继承重写的时候，必须使用override关键字
    */
  override def small(name: String): Unit = {
    println(s"丁丁 对 $name 哈哈大笑")
  }

}
