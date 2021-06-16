package com.kuze.bigdata.l1classtype

/**
  * 伴生类
  * why：scala中没有静态字段和静态方法。
  * 静态成员会破坏scala所支持的完整的面向对象模型
  * 要实现类似 Java 中那种既有实例成员又有静态成员的类的功能就必须使用伴生类
  *
  * 实现步骤：
  * 1. 定义一个 class 并在这里面实现所有的实例成员
  * 2. 添加一个 object ，这个 object 要与上面的 class 同名，然后在这里面实现所有的静态成员
  * 3. 定义的 class 与 object 必须在同一个文件内
  *
  * 特性：
  * 可以互相访问对方的私有方法
  */

// 伴生类，定义成员变量或方法
class StaticDemo {

}

// 伴生对象，定义静态成员变量或方法
object StaticDemo {

}
