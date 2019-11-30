//while mixing traits and classes , always extend class first then trait
class Rectangle(var width : Double,var height : Double) extends Polygon with Shape {

    def  area : Double={
    return  width*height
  }

   def color: String = {
    return "red";
  }
}

