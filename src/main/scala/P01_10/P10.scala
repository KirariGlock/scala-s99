package P01_10

object P10 extends App {
  val result = encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  println(result)


  private def encode(targetList: List[Symbol], resultList: List[(Int, Symbol)] = Nil) :List[(Int, Symbol)] = {
    // 仕様はあってるけど問題的にはP9を使わないとダメらしい…
    val (trueList, falseList) = targetList.span(_ == targetList.head)
    if (falseList.isEmpty){
      ((trueList.size, trueList.head) :: resultList).reverse
    } else {
      encode(falseList, (trueList.size, trueList.head) :: resultList)
    }
  }
}
