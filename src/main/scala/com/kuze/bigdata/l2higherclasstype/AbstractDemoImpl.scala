package com.kuze.bigdata.l2higherclasstype

/**
  * 在scala中第一个继承抽象类或者特质，只能使用关键字extends
  * 如果想继承多个特质的话，可以在extends之后使用with关键字
  */
object AbstractDemoImpl extends AbstractDemo with FlyTrait{

  override def eat(food: String): String = {
    s"$food 炒着吃"
  }

  def main(args: Array[String]): Unit = {
    AbstractDemoImpl.swimming("漂着")
    AbstractDemoImpl.fly("我")
  }

}
