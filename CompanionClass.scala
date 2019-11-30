class CompanionClass(path:String) {

println("Load the Graph File From %s".format(path))
  def  numEdges=506
  def numVertices():Int={
    return  305
  } // equalient to def numVertices=305

  def peristance(StorageLevel:Int): Unit ={
    println("Returns new Presistance Path %d".format(StorageLevel))
  }

  def apply():Unit={
    println("Nothing to Apply")
  }
}
/*
StorageLevel can be mapped to values
0 -> DISK_ONLY
1-> MEMORY_ONLY
2-> MEM_ONLY_COMP
3-> MEM_AND_DISK
4-> MEM_DISK_COMP

 */

object CompanionClass{

  def main(args:Array[String]):Unit={
    val DISK_ONLY:Int=0
    val MEMORY_ONLY:Int=1
    val MEM_ONLY_COMP:Int=2
    val MEM_AND_DISK:Int=3
    val MEM_DISK_COMP:Int=4
    /*
    val cmp=new CompanionClass("C:/");
    cmp.peristance(0)
    cmp.peristance(MEM_DISK_COMP)

     */
    /*Above Commented Lines can be alternatively written as */
    def apply(path: String) = new CompanionClass(path)

    //val g=CompanionClass("C:/")
  }
}
