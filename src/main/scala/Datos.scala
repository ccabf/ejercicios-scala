object Datos {
  def main(args: Array[String]): Unit = {
    //Define las siguiente variables: una tupla de dos elementos numéricos, una lista de
    //números del 1 al 50, y un Mapa con los datos de un cliente: nombre, dirección, tlf, email
    println("----------EJERCICIO 3----------")

    val t = (3,40)
    t.productIterator.foreach{ i =>println("Value = "
      + i )}
    var Lista = List.range(1,51)
    for ( i <- Lista ) {
      print( " " + i )
    }
    println()
    var cliente1:List[String]=List("nombre1", "dirección1", "tlf1", "email1")
    var cliente2:List[String]=List("nombre2", "dirección2", "tlf2", "email2")
    var mapa:Map[Int, List[String]] = Map()
    mapa += (1 -> cliente1)
    mapa += (2 -> cliente2)

    mapa.keys.foreach{ i =>
      print( "Clave = " + i )
      println(" Valor = " + mapa(i) )
    }
    println()
    //5. Añade tres elementos nuevos a la lista al final y un nuevo campo al diccionario:
    // facturacion total
    println("----------EJERCICIO 5----------")

    Lista= Lista ::: List(51,52)

    for ( i <- Lista ) {
      print( " " + i )
    }
    println()

    cliente1 = cliente1::: List("facturacion1")
    cliente2 = cliente2::: List("facturacion2")

    var mapa2:Map[Int, List[String]] = Map()
    mapa2 += (1 -> cliente1)
    mapa2 += (2 -> cliente2)

    mapa2.keys.foreach{ i =>
      print( "Clave = " + i )
      println(" Valor = " + mapa2(i) )
    }

    //6. Vuelve a recorrer el listado y el diccionario para ver si están o no los datos introducidos
    //7.- Define una cadena de caracteres larga (loren ipsum)
    //8.- Recorre la cadena para presentar todas la letras que la conforman y decir al final el
    //número de letras que contiene, verifica que es el número correcto
    //9. Realiza una búsqueda en la cadena para ver si contiene la palabra "ipsum" se con
    //minúscula o mayúscula, imprime el resultado
    println("----------EJERCICIO 7, 8 y 9----------")

    var loren_ipsum= "Lorem ipsum dolor sit amet consectetur adipiscing elit egestas sociosqu fringilla ultrices, fusce quam lobortis sapien phasellus venenatis eros suspendisse eget fames congue penatibus, nam enim nostra fermentum commodo rutrum ornare nisi diam dapibus. Eros iaculis hac sociosqu per netus augue eu orci elementum purus, lobortis aliquam penatibus velit integer ante commodo rutrum suscipit viverra dictum, cubilia ultrices consequat feugiat conubia suspendisse praesent at non. Sagittis eu eros tellus duis lacinia ultrices, fringilla sociosqu placerat vehicula erat velit magnis, felis himenaeos sapien porttitor eleifend. Nec aptent vulputate nulla suspendisse ante sociosqu dictum sagittis, praesent bibendum porttitor rutrum consequat vehicula lobortis, proin netus sed diam dapibus nascetur pellentesque. Arcu urna pulvinar eros nulla ultricies fames felis, parturient magnis quam faucibus justo nullam viverra, lacinia phasellus luctus dis malesuada porttitor. Non arcu litora et lacinia platea nulla gravida nisl, at vitae tempus faucibus nostra ut urna elementum molestie, mauris himenaeos fermentum proin fringilla neque felis."
    println(loren_ipsum.length)

    println(loren_ipsum.toLowerCase.contains("ipsum"))

    //10. Rellena una lista cogiendo los datos de otra lista pero modificando su valor sumandole
    //a cada valor 15
    var lista_15=Lista.map(a=>a+15)
    print(lista_15)

  }

}
