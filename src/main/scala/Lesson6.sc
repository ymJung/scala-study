

object Lesson6 {
  abstract Adder[T] {
    def add(x: T, y: T) : T
    def unit: T
  }
  implicit val strAdder: Adder[String] =
    new Adder[String] {
      def add(x:String, y:String): String = x + y
      def unit: String = ""
    }

  implicit val intAdder: Adder[Int] =
    new Adder[Int] {
      def add(x:Int, y:Int): Int = x + y
      def unit: Int = 0
    }

  def sum[T](xs:List[T])(implicit m:Adder[T]): T = //암시적 활용
    if (xs.isEmpty) m.unit
    else m.add(xs.head, sum(xs.tail)(m))

  sum(List("a","b","c")) // (strAdder) 없어도 결과가 나온다.
  sum(List(1,3,5,6,6,7))

  val condidate = (1 until 7) map (i =>
    (1 until i) map (j => (i, j)))

  def isPrime(n:Int):Boolean =
    (2 until n) forall (n % _ != 0)

  isPrime(5)


}