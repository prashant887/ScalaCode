object ObjExtractor {

  def main(args: Array[String]): Unit = {
    println(apply("ABC","DEF","XYZ"))
    println(upapply("ABC:DEF:XYZ"))
    println(upapply("ASDCF"))
  }
  def apply(a:String,b:String,c:String):String={
    a+":"+b+":"+c
  }

  def upapply(str:String):Option[(String,String,String)]={
    val parts = str split ":"
    if (parts.length==3){
      Some(parts(0) ,parts(1),parts(2))
    }
    else{
      None
    }
  }
}
