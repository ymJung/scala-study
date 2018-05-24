
object Lesson5 {
  val pair = ("answer", 42)
  val (label, value) =  pair
  pair._1
  pair._2

  val tup3 = Tuple3(1,2,3, "anything", 0.5, 1)
  val numV = Vector(1,3,5, 99)

  -5 +: numV
  numV :+ 999
  val ranR = 1 until 5
  ranR.toList
  (1 to 5).toList
  (1 to 10 by 3).toList // 3씩 건너뛴다.
  (6 to 1 by -2).toList
  val st = Stream(1,2,3,4,5)
  // 주로 List 연산을 map 이나 filter 를 통해 사용 하기 위해 사용
  val capital = Map(
    "KR"->"Seoul"
    "JP"->"Tokyo"
    "CN"->"Beijing")
  capital("KR")
  capital.get("JP")

  def doSomething(n: Int): Either[String, Int] =
    if (n%2 == 0) Right(n)
    else Left("Its not even number")
  doSomething(4) match {
    case Right(n) => "Result :" + n // case matching - 숫자면 나온다.
    case Left(msg) => msg // case matching - 메시지 출력
  }
  val try1 = Try(4/2)
  val try2 = Try(4/0) // exception << 문제가 발생해도 다른 프로세스 전체에 영향을 미치지 않는다.

  

}