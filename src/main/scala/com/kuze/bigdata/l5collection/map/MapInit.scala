package com.kuze.bigdata.l5collection.map

object MapInit {

  def main(args: Array[String]): Unit = {

    //声明定长map
    val map1 = Map(
      "k1" -> 1,
      "k2" -> 2,
      "k3" -> 3
    )


    //声明变长map
    val map2 = scala.collection.mutable.Map(
      "k1" -> 1,
      "k2" ->2 ,
      "k3"->3
    )

  }

}
