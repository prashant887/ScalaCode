import java.util.Date
import Array._
object HelloWorld {

  def add(x:Int,y:Int):Int={
    return  x+y;
  }

  def callByVal(a:Int): Unit ={
    println("callByVal")
    println(a)
  }

  def callByName(a: => Int):Unit={
    println("Call by Name")
    println(a)
  }

  object  Math{
    def sub(a:Int,b:Int) : Int={
      return a-b;
    }

    def +(x:Int =30,y:Int =15):Int={
      return  x+y;
    }
  }
  def main(args:Array[String]): Unit ={
    println("Hello World of Scala")

    val name:String="Prashant"
    val age:Float = 32.5f

    println(name +" is "+age+" year old")

    for (i <- 1 until 6){
      println(i)
    }
//for {i <- 1 to ;j<- 1 to 3}
for {i <- 1 to 5
     j<- 1 to 3}{

  println(i,j)
}
    //case
    age match {
      case  x if x>18 => println("Audlt");
      case _ => println("Minor")
    }

    println(Math.sub(10,5))
    println(Math.+(15,20))

    //anonmyous function

    var ad=(x:Int,y:Int)=>x+y;
    println(ad(50,60))

    //higher order function
    def hof(x:Int ,b:Int,f:(Int,Int)=>Int)={
      f(x,b)
    }

    println(hof(11,22,(x,y)=>x+y))

    def maxmin(x:Int,y:Int,z:Int,f:(Int,Int)=>Int):Int={
      f(f(x,y),z)
    }

    println(maxmin(13,45,23,(x,y)=>x min y))
//partially applied functions => fixed value for some variable some at run time

    val sm=(a:Int,b:Int,c:Int)=> a+b+c ;
    val f=sm(10,_,_)

    println(f(20,30))

    def log(date:Date,ErrorType:String,ErrorMessage : String): Unit ={
      println(date+":"+ErrorType+":"+ErrorMessage)
    }

    val date=new Date();
    val WarnLog=log(date,"WARNING",_)
    val ErrorLog=log(date,"ERROR",_)

    WarnLog("Warning in Function")
    ErrorLog("Error in Function")

    //closure is function which uses one or more variable declared outside function

    var  num:Int=10 //Impure closer , val num=10 pure closure

     val a=(x:Int)=>{x+num}
    println(a(12))

    //currying is a techinique of transforming a function that takes multiple argument
    // into a function that makes single argument

def curringadd(x:Int)=(y:Int)=>x+y;

    println(curringadd(10)(30))

    val sum40=curringadd(40)//partail function
    println(sum40(30))

    //simplecurrying x:Int)(y:Int) = x+y
    def simplecurrying(x:Int)(y:Int):Int={
      return x+y;}

    println(simplecurrying(10)(20))

    val sum30=simplecurrying(40)(_)//partial function
    println(sum30(30))

//String
    val str :String="Hello World"
    println("String length " + str.length)
    println(str.concat(" Hi "))
    println("%d -- %d -- %s".format(sum30(34),sum40(20),str))

//Arrays
val ary : Array[Int]=new Array[Int](10);
    val ary2=new Array[Int](5)
    val ary3=Array("my","name","is","prashant")
    ary2(2)=20
    for (i<-ary2){
      println(i)
    }
    println("Length of Array %d".format(ary3.length))


    for (i <- concat(ary,ary2)){
      println(i)
    }

    //Lists are immutiable

    val lst:List[Int]=List(1,2,3)
println(12::lst)//cons

    for (i <- lst){
      println("List Values %d".format(i))
    }
    println(Nil)
    println(1::3::Nil) //create list
lst.sorted
    lst.foreach(println)
    lst.foreach(i=>{
      println( "List Elements Foreach %d".format(i))
    })
    var sum : Int=0
    lst.foreach(sum+=_)
    println("Sum of List %d".format(sum))

    //Sets can be mutiable or immutiable

    //By default all sets are immutable

    val immutableSet : Set[Int]=Set(1,3,5,7,3,4,2)

    //var mutableSet : scala.collection.mutable.Set[Int]=scala.collection.mutable.Set[Int](1,3,4,2,4,2,5,6,7,3)
    var mutableSet=scala.collection.mutable.Set[Int](2,3,5,6,3,2,4,5)

    //add value to set
    println(immutableSet+10)
    println(immutableSet)

     //check if elemt in set
    println(immutableSet(5))

    for (i<-immutableSet){
      println("Set Elements %d".format(i))
    }

    println(mutableSet)
    mutableSet+=(44,67)
    println(mutableSet)

    //myset1++myset2 to concat 2 sets , myset1.&(myset2)/myset1.intersect(myset2) -> find intersection ,

    //Maps key value pair , mutiable and unbutiable map
     val immutableMap:Map[Int,String]=Map(1->"Jan",2->"Feb",3->"Mar")
    println(immutableMap)
    println(immutableMap(2))
    println(immutableMap.keys)
    println(immutableMap.values)

    immutableMap.keys.foreach(key=>{
      println("key %d Value %s".format(key,immutableMap(key)))
    })

    immutableMap.keys.foreach(println)
    println(immutableMap.contains(2))
    //add 2 maps map1++map2

    //Tuples , immutiable

    val tpls=(1,'a',"Hello",true)
    println(tpls)
    val nwTpl=new Tuple3/*numberofelems*/(1,'z',"World")
    println(nwTpl)

    tpls.productIterator.foreach(
      i=>{
        println("Tuple elemens "+i )
      }
    )

    println(nwTpl._2)

    //Options(instance of Some or Instance of None) ,find will give None or Some

    val optlist=List(1,2,3)
    val optMap :Map[Int,String]=Map(1->"Jan",2-> "Feb",3->"mar")

    println(optlist.find(_>6))
    println(optlist.find(_>2))

    println(optMap.get(1))
    println(optMap.get(4))

    println(optlist.find(_>2).get)
    println(optMap.get(1).get)

    println(optlist.find(_>6).getOrElse("Not Found"))
    println(optMap.get(4).getOrElse("No Name Found"))

    println(optMap.get(3).getOrElse("No Map"))


    val Opt : Option[Int]=Some(5)
    println(Opt)

    //Map and Filter
    println(lst.map(_*2))
    println(lst.map(i=>i*2))
    println(lst.map(x=>"hi"*x))
    println(optMap.map(x=>"hi"+x))
    println(optMap.mapValues(_+"hi")) //append values to map alone
    println("hello".map(x=>x.toUpper))
    println("WORLD".map(_.toLower))

    //flatten
    val NestedList=List(List(1,2,3),List(4,5,6),List(7,8,9))
    println(NestedList)
    println(NestedList.flatten)
    println(lst)
println(lst.flatMap(x=>List(x,x+1)))

    //filter
    println(lst.filter(_%2==0))
    println(NestedList.flatten.filter(x=> x%2==0))

    //Reduce Fold or Scan(Left/Right)
    //Reduce Takes associate  Binary Function
    val RedLntList=List(1,2,3,4,5,6,7,8,9)
    val RedStrList=List("a","b","c","d","e")

    println(RedLntList.reduceLeft(_+_))

    println(RedLntList.reduceLeft( (x,y)=> x+y))//takes function
    println(RedStrList.reduce((x,y)=>{println(x+" + "+y);x+y}))
    println(RedLntList.reduce((x,y)=>{println(x+" + "+y);x+y}))

    println(RedLntList.reduceRight((x,y)=>{println(x+" - "+y);x-y}))
    println(RedLntList.reduceLeft((x,y)=>{println(x+" - "+y);x-y}))

    //FlodLeft FloadRight takes initial val
    println(RedLntList.foldRight(23)((x,y)=>{println(x+" + "+y);x+y}))
    println(RedLntList.foldLeft(12)((x,y)=>{println(x+" + "+y);x+y}))

    //Scan Gives the Map of Operations
    println(RedLntList.scanLeft(0)(_+_))
    println(RedStrList.scanRight("")(_+_))

    //*******************************//////
    /////OBJECT ORIENTED PROGRAMMING///////
    //******************************///////

     val s=(a:Int,b:Int)=>{
        println("Add")
       a+b
     }
    callByVal(s(4,5))
    callByName(s(4,5))

    //scalA does not allow static msthods and vaiables so we have companion object and singleton class
    //Case Class -> class with Fixed Variable cant reassign values , deep copy shallow copy
    //write code before this
  }

}
