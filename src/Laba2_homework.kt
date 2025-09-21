        //1 задание
        fun main() {
        print("Введите ваш уровень: ")
        val level = readln().toInt()
        val (status, bonus) = when {
        level < 10 -> "Новичок" to 10
        level < 50 -> "Опытный" to 30
        else -> "Легенда" to 100
    }

        println("$status! Вы получаете +$bonus HP.")

        //2 задание
        println("Введите ваш возраст")
        val age = readln().toInt()
        if (age < 12) {
            println("Вы ребенок")
        }else if (age <=17) {
            println("Вы подросток")
        }else{
            println("Вы взрослый")
        }


        //3задание
        println("Введите число от 1 до 100")
        val number = readln().toInt()
        if (number in 10..50) {
            println("Число $number входит в диапозон от 10 до 50")
        }else{
            println("Число $number входит в диапозон от 10 до 50")
        }


        //4задание
            println("Введите один символ: ")
            val char = readln().first()
            when (char) {
                in '0'..'9' -> println("Это цифра")
                in 'a'..'z', in 'A'..'Z' -> println("Это буква латинского алфавита")
                ' ' -> println("Это пробел")
                else -> println("Это спецсимвол")
            }
        //5задание
        var a = 1
        repeat(10){
            println("5 x $a = ${5*a }")
            a++
        }
        //6задание
        val films = listOf("Гарри Поттер","Фокус","Волк с уоол стрит","Чебурашка","Титаник")
            println("Список фильмов")
            for (film in films){
                println("$film (${film.length} букв)")
            }
        //7задание
            print("Как тебя зовут? ")
            val name = readln()

            print("Сколько тебе лет? ")
            val vozrast = readln().toInt()

            print("Какой твой любимый цвет? ")
            val color = readln()

            println("Привет, $name! Тебе $vozrast ${get(vozrast)}, и ты любишь $color.")
        }

            fun get(vozrast: Int): String {
                return when {
                    vozrast % 10 == 1 && vozrast % 100 != 11 -> "год"
                    vozrast % 10 in 2..4 && vozrast % 100 !in 12..14 -> "года"
                    else -> "лет"
                }
            }







