package P01_10

object P08 extends App {
  val result = compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  println(result)

  private def compress(list: List[Symbol]):List[Symbol] = {
    compressDetail(list.tail, list.head :: Nil)
  }

  private def compressDetail(targetList: List[Symbol], resultList: List[Symbol]): List[Symbol] ={
    if(targetList.isEmpty){
      resultList.reverse
    } else if(resultList.head == targetList.head){
      compressDetail(targetList.tail, resultList)
    } else {
      compressDetail(targetList.tail, targetList.head :: resultList)
    }
  }
}
