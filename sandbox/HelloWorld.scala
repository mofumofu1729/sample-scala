object HelloWorld {
  def print_hello(): Unit = {
    println("Hello, World!")
  }

  def main(args: Array[String]): Unit = {
    println("call print")

    print_hello()
  }
}
