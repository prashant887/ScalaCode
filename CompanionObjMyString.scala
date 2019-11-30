class CompanionObjMyString(val MyString:String) {

  private var ExtraString:String=""

  override def toString():String={
    return MyString+" "+ExtraString
  }
}

object CompanionObjMyString{
  def apply(str1:String,str2:String):CompanionObjMyString={
    val obj=new CompanionObjMyString(str1)
    obj.ExtraString=str2
    return obj
  }

  def apply(str:String):CompanionObjMyString={
    val obj=new CompanionObjMyString("Default")
    obj.ExtraString=str
    return obj
  }
}

object ApplyingString{
  def main(args: Array[String]): Unit = {
    println(CompanionObjMyString.apply("Hello","World"))
    println(CompanionObjMyString.apply(" Hello"))
    println(CompanionObjMyString("Single "))
    println(CompanionObjMyString("Double","Hello"))
  }
}