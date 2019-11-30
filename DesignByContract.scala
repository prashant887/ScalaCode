

object DesignByContract {

  def grantLicense(age:Int,year:Int):Unit={
   // assume(age>=18)
//require(age>18)
    println(2019-year)
  } ensuring(2019-year==age)

  def main(args: Array[String]): Unit = {


    val  age:Int=19
   // assert(age>15)

    grantLicense(age,2000)


  }
}
