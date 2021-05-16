object ScalaTraitTest {

  def main(args: Array[String]): Unit = {
    val speed1:Dashboard=new Dashboard(speed = 25.2f)
    println("Speed is ",speed1.showSpeed)
    speed1.accelerate(speed = 2.3f)
    speed1.decrease(speed = 1.1f)
    speed1.genericMethod()

    val speed2:GenericDashboard[Int]=new GenericDashboard[Int](speed = 10)
    println("Speed is Int: ",speed2.showSpeed)
    speed2.accelerate(speed = 5)
    speed2.decrease(speed = 3)

    val speed3:GenericDashboard[Double]=new GenericDashboard[Double](speed = 15.2)
    println("Speed is Double: ",speed3.showSpeed)
    speed3.accelerate(speed = 3.40)
    speed3.decrease(speed = 1.2)
  }
}
