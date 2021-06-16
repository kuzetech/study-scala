package com.kuze.bigdata.l4case

/**
  *
  * 样例类： case class 类名(主构造器)
  *
  * 当一个类被声名为case class的时候，scala会帮助我们做下面几件事情
  * 1.构造器中的参数如果不被声明为var的话，它默认的话是val类型的，但一般不推荐将构造器中的参数声明为var
  * 2.自动创建伴生对象，同时在里面给我们实现apply方法，使得我们在使用的时候可以不直接显示地new对象
  * 3.伴生对象中同样会帮我们实现unapply方法作为模式匹配的比对字段提取器，从而可以将case class应用于模式匹配
  * 4.实现自己的toString、hashCode、copy、equals方法，实现了Serializable
  *
  * 样例类包含成员变量时使用case class，反之使用case object
  *
  */
case class ScalaCase(sender: String, messageContent: String)

// 当case class没有成员变量时  =  case object
// 所以 case object 比较多余
case object ScalaCase

object TestCaseClass{

  def main(args: Array[String]): Unit = {

    new ScalaCase("刘亦菲", "今晚吃饭")

    ScalaCase("刘亦菲", "今晚吃饭")

  }
}
