


// 객체 지향 관점의 Scala
// - class

object Lesson2 {
  class Rational(x:Int, y:Int) {
    require( y > 0, "denom must positive" ) // 매개변수가 요구조건에 일치하지 않을때 Illegal Arg exc ept 발생

//    def numer = x
//    def denom = y

    def +(r: Rational) = new Rational(numer * r.denom + r.numer * denom,
      denom * r.denom)
    override def toString(): String = {
      numer + "/" + denom
    }
    private def gcd(x:Int, y:Int): Int =
      if(y == 0) x else gcd (y, x % y)

    private val g = gcd(x,y)

    val numer: Int = x / g
    val denom : Int = y / g


    def less (that:Rational): Boolean = {
      this.numer * that.denom < that.numer * this.denom
    }
    def max (that:Rational) : Rational = {
      if (this.less(that)) that else this
    }
  }
  val r = new Rational(2,3)
  r.numer // 객체의 인자에 접근
  r.denom
  var s = new Rational(1, 6)
  r + s


  class Member {
    def show = {  ("member") }
  }
  class Admin extends Member { // 상속한다.
    override def show : String = { ("admin")} // 오버라이드 가능
  }
  val member = new Member
  member.show
  val admin = new Admin
  admin.show

}