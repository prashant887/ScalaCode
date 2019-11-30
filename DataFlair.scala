import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException
case class Song(title:String,artist:String,track:Int)


object DataFlair {

  def add(args:Int*):Int={

    var sum=0
    for(i <- args){
      sum+=i
    }
    return  sum;
  }

  def hello(s:String): Unit ={
    println("Hello %s".format(s))
  }

  def hof(f:String=>Unit,s:String):Unit={
    f(s)
  }

  //Inner Func
  def outer(a:Int):Int={
    def inner(): Int ={
      return a*3;
    }
    return inner()
  }

  def sum(a:Int)(b:Int):Int={
    return  a+b;
  }


  def apply ( fname:String, lname:String):String={
    return  fname+" "+lname
  }
  def main(args: Array[String]): Unit = {
    println(add(1,2,3,4,5))

    val name : String = "Prashant "
    hof(hello,name)
    println("Outer/Inner %d".format(outer(3)))

    val s=sum(5)_
    println("Sum : %d".format(s(32)))

    val stay=Song("Stay","Inna",4)
    println("Song %s Artist %s Id %d ".format( stay.artist,stay.title,stay.track))

    println("prashant".regionMatches(true,2,"ash",0,3))
    println("potdotnothotokayslot".replaceAll(".ot","**"))

    val optlist=List(1,2,3)
    println(optlist.find(_>6))
    println(optlist.find(_>2))

    val optMap :Map[Int,String]=Map(1->"Jan",2-> "Feb",3->"mar")
    println(optMap.get(1).get)


    println("FullName %s".format(apply("prashant","laxmikant")))

    println("Split Name "+unapply("Prashant Laxmikant"))

    println("Split Name "+unapply("Prashant Laxmikant Hargoppa"))

    println("Split Name "+unapply("Prashant"))

    val it=Iterator(3,4,6,7,8)
    println("Count %d".format(it.count(_%2==0)))
    println("Is It hasNext "+it.hasNext)

    //println("Min Val %d".format(it.min))

    println("Is It hasNext "+it.hasNext)

    while(it.hasNext){
      println("Next Itr Val %d".format(it.next()))
    }
    println("Is It hasNext "+it.hasNext)

    val itf=Iterator(3,4,6,7,8)
    println(itf.forall(x=>{x%2==0}))

    println("Is Empty: "+it.hasDefiniteSize)

    val age=25

    if (age<18){
      throw new Exception("YOu cant vote")
    }
    else {
      println("YOu are %d can Vote".format(age))
    }

    println("HofAdd : %d".format(HofAdd(40,50)))
    println("HofSub : %d".format(HofSub(30,12)))

    println("HofGenAdd : %d".format(HofGeneric(HofAdd,20,50)))
    println("HofGenSub : %d".format(HofGeneric(HofSub,50,20)))

    //List Tabulation

    val squares=List.tabulate(6)(n=>n*n)
    val muldim=List.tabulate(3,4)((x,y)=>x*y)
println(squares)
    println(muldim)
  }

  def unapply(arg:String): Option[(String,String)] = {
    val parts=arg.split(" ")
    if (parts.length==2){
      Some(parts(0) ,parts(1))
    }
    else
      {
          None
      }
  }

try{
  val f=new FileReader("Input,txt")
}
  catch {
    case ex:FileNotFoundException=>{
      println("File Not Found")
    }
    case ex:IOException=>{
      println("IO Exception")
    }
  }
  finally {
    println("Ending Up the Programme")
  }

  def HofAdd(a:Int,b:Int):Int={
    return a+b
  }


  val HofSub=(a:Int,b:Int)=>{a-b}:Int

  def HofGeneric(fun:(Int,Int)=>Int,a:Int,b:Int):Int={
    fun(a,b)
  }

}

