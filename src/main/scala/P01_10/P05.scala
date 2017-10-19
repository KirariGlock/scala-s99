package P01_10

object P05 extends App {
  val result = reverse(List(1, 1, 2, 3, 5, 8))
  println(result)

  private def reverse(list: List[Int]):List[Int] = list.reverse
}
