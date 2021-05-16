class Dashboard(var speed:Float) extends Speedometer {

   def showSpeed: Float = speed

   def accelerate(speed: Float): Unit = {
     printf("Accelerating at a Speed of %f\n".format(speed))
   }

   def decrease(speed: Float): Unit = {
     printf("Decreasing at the speed of %f\n".format(speed))
   }



}

class GenericDashboard[T](var speed:T) extends GenericSpeedometer[T] {
   def showSpeed: T = speed

   def accelerate(speed: T): Unit = {
     println("Accelerating at the rate ",speed)
   }

   def decrease(speed: T): Unit = {
     println("Decreasing at the rate ",speed)
   }
}
