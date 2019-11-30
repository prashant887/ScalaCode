case class CaseClass(var OrderId:Int,var OrderDate:String,var OrdCnt:Int,var OrdSts:String)

object ObjCaseClass{

  def main(args: Array[String]): Unit = {
    val obj=CaseClass(21,"2010-08-27",35,"PENDING")

    println("ProdArtrity: "+obj.productArity)
    println("\n productElement : "+obj.productElement(2) +" "+obj.productElement(1))
    println("\n ProductPrefix: "+obj.productPrefix)
    println("\n ProductIterator")
    obj.productIterator.foreach(x=>{println(x)})
  }
}