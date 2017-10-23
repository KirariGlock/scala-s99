package P01_10

object P09 extends App {
  val result = pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  println(result)

  /**
    * targetListに与えられた連続した文字列を1つのListにまとめ、それをListにまとめて返します。
    * @param targetList 対象リスト
    * @param resultList 結果リスト(再帰処理内部で使用します。)
    * @return argetListに与えられた連続した文字列を1つのListにまとめたList
    */
  private def pack(targetList: List[Symbol], resultList: List[List[Symbol]] = Nil):List[List[Symbol]] = {
    val (trueList, falseList) = targetList.span(_ == targetList.head)
    if (falseList.isEmpty){
      (trueList :: resultList).reverse
    } else {
      pack(falseList, trueList :: resultList)
    }
  }
}
