abstract  class Polygon {

/*  def area:Double ={
   return 0.0
  }*/

  def area : Double;
}
//create abstract class to restrict instantiating super class , and also derived class has all methods implimented
object Polygon{

  def main(args:Array[String]):Unit={

    //val poly=new Polygon()
    //printArea(poly)

    val rect=new Rectangle(2.5,5.7)
    printArea(rect)
    println(rect.color)

    val tri=new Triangle(4.5,2.3)
    printArea(tri)
  }

  def printArea(p:Polygon): Unit ={
    println(p.area)
  }
}
