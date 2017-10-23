package P01_10

object P08 extends App {
  val result = compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  println(result)

  private def compress(targetList: List[Symbol], resultList: List[Symbol] = Nil):List[Symbol] = {
    val (trueList, falseList) = targetList.span(_ == targetList.head)
    if (falseList.isEmpty){
      (trueList.head :: resultList).reverse
    } else {
      compress(falseList, trueList.head :: resultList)
    }
  }
}
