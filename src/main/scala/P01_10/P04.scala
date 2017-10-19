package P01_10

object P04 extends App {
  val result = length(List(1, 1, 2, 3, 5, 8))
  println(result)

  private def length(list: List[Int]):Int = list.length
}
