package P11_20

object P13 extends App {
  val result = encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  println(result)

  private def encodeDirect(targetList: List[Symbol], resultList: List[(Int, Symbol)] = Nil) :List[(Int, Symbol)] = {
    val (trueList, falseList) = targetList.span(_ == targetList.head)
    if (falseList.isEmpty){
      ((trueList.size, trueList.head) :: resultList).reverse
    } else {
      encodeDirect(falseList, (trueList.size, trueList.head) :: resultList)
    }
  }
}
