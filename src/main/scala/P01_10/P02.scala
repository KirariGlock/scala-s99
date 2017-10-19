package P01_10

object P02 extends App {
  val result = penultimate(List(1, 1, 2, 3, 5, 8))
  println(result)

  private def penultimate(list: List[Int]):Int = list.init.last
}
