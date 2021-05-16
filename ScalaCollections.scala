import scala.collection.mutable.ArrayBuffer

object ScalaCollections {

  def main(args: Array[String]): Unit = {

    /* Array is not mutable , for val reference becomes immutable*/

val arr= new Array[Int](10)
    var ar:Array[Int]=Array(1,2,3)
    arr(4)=3
    println(arr.length)
println(ar.length)

    val buffArr=new ArrayBuffer[Int]()

    println(buffArr.length)

    for (n <- ar) {
      println(n)
    }
    println(ar.sum)


    /* Maps */
    val m = Map(1->"One",2->"Two")
  }
}
