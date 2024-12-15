```scala
class MyClass(val name: String) {
  def getName(): String = {
    name
  }
}

object MainObject {
  def main(args: Array[String]): Unit = {
    val myObject = new MyClass("John")
    println(myObject.getName()) // Correct way to access the name
  }
}
```