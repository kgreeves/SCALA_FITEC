object TD_Day03 {

  def main(args: Array[String]): Unit= {

    //println(TD01())
    //println(TD02())
    //println(TD03())

    val myList:List[Int] = List(99,1,2,3,-500,4)
    //println(TD04(myList,3))

    //val resultTD05 = TD05(myList)
    //println(myList)
    //println(s"Sum = " + resultTD05._1 + "\nProduct = " + resultTD05._2 )

    val resultTD06 = TD06(myList)
    println(myList)
    println(s"Min = " + resultTD06._1 + "\nMax = " + resultTD06._2 )

  }

  // METHODS

  def TD01() : List[Int] = {
    val myList:List[Int] = List(1,2,3,4)
    myList
  }

  def TD02() : List[Int] = {
    val myList:List[Int] = 1::(2::(3::(4::Nil)))
    myList
  }

  def TD03() : List[Int] = {
    val myList:List[Int] = 1::2::3::4::Nil
    myList
  }

  def TD04(myList:List[Int], n:Int): List[Any] = {
    myList.take(n-1):::myList.drop(n)
  }

  def TD05(myList:List[Int]): Tuple2[Int,Int] = {

    var sum:Int = 0 ; myList.map( sum += _)
    var prod:Int = 1 ; myList.map( prod *= _ )

    (sum,prod)
  }

  def TD06(myList:List[Int]): Tuple2[Int,Int] = {

    var max = -9999999; var min = 99999999;

    myList.foreach(
       x => if (x > max) {max = x}
    )
    myList.foreach(
      x => if (x < min) {min = x}
    )

    (min,max)
  }

  def TD07()
}
