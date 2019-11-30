class OvrrideConstructor(val xc:Int,val yc:Int) {

  var x:Int=xc
  var y:Int=yc

  def displayPoint(): Unit ={
    println("OvrrideConstructor X=%d Y=%d".format(x,y))
  }

  def move(xd : Int,yd:Int):Unit={
    x+=xd
    y+=yd
    println("OvrrideConstructor X is moved by %d".format(xd))
    println("OvrrideConstructor Y is moved by %d".format(yd))

  }

}

class Location(override val xc:Int,override val yc:Int,val zc:Int)  extends OvrrideConstructor(xc,yc) {
var z=zc

  def move(dx:Int,dy:Int,dz:Int):Unit={
     move(dx,dy)
    z+=dz
    println("Location Z was moved by %d".format(zc))
  }

  def displayLocation():Unit={
    displayPoint()
    println("Location Z=%d".format(z))
  }

}

object OvrrideConstructorDemo{
  def main(args: Array[String]): Unit = {
    val OvCoDm=new OvrrideConstructor(23,45)
    OvCoDm.displayPoint()
    OvCoDm.move(12,43)
    OvCoDm.displayPoint()

    val loc=new Location(10,20,30)
    loc.displayLocation()
    loc.move(11,22,33)
    loc.displayLocation()
  }
}
