
/**
  * 클래스는 하나의 부모 클래스만 가질 수 있다.
  * Trait 를 사용하면 여러가지 상속 받을 수 있다.
  *
  */

object Lesson3 {
  abstract  class Base {
    def foo = 1
    def bar : Int

    class Sub extends Base {
      override def foo: Int = 2
      override def bar = 3
    }

    val s = new Sub
    s.foo
    s.bar
  }
/**
  trait List[T] {
    def isEmpty: Boolean
    def head: T
    def tail: List[T]
  }
  class Cons[T](val head: T, val tail: List[T]) extends List[T] {

//    override def head : T = throw new Exception ("invalid")
//    override def tail : List[T] = throw new Exception("invalid tail")
    override def isEmpty = false
  }
  class Nil[T] extends List[T] {
    override def isEmpty = false

    override def head =   throw new Exception ("invalid")

    override def tail =throw new Exception("invalid tail")
  }
  val list = List[Int] = new Cons[Int](1, new Nil[Int])

  def singleton[T](elem:T): List[T] = new Cons[T] (elem, new Nil[T])
  singleton(1) // type 을 알아서 정의해준다.
  singleton[Boolean](true)
*/

  abstract class Animal {
    def name :String

  }
  abstract class Pet extends Animal

  class Cat extends Pet {
    override def name = "cat"
  }
  class Dog extends Pet {
    override def name = "dog"
  }
  class Lion extends Animal {
    override def name = "lion"
  }
  class PetCage[P <:Pet] (p:P) { // 상속관계를 정의한다. UpperTypeBound
    def pet: P = p

  }
  val dogC = new PetCage(new Dog)
  val catC = new PetCage(new Cat)
//  val lionC = new PetCage(new Lion)
  def process(animals: List[Animal]): Unit = {
    animals.foreach(ea => println(ea.name))
  }
  val cats = List(new Cat)
  val dogs = List(new Dog)
  process(cats)
  process(dogs)

}