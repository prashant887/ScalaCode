class auxClass (){
var name:String="Default"
var age:Int=0
  def this( name: String, age: Int) {

    this()
    this.name=name
    this.age=age
  }

  def Show(): Unit = {
    println("Name %s age %d".format(name, age))
  }
}
  object auxDemo{
    def main(args:Array[String]):Unit={
      val a=new auxClass("Prashant",10)
      a.Show()

      val b=new auxClass()
      b.Show()
    }
  }


