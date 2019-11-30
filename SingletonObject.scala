/*
scala has no static methods or fields Insted you use object construct ,
Object defines a single instance of a class with the feautes you want ,
Since we cant instanciate the singleton Object , it cant pass params to primary constrctor

 */

object BankAccount{
  private var  lastNum:Int=0
  def newUniqueNum ():Int={
     lastNum+=1
    return  lastNum
  }
}

object SingletonObject { //this is a static object so in repl objname.main()

  def main(args: Array[String]): Unit = {
println("Unique %d".format(BankAccount.newUniqueNum()))
  }
}
