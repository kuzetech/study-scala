package com.kuze.bigdata.l5collection.list

/**
  * 以下内容跟var、val区分开
  * Array:
  *     内容都可变
  *
  *     长度可变数组（ArrayBuffer）和长度不可变数组 Array
  *
  * 在Scala中，集合分为可变集合（mutable）和不可变集合(immutable)
  *
  * 可变集合：长度可变，内容可变
  * 不可变集合：长度不可变，内容也不可变
  *
  */
object ListOpt {

  def main(args: Array[String]): Unit = {

    val list = List(1,5,3)
    val other = List(10,15,0)

    /**
      * 添加元素操作符,会返回一个新的List
      */
    //List(List(1, 5, 3), 10, 15, 0)
    println(list +: other)

    //List(8, 1, 5, 3)
    println(list.+:(8))

    //List(1, 5, 3, List(10, 15, 0))
    println(list :+ other)

    //List(1, 5, 3, 8)
    println(list.+:(8))

    //List(List(1, 5, 3), 10, 15, 0)；比较特殊右连接符
    println(list :: other)

    //List(1, 2)；先添加到头部，再添加1到头部
    println(1::2::Nil)

    /**
      * 集合连接操作符
      */
    //List(1, 5, 3, 10, 15, 0)
    println(list ++ other)

    //List(1, 5, 3, 10, 15, 0)
    println(list ++: other)

    //List(1, 5, 3, 10, 15, 0)
    println(list ::: other)

    /**
      * 字符串操作
      */
    //List(1, 5, 3)a
    println(list + "a")

    //1|5|3
    println(list.mkString("|"))


    /**
      * 过滤
      */
    val count: Int = list.count(o => o>0)
    println(s"符合条件的元素个数为$count")
    val filter: List[Int] = list.filter(o => o>3)
    println(s"符合条件的元素集合为$filter")

    /**
      * 排序
      */
    val metaList = List(("a",9),("b",2),("c",7))

    //List((a,9), (c,7), (b,2))
    println(metaList.sortBy(x => -x._2))

    //List((a,9), (c,7), (b,2))
    println(metaList.sortWith((x,y) => x._2>y._2))

    //List((c,7), (b,2), (a,9))
    println(metaList.reverse)

    /**
      * 分组
      */
    //参数为每组多少个
    //List(List(1, 5), List(3))
    println(list.grouped(2).toList)


    /**
      * 折叠
      * List(1,5,3)
      */
    //左折叠（初始值和结果都作为左参数，集合元素从左边开始参与）；1为初始值
    //1-1-5-3=-8
    println(list.fold(1)(_ - _))
    println(list.foldLeft(1)(_ - _))

    //右折叠（初始值和结果都作为右参数,集合元素从左边开始参与）；1为初始值
    //3-1=2;5-2=3;1-3=-2
    println(list.foldRight(1)(_ - _))


    /**
      * 聚合
      * List(1,5,3)
      */
    //1+5+3=9
    println(list.reduce((x,y) => x+y))
    //先局部聚合再全局聚合，单线程下只会执行局部聚合函数，1为初始值
    println(list.aggregate(1)(_ + _,_ + _))

    /**
      * 数学集合操作
      * List(1,5,3)
      * List(10, 15, 0)
      * 如果另一个集合存在相同的元素，合成后就会存在两个元素
      */
    //并集
    //List(1, 5, 3, 10, 15, 0)
    println(list.union(other))
    //交集
    //List()
    println(list.intersect(other))
    //差集
    //List(1, 5, 3)
    println(list.diff(other))
    //求和，指允许数字类型 = 9
    println(list.sum)


    /**
      * 获取元素操作
      */
    //头元素，1
    println(list.head)
    //尾元素，3
    println(list.last)
    //除了头元素外的List(5, 3)
    println(list.tail)


    /**
      * 两列表元素合成
      * List(1, 5, 3)
      * List(1, 2, 3, 4)
      */
    val test = List(1,2,3,4);
    //List((1,1), (5,2), (3,3))
    println(list.zip(test))

    /**
      * 截取
      */
    //List(5, 3)
    println(list.slice(1,list.length))

    /**
      * 集合角标
      */
    val indices: Range = list.indices
    //ArrayBuffer(0, 1, 2)
    println(indices.toBuffer)
    //  1
    //  5
    //  3
    indices.foreach(o=>println(list(o)))
  }

}
