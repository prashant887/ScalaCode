class Strict {

  val e={
    println("strict")
    9
  }

}

class lazyeval {
  lazy  val l={
    println("lazy")
    9
  }
}

object Lazy{
  def main(args:Array[String]) :Unit={
    val x=new Strict;
    val y=new lazyeval;

    println(x.e)
    println(y.l)
  }
}
