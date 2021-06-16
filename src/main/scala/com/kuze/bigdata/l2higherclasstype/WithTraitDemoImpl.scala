package com.kuze.bigdata.l2higherclasstype

import com.kuze.bigdata.l1classtype.TraitDemo

/**
  * 静态混入N个特质
  */
object WithTraitDemoImpl extends TraitDemo with FlyTrait{

  override val name: String = "fish"

  override def hello(name: String): Unit = {
    println(s"hello $name")
  }

  override def small(name: String): Unit = {
    println(s"丁丁 对 $name 哈哈大笑")
  }

}
