/*
In Java and C++ often have  class with both Instance and Static Method
In scala you can achive this by having a class and a companion object of same name
the class and companion object can access each other private features , they must be loacted in same source file
 */


class CompanionClassBankAcc {
val id=CompanionClassBankAcc.newUniqueNumber()
  private var balance : Double=0.0
  def deposite(amt :Double): Double ={
    balance+=amt
    return balance
  }

  def BalanceEnquiry():Double={
    return balance
  }
}

object CompanionClassBankAcc{
  private var lastNumber:Int=0
  private def newUniqueNumber():Int={
    lastNumber+=1
    return  lastNumber
  }
}

object CompanionClassDemo{
  def main(args: Array[String]): Unit = {
    var acc1=new CompanionClassBankAcc()
    println("Current Account Number: %d".format(acc1.id))
    println("Account Balance before Deposit for accNum %d  is %f".format(acc1.id,acc1.BalanceEnquiry()))
    println("Amount after deposite %f".format(acc1.deposite(243.34)))
    println("Account Balance after Deposit for accNum %d  is %f".format(acc1.id,acc1.BalanceEnquiry()))

    var acc2=new CompanionClassBankAcc()
    println("Current Account Number %d".format(acc2.id))
    println("Account Balance before Deposit for accNum %d  is %f".format(acc2.id,acc2.BalanceEnquiry()))
    println("Amount after deposite for %d is %f".format(acc2.id,acc2.deposite(567.72)))
    println("Account Balance after Deposit for accNum %d  is %f".format(acc2.id,acc2.BalanceEnquiry()))


  }
}