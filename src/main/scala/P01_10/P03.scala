package P01_10

object P03 extends App {
  val result = nth(2, List(1, 1, 2, 3, 5, 8))
  println(result)

  private def nth(index:Int, list: List[Int]):Int = list(index)
}
