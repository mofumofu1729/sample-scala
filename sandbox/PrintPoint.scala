class Point(val x: Int, val y: Int) {
  def +(p: Point): Point = {
    new Point(x + p.x, y + p.y)
  }

  override def toString(): String = "(" + x + ", " + y + ")"
}

object PrintPoint {
  def print_point(): Unit = {
    val p1 = new Point(1, 1)
    val p2 = new Point(2, 3)

    println(p1 + p2)
  }

  def main(args: Array[String]): Unit = {
    println("call print_point")

    print_point()
  }
}