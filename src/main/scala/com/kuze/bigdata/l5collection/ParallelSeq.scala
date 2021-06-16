package com.kuze.bigdata.l5collection

/**
  * 并行化集合
  */
object ParallelSeq {

  def main(args: Array[String]): Unit = {

    val list = List(1,2,3,4,5)
    //结果可能是115，215，315，415，515
    //原因是该集合最少被划分成一个组，最多被划分为5个组
    list.par.fold(100)(_ + _)

    list.par.foldLeft(100)(_ + _)

    list.par.aggregate(100)(_ + _,_ + _)
  }

}
