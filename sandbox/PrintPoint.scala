import scala.collection.mutable.ArrayBuffer

class Point(val x: Int, val y: Int) {
  def +(p: Point): Point = {
    new Point(x + p.x, y + p.y)
  }

  override def toString(): String = "(" + x + ", " + y + ")"
}

class Complex(real: Double, imaginary: Double) {
  def re = real
  def im = imaginary
}

class Person(name: String = "taro", age: Int) {
  override def toString(): String = name + "(" + age + ")"
}

trait Pet {
  val name: String
}

class Cat(val name: String) extends Pet
class Dog(val name: String) extends Pet

object PrintPoint {
  def print_point(): Unit = {
    val p1 = new Point(1, 1)
    val p2 = new Point(2, 3)

    println(p1 + p2)
  }

  def main(args: Array[String]): Unit = {
    println("call print_point")

    print_point()

    val c = new Complex(1.2, 3.4)
    println(c.re)

    val person = new Person(age = 25)
    println(person)

    val dog = new Dog("Harry")
    val cat = new Cat("Sally")

    val animals = ArrayBuffer.empty[Pet]
    animals.append(dog)
    animals.append(cat)
    animals.foreach(pet => println(pet.name))
   
    val salaries = Seq(20000, 70000, 40000)
    val doubleSalary = (x: Int) => x * 2
    val newSalaries = salaries.map(doubleSalary)
    println(newSalaries)
  }
}
