package P01_10

object P06 extends App {
  val result = isPalindrome(List(1, 2, 3, 2, 1))
  println(result)

  private def isPalindrome(list: List[Int]):Boolean = list == list.reverse
}
