// lesson1.kts
println("Hello World!")

//practice plus, minus, times and division

println(2.times(3))

//practice using types
val i: Int = 4
val a1 = i.toByte()
println(a1)
val i6: Double = a1.toDouble()
println(i6)

//practice strings and characters
val numberOfBags = 5
val numberOfShoes = 7
println("I have $numberOfBags bags" + " and $numberOfShoes shoes")

//practice conditions and booleans
val numberOfTables = 5
val numberOfChairs = 10
if (numberOfTables > numberOfChairs) {
    println("Need to buy more chairs")
} else {
    println("We have enough chairs")
}

//if else
val numberOfFruits = 25
if (numberOfFruits == 0) {
    println("No fruits")
} else if (numberOfFruits < 10) {
    println("Need to buy more!")
} else {
    println("We have more than enough!")
}

//practice nullability
var stones: Int? = null

var Bags: Int? = 6
Bags = Bags?.dec() ?: 0
println()

//add to list practice
val items = mutableListOf("pen", "pencil")
items.add("notebook")
println(items.joinToString())

//creating an array
val numbers = intArrayOf(1,2,3)
println(java.util.Arrays.toString(numbers))

val words = listOf("dog", "bag", "small")
val oceans = listOf("Indian", "Pacific")
val oddList = listOf(words, oceans, "salmon")
println(oddList)

//loops
var toys = 55
while (toys < 50) {
    toys++
}
println("$toys toys in the box\n")
