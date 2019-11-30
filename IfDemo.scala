import java.util.Scanner

object IfDemo {
  def main(args: Array[String]): Unit = {
    val scanner=new Scanner(System.in)
    println("Enter the coQuadratic Equation")
    print("Enter the value of a-> ")
    var a:Double=scanner.nextInt()
    print("Enter the Val of b -> ")
    var b:Double=scanner.nextInt()
    print("Enter the value of c-> ")
    var c:Double=scanner.nextInt()

    var d:Double=b*b-4.0*a*c

    var mess:String=""



    mess=if(d<0.0){
      "Roots are Imaginary"
    }
    else{
      "Roots are real"
    }
println(mess)
    mess=if(d==0.0){
      "Roots are equal"
    }
    else{
      mess
    }
    println(mess)
    println("End of Programme")
  }
}
