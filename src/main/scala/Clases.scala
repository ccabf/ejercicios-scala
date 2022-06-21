object Clases {
  def main(args: Array[String]): Unit = {


    class Clientes_cot(){
      var nombre: String =""
      var direccion: String=""
      var tlf: String = ""
      var email: String=""
      private var _cotiz: Int=100
      private val bound: Int = 100000

      def cotiz=_cotiz
      def bound_ =  bound
      def getBound: Int = {
        bound
      }

      def setProp (newValue: Int = 900): Unit = {
        if (newValue < bound) _cotiz = newValue else printWarning
      }

      def cambia={
        setProp(20)
      }

      private def printWarning = println("WARNING: Out of bounds")
      override def toString: String =
        s"(Datos de cliente: Nombre: $nombre, Direccion: $direccion, Tlf: $tlf, Email: $email Cotizacion: $cotiz, Bound: $bound)"
    }

    var c= new Clientes_cot()
    c.nombre="Entelgy"
    c.direccion="Madrid"
    c.tlf="689784251"
    c.email="entelgy@entelgy.com"
    c.setProp(920)
    println(c)
    println(c.cotiz)
    println(c.getBound)
    println(c.bound_)
  }
}
