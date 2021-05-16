object FunctionsInScala {

  def area(l:Float,b:Float):Float = {
    l*b
  }

  def isEven(number:Int):Boolean={
    number%2==0
  }

  def areRect(l:Int,b:Int=20):Int={
    l*b
  }

  def add(a:Int,b:Int):Int={
  a+b
  }

  def sub(a:Int,b:Int):Int={
    a-b
  }

  def mul(a:Int,b:Int):Int={
    a*b
  }

  def gen(func : (Int,Int)=>Int,a:Int,b:Int):Int={
    func(a,b)
  }


  def main(args:Array[String]):Unit= {

    printf("Area = %f\n".format(area(0.2f,5.4f)))

    printf("Rect = %d\n".format(areRect(l = 12)))

    printf("Rect = %d\n".format(areRect(l = 12,b = 30)))

    printf("%d\n",gen(a = 10,b=30,func = add))

    val f=(a:Int,b:Int)=>a+b
    printf("%d\n",f(2,3))




  }
}
