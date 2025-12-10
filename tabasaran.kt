fun main() {
    val secretNumber = (1..100).random()
    var attempts = 0
    
<<<<<<< HEAD

    
    while (true) {
        val guess = readlnOrNull()?.toIntOrNull()
        
        when {
            guess == null -> println("Введи число!")
=======
    println("Угадай число от 1 до 100!")
    
    while (true) {
        print("Твоя попытка: ")
        val guess = readlnOrNull()?.toIntOrNull()
        
        when {
            guess == null -> println("123123123")
>>>>>>> main
            guess < secretNumber -> println("Больше!")
            guess > secretNumber -> println("Меньше!")
            else -> {
                
                break
            }
        }
        attempts++
    }
}