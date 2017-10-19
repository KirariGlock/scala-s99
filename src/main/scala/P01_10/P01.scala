package P01_10

object P01 extends App {
  val result = last(List(1, 1, 2, 3, 5, 8))
  println(result)

  private def last(list: List[Int]):Int = list.last
}
