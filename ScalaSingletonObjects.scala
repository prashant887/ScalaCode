/*

Can call objects and object methods directly , these are singletons , only one instance
 */
object TestObj {
  def testObjMethod():Unit={
    println("THis is a test Method")
  }
}

object ScalaSingletonObjects
{
def main(args: Array[String]): Unit = {
  TestObj.testObjMethod()

}

}
