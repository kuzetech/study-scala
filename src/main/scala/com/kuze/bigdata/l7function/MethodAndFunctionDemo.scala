package com.kuze.bigdata.l7function

object MethodAndFunctionDemo {

  //--------------------------定义方法------------------------------------------------

  //普通方法
  def min(a: Int,b: Int):Int={
    if(a>b) b else a
  }

  //参数是函数
  def howMuch(f: =>Int) = {
    println(s"还剩下${f}块钱")
  }

  howMuch(min(1,2))

  //不知道有多少个参数
  def getSum(initValue: Int,ints: Int*):Int = {
    var sum = initValue
    for (elem <- ints) {
      sum += elem
    }
    sum
  }

  //不知道参数类型是什么
  def makePerson(params: Any*)={
    for (elem <- params) {
      println(elem)
    }
  }

  //--------------------------定义函数------------------------------------------------

  val func1 : (Int,Int) => Int = (a,b) => a+b

  //将类型内聚，简单写法
  val func2 = (a:Int,b:Int) => a+b


  val func3 = (a: Int) => {a * 10}
  val func4:(Int) => Int = (a) => a * 10

  Array(1,2,3).map((x: Int) => x * 10)
  Array(1,2,3).map(func3)
  Array(1,2,3).map(func4)
  Array(1,2,3).map(func4(_))

  //--------------------------部分实现函数------------------------------------------------

  val partMin1: Int => Int = min(1,_:Int)

  val partMin2: (Int) => Int = (a) => min(1,a)

  val partMin3 = (b: Int) => min(1,b)

  //--------------------------柯里化函数：降低通用性，提高适用性-------------------------

  //正常方法
  def add1(a: Int,b: Int):Int = { a+b }
  //省略花括号
  def add2(a: Int,b: Int):Int = a+b
  //参数拆分
  def add3(a: Int)(b: Int):Int = a+b
  //省略返回值，最简柯里化函数
  def add4(a: Int) = (b: Int) => a +b

  val result3 = add3(2)(3)

  //定义部分参数函数
  val part: Int => Int = add3(2)
  val result4 = part(4)

  //--------------------------传值还是传引用---------------------------------------------------

  def count():Int = {
    val money = 100
    money
  }

  def printByValue(x : Int): Unit = {
    println(s"还剩下${x}块钱")
  }

  def printByName(f: =>Int) = {
    println(s"还剩下${f}块钱")
  }

  //执行完的结果传入方法
  printByValue(count())
  //仅传入逻辑，具体调用时才执行
  printByName(count())

  private var keyTransformFunc: (String) => String = _

  def main(args: Array[String]): Unit = {
    keyTransformFunc.toString()
  }

}
