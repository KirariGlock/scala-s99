package P11_20

object P12 extends App {
  val result = decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
  println(result)

  private def decode(targetList: List[(Int, Symbol)], resultList: List[Symbol] = Nil):List[Symbol] = targetList match {
    case Nil                     => resultList.reverse
    case (index, symbol) :: tail =>  decode(tail, List.fill(index)(symbol) ::: resultList)
  }
}
