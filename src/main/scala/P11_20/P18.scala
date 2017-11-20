package P11_20

object P18 extends App {
  val result = slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  println(result)

  private def slice(startIndex :Int, endIndex :Int, targetList: List[Symbol], resultList: List[Symbol] = Nil) :List[(Symbol)] = targetList match{
    case Nil => resultList
    case _ if(targetList.size > startIndex && targetList.size <= endIndex) =>
      slice(startIndex, endIndex, targetList.init, targetList.last :: resultList)
    case _ => slice(startIndex, endIndex, targetList.init, resultList)
  }
}
