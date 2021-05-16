/*Instance Methods and Static Methods
* Companion class , name of object and class should be same
* companion obj and class objects are access to each other
* */

class Companion {
  Companion.instanceCount+=1
  def testClassMethod():Unit={
    println("This is class Method")
  }
  def objMethod():Unit = Companion.testObjMethod()
}

object Companion {
  def testObjMethod():Unit={
    println("This is Obj Method")
  }
  var instanceCount:Int=0

  def printInstaceCount():Unit={
    printf("Current Instance Count = %d\n".format(instanceCount))
  }
}
object ScalaCompanionObjects {
  def main(args: Array[String]): Unit = {
    val obj=new Companion()
    obj.testClassMethod()
    obj.objMethod()

    for  (i <- (1 to 10)){
      new Companion()
    }
   Companion.printInstaceCount()

  }
}
