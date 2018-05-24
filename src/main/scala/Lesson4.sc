import scala.annotation.tailrec

/**
  *scala 의 list 는 immutable 이다.
 *
 */
//val xs =   List(1,2,3,4)
//
//val nums = 1::2::3::4::Nil // Nil - empty list
//
//List(2::xs)
object Lesson4 {
  val list=  List(1,2,3)
  list.head
  list.tail
  list
  val list2=  list.reverse
  val list3 = list.updated(1,4) // 1st(0,1) index change 4

  @tailrec
  def last(list:List[T]): T = list match {
    case Nil => throw new Error("empty !")
    case List(x) => x
    case x::xs => last(xs) // 2개 이상일 때 pattern matching -> x remain -> xs
  }

  last(List(1,2,4,5,6))
  last(List("abcd"))
//  last(List())

  val numbers = List(1,2,3,4,5,6,7,8,9,10)
  val twice = numbers.map(x => x *2)
  val even = numbers.filter(x=> (x%2) == 0)
}


