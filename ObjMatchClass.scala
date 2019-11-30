object ObjMatchClass {

  def main(args: Array[String]): Unit = {
    println(matchDemo(4))
    println(matchDemoAny(1))
    println(matchDemoAny(100))
    println(matchDemoAny(12.2))
    println(matchDemoAny("two"))
    println(matchDemoAny("five"))
  }

  def matchDemo(x:Int):String =x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }

  def matchDemoAny(x:Any):Any=x match {
    case 1 => "one"
    case "two" => 2
    case y:Int=> "scala>int"
    case z:String => "String"
    case _ => "many"
  }
}

