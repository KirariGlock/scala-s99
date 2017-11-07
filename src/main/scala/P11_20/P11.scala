package P11_20

object P11 extends App {
  val result = encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  println(result)

  private def encodeModified(targetList: List[Symbol], resultList: List[Any] = Nil) :List[Any] = {
    val (trueList, falseList) = targetList.span(_ == targetList.head)
    (trueList, falseList) match {
      case (t, Nil) if t.size == 1 => (t.head :: resultList).reverse
      case (t, Nil) => ((t.size, t.head) :: resultList).reverse
      case (t, f) if t.size == 1 => encodeModified(f, t.head :: resultList)
      case (t, f) => encodeModified(f, (t.size, t.head) :: resultList)
    }
  }
}

