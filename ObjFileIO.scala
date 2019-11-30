import java.io.FileNotFoundException

import scala.io.Source
import java.io.FileNotFoundException
import java.io.IOException
import java.io.PrintWriter
import java.io.File
object ObjFileIO {
  def main(args: Array[String]): Unit = {
    try {
      println("Following are conetns of File")
      Source.fromFile("D:\\hrrebuilddependency.txt").foreach(
        x=>{ print(x)}
      )

      val writer=new PrintWriter(new File("D:\\ScalaDemowrite.txt"))
      writer.write("Demo File In Scala")
      writer.close()
    }
    catch {
      case ex:FileNotFoundException=>{
        println("FileNotFound")
      }
      case ex:IOException=>{
        println("IOException Occured")
      }

    }
    finally {
      println("Closing File Handle")
    }
  }
}
