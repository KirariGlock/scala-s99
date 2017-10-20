package P01_10

object P07 extends App {
  val result = flatten(List(List(1, 1), 2, List(3, List(5, 8))))
  println(result)

  private def flatten(list: List[Any]):List[Any] = {
    var resultList: List[Any] = List()
    for (value <- list){
      resultList = value match {
        case listDetail: List[Int] => flatten(listDetail).reverse ::: resultList
        case number: Int => number :: resultList
      }
    }
    resultList.reverse
  }

}
