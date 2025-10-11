class Aquarium {
    var width: Int = 25
    var height: Int = 45
    var length: Int = 110
    var name: String = "Coral Reef Tank"

    fun showDetails() {
        println("🐠 Welcome to $name 🐚")
        println("🌊 Dimensions:")
        println("   Width:  $width cm")
        println("   Length: $length cm")
        println("   Height: $height cm")
        println("✨ Ready to fill with colorful fish and corals!")
    }
}

fun setupAquarium() {
    val myAquarium = Aquarium()
    myAquarium.showDetails()
}

fun main() {
    setupAquarium()
}

main()