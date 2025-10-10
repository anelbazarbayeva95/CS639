import java.time.DayOfWeek
import java.util.Random

// practice the main() function
fun printHello() {
    println("Hello World")
}
printHello()

fun printMorning() {
    println("Good morning")
}
printMorning()

// functions with val
val temperature = 55
val isHot = if (temperature > 40) true else false
println(isHot)

// practice arrays
fun randomDay(): String {
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun Food(day: String): String {
    return when (day) {
        "Monday" -> "granola"
        "Wednesday" -> "oats with fruits"
        "Thursday" -> "avo toast"
        "Friday" -> "salad"
        "Sunday" -> "pancakes"
        else -> "nothing"
    }
}

fun breakfastIdeas() {
    println("--- Breakfast Ideas ---")
    val day = randomDay()
    val food = Food(day)
    println("Today is $day and the breakfast is $food")
}


//default values
fun randomSpeed(): String {
    val speed = arrayOf("slow", "turtle-like", "fast")
    return speed[Random().nextInt(speed.size)]
}


fun swim() {
    val speed = randomSpeed()
    println("Today the team was swimming $speed")
    if (speed == "slow") {
        println("It was a recovery day.")
    }
}

fun main() {
    breakfastIdeas()
    swim()

    //practice listOf
    println("\n--- practice listOf ---")
    val flowers = listOf("rose", "tulip", "lily")
    println( flowers.filter {it[0] == 't'})
}

// Run the main function to execute all your code
main()

//practice lambdas
var soccerplayers = 22
val actualprayers = { soccerplayers : Int -> soccerplayers / 2}
println(actualprayers(soccerplayers))
