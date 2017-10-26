package P01_10

object P06 extends App {
  println(isPalindromeSimple(List(1, 2, 3, 2, 1)))
  println(isPalindrome(List(1, 2, 3, 2, 1)))

  private def isPalindromeSimple(list: List[Int]):Boolean = list == list.reverse

  private def isPalindrome(list: List[Int]):Boolean = list == reverse(list)

  private def reverse(targetList: List[Int], resultList: List[Int] = Nil): List[Int] = {
    if (targetList.isEmpty){
      resultList
    } else {
      reverse(targetList.tail, targetList.head :: resultList)
    }
  }
}
