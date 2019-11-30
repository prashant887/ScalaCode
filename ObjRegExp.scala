import scala.util.matching.Regex

object ObjRegExp {

  def main(args: Array[String]): Unit = {
    val pattern="(S|s)cala".r
    val str="Scala is scalable and cool"
    println(pattern findFirstIn str)
    val pattern2=new Regex("(S|s)cala")
    println((pattern2 findAllIn str).mkString(","))
    println(pattern replaceFirstIn(str,"Java"))
    println(pattern replaceAllIn(str,"Java"))
  }
}
