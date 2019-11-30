import scala.util.control._

object ObjBreak {
  def main(args: Array[String]): Unit = {
    var a=0
    val numList=List(1,2,3,4,5,6,7,8)
    val loop=new Breaks

    loop.breakable{
      for(a<-numList){
        println("Value of a is %d".format(a))
        if(a==4){
          loop.break()
        }
      }
    }
    println("After Loop")

    val calArea=(l:Int,b:Int)=>{
      println("Calaulatiing area of %d and %d".format(l,b))
       l*b
    }:Int

    println(calArea(4,5))
  }
}
