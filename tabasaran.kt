fun main() {
    val secretNumber = (1..100).random()
    var attempts = 0
    
    println("Угадай число от 1 до 100!")
    
    while (true) {
        val guess = readlnOrNull()?.toIntOrNull()
        
        when {
            guess == null -> println("Введи число!")
            guess < secretNumber -> println("Больше!")
            guess > secretNumber -> println("Меньше!")
            else -> {
                println("Поздравляю! Угадал за ${++attempts} попыток!")
                break
            }
        }
        attempts++
    }
}