```scala
class MyClass[T](val value: T) {
  def printValue(): Unit = {
    println(value)
  }
}

object MainObject {
  def main(args: Array[String]): Unit = {
    val myInt = new MyClass(10)
    myInt.printValue() //Prints 10

    val myString = new MyClass("Hello")
    myString.printValue() //Prints Hello

    val myList = new MyClass(List(1, 2, 3))
    myList.printValue() //Prints List(1, 2, 3)

    val myOption = new MyClass(Some(42))
    myOption.printValue() //Prints Some(42)

    val myNull = new MyClass(null) //Error: NullPointerException in runtime
    myNull.printValue()
  }
}
```