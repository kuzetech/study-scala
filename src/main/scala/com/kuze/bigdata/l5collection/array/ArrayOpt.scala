package com.kuze.bigdata.l5collection.array

/**
  * 数组操作
  */
object ArrayOpt {

  def main(args: Array[String]): Unit = {

    val arr = Array[Int](1,2,3,4,5)

    //map = 映射,返回一个新的数组，源属组不变
    val newArray: Array[Int] = arr.map((x: Int) => x * 10)
    arr.map(x => x * 10)
    arr.map(_ * 10)


    // flatten 扁平化操作
    val arr1: Array[String] = Array("hello hello tom", "hello jerry")
    // Array(Array("hello","hello","tom"), Array("hello", "jerry"))
    val r2: Array[Array[String]] = arr1.map(_.split(" "))
    // Array("hello","hello","tom", "hello", "jerry") 扁平化操作
    r2.flatten

    // flatMap 等同于 先map再flatten
    arr1.flatMap(_.split(" "))

    //foreach
    arr1.flatMap(_.split(" ")).foreach(o=>println(o))

    //求每个单词出现的数量
    //Array("hello","hello","tom", "hello", "jerry")
    val r3 = arr1.flatMap(x =>x.split(" "))
      // Map("hello"  -> Array("hello", hello, hello), tom -> Array("tom")
      .groupBy(x => x)
      //.map(x => x._2.length)
      .mapValues(x => x.length).toList.sortBy(x => - x._2)

    println(r3)

  }
}
