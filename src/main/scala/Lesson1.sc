import scala.annotation.tailrec

val x = 1
val message : String = "hello scala"

object Lesson1 {
  "hello scala"
  val num : Int = 16
  val message : String = "hey scala!"
  //  num = 12

  var varNum = 12
  var varMsg = "varMsg"
  varMsg = "change"
  varNum = 0
}
def square(x: Int) = x * x // 함수

square(5)

def doSomething(n:Int): Unit = { // 아무것도 리턴하지 않음. 주로 I/O 작업

}

val d = 1 //  즉시 표현식의 평가가 이루어짐
def e = 1 // 참조될때마다 표현식으로 치환됨

def abs(x:Int) = if ( x >= 0 ) x else -x // 3항 연산자와 비슷하다.

// Block Expression
// - 선언이나 표현식을 하나로 묶은단위
// - 가장 마지막 표현식이 Block 전체의 값이 됨
// - 표현식이 존재할 수 있는 위치에는 Block 도 올수 있음
val result = {
  // scope 는 여기
  def f(y:Int) = {
    y * y
  }
  val x = f(3)
  x*x

}
// ; 은 줄나누기 용


def expr = {
  val x = { print(" x "); 1} //선언되고 정의된 즉시 표기
  lazy val y = { print(" y "); 2} //y가 참조 될때 표기
  def z = {print( " z "); 3} // z가 참조되면 표기
  z + y + x + z + y + x
}
expr


// Recursion
// - ex GCD

def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a%b)

gcd(14,21)

def factorial(n:Int): Int = if (n == 0) 1 else n * factorial(n - 1)

factorial(3)

// recursion 은 과도하게 사용되면 STO 가 발생한다.

// - 재귀를 하면서 인자값에 결과값을 가지고 있으면 사용할 수 있다. (tail recursion)
// - scala 는 자동으로 해준다. (@tailrec )



//@tailrec
def n_factorial(n:Int): Int =
  if (n == 0) 1 else {
  n * n_factorial(n - 1)
}


(x:Int, y:Int) => x + y // 익명함수
val twice : Int => Int = _ * 2 // _ 첫번째 인자.

