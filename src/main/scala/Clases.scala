object Clases {
  def main(args: Array[String]): Unit = {


    class Clientes(){
      var nombre: String =""
      var direccion: String=""
      var tlf: String = ""
      var email: String=""
      private var cotiz: Float=100
      var total_cotiz: Float =0


      def setCotiz (newValue: Float): Unit = {
         cotiz = newValue

        total_cotiz = total_cotiz + newValue
      }



      override def toString: String =
        s"(Datos de cliente: Nombre: $nombre, Direccion: $direccion, Tlf: $tlf, Email: $email, Cotizacion: $cotiz, Cotizacion total: $total_cotiz)"
    }

    var c1= new Clientes()
    c1.nombre="Entelgy"
    c1.direccion="Madrid"
    c1.tlf="689784251"
    c1.email="entelgy@entelgy.com"
    c1.setCotiz(920)
    println(c1)
    c1.setCotiz(1205)
    println(c1)

    var c2= new Clientes()
    c2.nombre="Intell"
    c2.direccion="Barcelona"
    c2.tlf="689784278"
    c2.email="intel@intel.com"
    c2.setCotiz(22000)
    println(c2)

    class Persona(var nombre:String="", var direccion:String="Madrid"){
      override def toString: String =
        s"(Datos de Persona: Nombre: $nombre, Direccion: $direccion)"
    }

    var paco= new Persona("Paco")
    println(paco)
    var reme= new Persona("Reme", "Valencia")
    println(reme)

    class Empleado (nombre: String="", direccion: String="", cargo: String="funcionario", sueldo:Float=0)
      extends Persona (nombre, direccion){
      override def toString: String = s"(Datos de Empleado: Nombre: $nombre, Direccion: $direccion, Cargo: $cargo, Sueldo: $sueldo €)"
    }

    var ivan= new Empleado( "Ivan", "Barcelona", "Abogado", 500000)
    println(ivan)

    class Jefe (nombre: String="", direccion: String="", cargo: String="funcionario", sueldo:Float=0, nombreDepartamento: String="Finanzas")
      extends Empleado(nombre, direccion, cargo, sueldo){
      override def toString: String = s"(Datos de Empleado: Nombre: $nombre, Direccion: $direccion, Cargo: $cargo, Departamento:$nombreDepartamento, Sueldo: $sueldo €)"
    }

    val jefe=new Jefe("Julia", "Málaga", "profesora",  23000, "Audicion y lenguaje")
    println(jefe)

    trait Ladrador {
      def ladrar() = println("Guau")
    }
    trait Mordedor {
      def mordedor() = println("GRRRR")
    }

    class Perro extends Ladrador with Mordedor{
      override def toString = "Perro"
    }

    var drogo= new Perro ()
    drogo.ladrar()

    drogo.mordedor()

    class Galgo () extends Perro(){
      override def toString = "GALGO:( "
    }
     var galg= new Galgo()
    println(galg)

  }
}
