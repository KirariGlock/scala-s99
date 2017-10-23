package P01_10

object P10 extends App {
  val result = encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  println(result)

  /**
    * targetListに与えられた連続した文字列の個数をカウントして、その値と文字列のタプルをListにして返します。
    * @param targetList 対象リスト
    * @param resultList 結果リスト(再帰処理内部で使用します。)
    * @return 結果リスト
    */
  private def encode(targetList: List[Symbol], resultList: List[(Int, Symbol)] = Nil) :List[(Int, Symbol)] = {
    val (trueList, falseList) = targetList.span(_ == targetList.head)
    if (falseList.isEmpty){
      ((trueList.size, trueList.head) :: resultList).reverse
    } else {
      encode(falseList, (trueList.size, trueList.head) :: resultList)
    }
  }
}
