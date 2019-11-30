/*
A value class not allowed to extends traits , To permit value classes to extend traits ,
universal traits are introduced which extends for Any
 */
trait Printable extends  Any{ //universal trait
  def print():Unit=println(this)
}

class Wrapper(val underlying:Int) extends AnyVal with Printable //cannot extend any trait


object ValueClass {

  def main(args: Array[String]): Unit = {
    val w=new Wrapper(4)
    w.print()
  }
}
