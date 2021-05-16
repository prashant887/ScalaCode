object WarmUp {


  def isOdd(x:Int):Boolean={
    if (x%2==0) {
      false
    }
    else {
      true
    }
  }

   def main(args: Array[String]): Unit
  = {
  {
    args.foreach(x=>{println(x)})
    var  a:Int=10
    printf("%d %s \n".format(a,"Hello World"))
    val ary:Array[Int]=Array(1,2,3,4,5,6)
    ary.foreach(x=>{println(x)})
    val tst=new TestClass
    val ar=tst.rtnArray(10)
    ar.foreach(x=>{println(x)})
    println(ar.reduce((x,y) => {x+y}))
    println(ar.fold(-1)((x,y)=>{x+y}))
    lazy val lv:Int =30
    println(lv)
    val num:Int=2
    val arr:List[Int]=List(1,2,3,4,5,6,7,8,9)
    arr.flatMap(List.fill(num)(_))
    arr.flatMap(List.fill(num)(_))
    println(arr)
    var vbl:Int=44

    val x:Int={ val a:Int=100
    val b:Int=300
      a+b
    }
    printf("Vale of x = %d".format(x))

    lazy val lzyAry:Array[Int]=Array(3,4,5,6,7)

    (1 to 10).toList.foreach(x=>{println(x)})

    println((1 to 10).toList.fold(10)((x,y)=>{x+y}))
    // println(Array(Array(1,2,3,4,5),Array(5,6,7,8)).flatMap())

    /* For Loop */
    for (i <- (1 to 20)){
      printf("Loop Value = %d\n".format(i))
    }

    for (i <- (0 to 21 by 2)){
      printf("Even  Numbers = %d\n".format(i))
    }

/* gaurd Condtion */

 for (i <- 0 to 20 ; j <- 0 to 10 ; if i==j)
   {
     printf("(%d,%d)\n".format(i,j))
   }


  }

     for ( i <- 0 to 20 ; if isOdd(i)) {
       printf("Odd Number = %d\n".format(i))
     }

     /*  YIELD result of each for loop iteration is stored in list , vector */
     lazy val  oddList=for ( i <- 0 to 20 ; if i % 2==0) yield(i)


     val nestedList=List(List(1,2,3),List(4,5,6))

println(nestedList.flatMap(x=>x))
     val str:String="My Name is prashant \n I am from Sagar \n I work in angalore"
     str.split('\n').flatMap(x=>{x.split(" ")}).map(x=>{(x,1)}).foreach(x=>{printf("Value = %s Count=%d\n".format(x._1,x._2))})


     val apple=Phone("Apple",List("Iphone-8","Iphone-10"))
     val samsung=Phone("Sasung",List("Glalaxy","Galaxy Note"))
     val google=Phone("Google",List("Pixle","Pixle-2"))
     val phoneList:List[Phone]=List(apple,samsung,google)
     println(phoneList.map(x=>{x.models}))
     println(phoneList.flatMap(x=>{x.models}))
     println(phoneList.map(x=>{x.models}).flatten)

   }
  class TestClass {
    def rtnArray( a:Int) : Array[Int]={
      var arry=Array.range(0,a)
      arry=arry.map(x=>{x*x})
      arry


    }
   }

   case class Phone(val name:String,val models : List[String] )
}
