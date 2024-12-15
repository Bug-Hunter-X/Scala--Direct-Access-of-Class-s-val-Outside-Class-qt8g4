```scala
class MyClass(val name: String) {
  def getName(): String = {
    name
  }
}

object MainObject {
  def main(args: Array[String]): Unit = {
    val myObject = new MyClass("John")
    println(myObject.getName()) //This line works fine
    println(myObject.name) //This will throw error because name is a val and is not accessible outside the class
  }
}
```