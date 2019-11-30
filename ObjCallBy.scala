object ObjCallBy {

  /*Call by Value replaced all the variables with same value , Expression is executed only once*/
  def CallByValue(i:Int):Unit={
    println("CallByValue Day 1 Balance %d ".format(i))
    println("CallByValue Day 2 Balance %d ".format(i))
    println("CallByValue Day 3 Balance %d ".format(i))
    println("CallByValue Day 4 Balance %d ".format(i))
    println("CallByValue Day 5 Balance %d ".format(i))

  }

  /*Expression is executed everytime it is called*/
  def CallByName(i: =>Int):Unit={
    println("CallByName Day 1 Balance %d ".format(i))
    println("CallByName Day 2 Balance %d ".format(i))
    println("CallByName Day 3 Balance %d ".format(i))
    println("CallByName Day 4 Balance %d ".format(i))
    println("CallByName Day 5 Balance %d ".format(i))

  }

  def main(args: Array[String]): Unit = {
    var amt:Int=0
    CallByValue({amt+=1;amt})
    amt=0
    CallByName({amt+=1;amt})
  }
}
