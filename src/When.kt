fun  main(){
 //   println("Введите порядковый номер месяца (1-12):")
   // val index = readln().toInt()
    //val month = ""
    //if (index == 1){
      //  month = "Январь"
    //} else if (index == 2) {
      //  month = "Февраль"
    //} else if (index == 3 ) {
//  month = "Март"
 //   } else if (index == 4 ) {
   //     month = "Апрель"
    //} else if (index == 5 ) {
     //   month = "Май"
    // }
 //   println("Начинаем ритуал защиты!")
   // println("Заклинание защиты активировано!")
   // println("Заклинание защиты активировано!")
   // println("Заклинание защиты активировано!")
   // println("Заклинание защиты активировано!")
    //println("Заклинание защиты активировано!")
   // println("Замок защищен!")
    println("Начинаем ритуал защиты ")
    repeat (times = 5){
        println("Заклинание от защиты активирована")
    }
    println("Замок защищен")
    println("Начинаем ритуал защиты")
    var index = 0
    repeat(times = 5){
        println("Заклинание защиты активировано (Шаг ${index + 1})")
        index ++
        println("Начинаем ритуал защиты")
        repeat(times = 5){index ->
            println("Заклинание защиты активировано ((Шаг ${index + 1})\")")
        }
        println("Замок защищен")
        repeat(times = 5){index ->
            if (index == 2){
                println("Пропускаем шаг $ {index + 1} из за магического вмешательства")
                return@repeat

            }
            println("Заклинание защиты активировано$ {index + 1}")



        }
    }



}




