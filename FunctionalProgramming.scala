/* Properties of Functional Prgramming
* Immutiblity
* Higher order functions
* lazy loading
* Pattern Matching
* Currying
* Partial application
* Monads
* */

object FunctionalProgramming {

  def main(args: Array[String]): Unit = {


    /*Higer order Function assign function to a variable*/
    def area(a:Int,b:Int):Int={
      a*b
    }

    val f=area _ //_ means assigning the reference
    println(f(2,3))

    def add(a:Int,b:Int):Int={
      a+b
    }
    def sub(a:Int,b:Int):Int={
      a-b
    }

    def genericFunc(f:(Int,Int)=>Int,a:Int,b:Int):Int={
      f(a,b)
    }
    println(genericFunc(add,3,5))
    val fun=(a:Int,b:Int)=>a*b //lambda expression/anonymous function
    println("fun "+genericFunc(fun,3,4))

    def genericOp[T <: Any](f:(T,T)=>T,op1:T,op2:T):T=f(op1,op2) //<: subclass of Any
    println(genericOp[Int](add,33,44))

    val oddSum:Int=(0 to 100).toList.filter(x=>{x%2!=0}).map(x=>x*x).reduce((x,y)=>{x+y})
    printf("Sum Of Odds %d".format(oddSum))

    for (i <- 1 to 100) {
      println(i)
    }

  }



}
