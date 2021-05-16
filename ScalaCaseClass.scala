case class CaseClass(name:String,Id:Int,Salary:Int)

object ScalaCaseClass {

  def main(args: Array[String]): Unit = {

    val CaseObjOne=CaseClass("Prashant",1,100)
    val CaseObjTwo=CaseClass("Prashant L",2,500)
    println(CaseObjOne==CaseObjTwo)
    val objThree=CaseObjTwo.copy(name = "Prashant L")
    println(CaseObjTwo==objThree)
    println(CaseObjOne.toString)


  }

}
