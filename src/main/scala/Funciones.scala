object Funciones {
  def main(args: Array[String]): Unit = {
    println("------------Unidad 03------------")

    //1.- Crea un nuevo proyecto llamado funciones y crea un fichero llamado Funciones.scala
    //donde se resolverán el resto de ejercicios
    //2.- Crea una función llamada cuenta que sea capaz de imprimir por pantalla el número de
    //  elementos que tiene un listado, prueba la función con una variable de prueba
    println("------------EJERCICIO 2------------")
    def cuenta( l:List[Any]) :Int={

      var num_elem:Int=0
      num_elem= l.length
      return num_elem
    }

    var lista_50=List.range(1,51)
    println(cuenta(lista_50))

    //3.- Crea una función llamada divide que sea capaz de dividir dos números y devolver el
    //  resultado, comprueba con dos variables que funciona correctamente
    println("------------EJERCICIO 3------------")
    def div(a:Float,b:Float) ={
      var divi:Float = 0
      divi = a / b
      divi
    }

    println(div(10,2))

    //4.- Haz que los dos argumentos de la función divide sean opcionales, comprueba que se
    //  puede llamar a la función con todas las posibles combinaciones de parámetros de entrada
    println("------------EJERCICIO 4------------")
    def div2(a:Float=10,b:Float=2) ={
      var divi:Float = 0
      divi = a / b
      println(divi)
    }

    println(div2(8))
    println(div2(b=5))
    println("------------FIN DE LOS EJERCICIOS DE FUNCIONES------------")
  }
}
