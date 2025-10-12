// practice base class for all types of rooms
abstract class LivingSpace(
    open var length: Int = 10,
    open var width: Int = 8,
    open var height: Int = 3,
    open var color: String = "Neutral White",
    open var furniture: String = "Standard Set"
) {
    open var volume: Int
        get() = length * width * height
        protected set(value) {
            height = (value * 1000) / (length * width)
        }

    // Abstract function to be implemented by subclasses
    abstract fun describeStyle()

    open fun showDetails() {
        println("Dimensions: ${length}m x ${width}m x ${height}m")
        println("Wall Color: $color")
        println("Furniture:  $furniture")
        println("Volume: $volume cubic meters")
    }
}

// Shared actions every room should have
interface RoomAction {
    fun decorate()
}

// My LivingRoom class inherits from LivingSpace and also uses RoomAction interface
class LivingRoom(
    override var length: Int = 12,
    override var width: Int = 7,
    override var height: Int = 3,
    override var color: String = "Light Beige",
    override var furniture: String = "Modern Sofa Set",
    var decorStyle: String = "Contemporary"
) : LivingSpace(length, width, height, color, furniture), RoomAction {

    override fun describeStyle() {
        println("This living room follows a $decorStyle design style.")
    }

    override fun decorate() {
        println("Adding cushions, rugs, and wall art for a cozy vibe.")
    }
    override fun showDetails() {
        println("\n--- Living Room Details ---")
        super.showDetails()
        describeStyle()
        decorate()
        println("----------------------------\n")
    }
}


// Bedroom class extends LivingSpace and customizes its own behavior
class Bedroom(
    override var length: Int = 10,
    override var width: Int = 6,
    override var height: Int = 3,
    override var color: String = "Soft Gray",
    override var furniture: String = "Queen Bed + Wardrobe",
    var hasBalcony: Boolean = true
) : LivingSpace(length, width, height, color, furniture), RoomAction {

    override fun describeStyle() {
        println("This bedroom feels calm and minimalist.")
    }

    override fun decorate() {
        println("Adding fairy lights and soft curtains for relaxation.")
    }

    override fun showDetails() {
        println("\n--- Bedroom Details ---")
        super.showDetails()
        println("Balcony: ${if (hasBalcony) "Yes" else "No"}")
        describeStyle()
        decorate()
        println("-------------------------\n")
    }
}

// Quick function to test my room classes
fun testLivingSpaces() {
    val living = LivingRoom()
    val bedroom = Bedroom()

    living.showDetails()
    bedroom.showDetails()
}

// Data class to represent a decor item

data class Decoration(val item: String, val material: String)

fun makeDecorations() {
    println("\nDecorations\n")

    val decor1 = Decoration("Lamp", "Glass")
    val decor2 = Decoration("Plant", "Ceramic")
    val decor3 = Decoration("Plant", "Ceramic")

    println("\n$decor1\n$decor2\n$decor3")

    println("\nEquality checks:")
    println("decor1 == decor2? ${decor1 == decor2}")
    println("decor2 == decor3? ${decor2 == decor3}")

    println("\nCopying example:")
    val newDecor = decor1.copy(material = "Metal")
    println("Copied and updated: $newDecor")

    println("\nDestructuring:")
    val (item, material) = decor1
    println("Item: $item, Material: $material")
    println("--------------------\n")
}
class Choice {
    companion object {
        var name: String = "Decoration"
        fun showDescription(item: String) {
            println("My favorite $item")
        }
    }
}
fun testPairsAndTriples() {
    println("\nPairs & Triples\n")

    val decor = "sofa" to "comfort"
    println("\n${decor.first} gives ${decor.second}")

    val livingRoomInfo = Triple("Lamp", "Beige", 12)
    println("\nTriple Info: $livingRoomInfo")
    println("Item: ${livingRoomInfo.first}, Color: ${livingRoomInfo.second}, Size: ${livingRoomInfo.third}m")

    val (item, color, size) = livingRoomInfo
    println("\nDestructured: $item, $color, ${size}m")
    println("--------------------\n")
}
// --- Collections: Hash Maps ---
fun testHashMaps() {
    println("\nHashMap basics\n")

    // HashMap of decor item -> material
    val decorMaterials = hashMapOf(
        "lamp" to "glass",
        "plant" to "ceramic",
        "sofa" to "fabric"
    )
    // Direct get via [] and get()
    println("Material of 'lamp': ${decorMaterials["lamp"]}")
    println("Material of 'sofa': ${decorMaterials.get("sofa")}")
}

fun testCompanionObject() {
    println(Choice.name)
    Choice.showDescription("painting")
    Choice.showDescription("lamp")
}

// Main function to run everything
fun main() {
    testLivingSpaces()
    testCompanionObject()
    makeDecorations()
    testPairsAndTriples()
    testHashMaps()
}

main()