/* Traits are just like interfaces in java , traits can have state variables and can have method impimentation
* abstract vs traits
* abstract -> abstraction in common hirearchy , types of bank account
* tratis -> provide specification,have vendors have there own implimentation
* */

trait Speedometer {
  protected var speed:Float //State Variable
  def showSpeed:Float
  def accelerate(speed:Float)
  def decrease(speed:Float)
  def genericMethod():Unit={
    println("Generic Speed is " +speed)
  }
}

trait GenericSpeedometer[T]{
  protected var speed:T
  def showSpeed:T
  def accelerate(speed:T)
  def decrease(speed:T)

}