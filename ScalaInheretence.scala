abstract class MyAbstractFile {
  def open(filename:String ):Unit
  def save(filename:String):Unit


}

class MyFile extends MyAbstractFile {
  override def open(filename:String):Unit={
    println("MyFile Class : Open File "+filename)
  }
  override def save(filename:String):Unit={
    println("MyFile Class : Saving File "+filename)
  }
}

class CompressedFile extends MyFile {
  override def open(filename:String):Unit={
    println("CompressedFile Class : Open Compressed File "+filename)
    super.open(filename)
  }

}

object ScalaInheretence {
  def main(args: Array[String]): Unit = {

    val fil: MyAbstractFile = new MyFile() //Run time polymorphism
    fil.open(filename="abc.txt")
    fil.save(filename = "abc.txt")

    val com = new CompressedFile()
    com.open(filename = "file.zip")
    com.save(filename = "file.zip")

  }
}
/* use override key against child method to not change signature/overload method */