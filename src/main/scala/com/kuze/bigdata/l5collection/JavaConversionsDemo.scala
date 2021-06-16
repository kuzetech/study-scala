package com.kuze.bigdata.l5collection

import java.util.Collections
import scala.collection.JavaConversions._
import scala.collection.mutable.ArrayBuffer

object JavaConversionsDemo {

  def main(args: Array[String]): Unit = {

    //如果引入import scala.collection.JavaConversions._
    //如果有合适的方法会自动转换
    Collections.reverse(ArrayBuffer(1,2,3))

  }

}
