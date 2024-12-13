fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]
    list.add(6)
    println(list) //Output: [1,2,6] 
    list.removeIf { it %2 != 0 }
    println(list)//Output: [2,6]
}