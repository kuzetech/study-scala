package com.kuze.bigdata.l1classtype

/**
  * 类
  */
// 定义在类名称后面的构造器叫主构造器
// 主构造器中的属性会定义成类的成员变量
// 如果主构造器中成员属性没有val|var修饰的话，该属性不能被访问,相当于对外没有提供get方法
// 如果成员属性使用var修饰的话，相当于对外提供了get 和set 方法
// 果成员属性使用val修饰的话，相当于对外提供了 get
// 主构造器前的private私有化了主构造器，成员变量前的private私有化了成员变量

// 类的前面加上private[this] 标识这个类在当前包下都可见，当前包下的子包不可见
// 类的前面加上private[包名] 表示这个类在当前包及其子包下都可见，无法添加多个包
private[l1classtype] class ClassDemo private[l1classtype] (var name: String,private val age: Int) {

  // 类的成员变量
  // var 对外提供了get 和 set方法
  // val 对外值只提供了get方法
  var sex: String = _
  private var test: String = _

  // 定义个辅助构造器，def this(), private实现私有化
  private def this(name: String, age: Int, sex: String) = {
    // 在辅助构造器中必须先调用主构造器
    this(name, age)
    this.sex = sex
  }

  // 定义方法，private实现私有化
  private def say(): Unit ={
    println(name)
  }

}
