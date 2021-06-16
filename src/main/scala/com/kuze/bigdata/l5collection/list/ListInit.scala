package com.kuze.bigdata.l5collection.list

import scala.collection.mutable.ListBuffer

object ListInit {

  def main(args: Array[String]): Unit = {

    //定长链表
    val list1 = List(1,2,3,4)
    val list2 = List[Int](1,2,3)

    //变长链表
    val list3 = ListBuffer(1,2,3)

  }

}
