object Collections {

  def main(args: Array[String]): Unit = {
    val (even,odd)=(1 to 100).par.partition(x=>{x%2==0})

    println("Even :"+even)
    println("Odd: "+odd)

    val a=Array(1,2,3)
    println("a:"+a.mkString(" "))
    a.update(1,5)
    println("a:"+a.mkString(" "))

    val l=List(4,5,6,7,9)
    println("l :"+l.mkString(" "))


    println(a.isInstanceOf[Int])

    val s:String="10"

    println(s.isInstanceOf[String])

    println(l.sortBy(x=>{-x}))
    println(l.sortWith((x,y)=>{x<y}))

  }
}
