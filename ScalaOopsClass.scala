class myClass(private val name:String,private val age:Int)/*this is primary CONSTRCTOR*/ {

  println("Class myClass was instantiated")

  /*auxilary constructor*/
  def this(name:String){
    this(name,20)
  }

  def this(age:Int){
    this("Prashant",age)
  }

  /*Define constructor same as class name*/
  def testMethod():Unit={
    printf("Name = %s  Age = %d\n".format(name,age))
  }
}

object ScalaOopsClass {
  def main(args: Array[String]): Unit = {
    val obj=new myClass(name = "Prashant",age = 25)
    //println(obj.age)
    obj.testMethod()

    val sec_obj = new myClass(name = "Laxmikant")
    sec_obj.testMethod()

    val thrid_obj=new myClass(age = 30)
    thrid_obj.testMethod()
  }
}
