class ApplyClass() {
private var a:Int=0
}



object ApplyClass{
  def main(args: Array[String]): Unit = {

    val obj=new ApplyClass()
    println(obj.a)
    obj.a=56
    println(obj.a)
  }
}