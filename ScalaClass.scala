//var or val if not used in construter like name , age then cannot use class variable , getter setter
/*
vartype   getter  setter
--------------------------
var       yes      yes
val       yes      No
default   No       No
 */
class ScalaClass(private var name : String,var age :Int)/*primary constructor*/ {

  //auxilary constructor will always start with this

  def this(){ /*Constror that takes no param*/
    this("Tom",22) //Need to call main consttor
  }

  def this(name:String ){ /*Constrotr that takes 1 param*/
    this(name,23)
  }

  def this(age:Int){
    this("Lau",age)
  }

def getName():String={
  return  name;
}

}

//Inheritence can be used when there is a "is a " relatioship like triangle is a poloygon
object Demo{

  def main(args:Array[String]) : Unit={

    var cls=new ScalaClass("Max",18)
    println("Name %s age %d".format(cls.getName(),cls.age))
    cls.age=17
    println("Name %s age %d".format(cls.getName(),cls.age))

    var aux1=new ScalaClass()
    println("aux1 Name %s age %d".format(aux1.getName(),aux1.age))

    var aux2=new ScalaClass(18)
    println("aux2 Name %s age %d".format(aux2.getName(),aux2.age))

  }
}