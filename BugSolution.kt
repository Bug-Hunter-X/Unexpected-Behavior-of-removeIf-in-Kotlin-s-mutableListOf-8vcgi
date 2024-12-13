fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val toRemove = mutableListOf<Int>()
    list.forEach { if (it > 2) toRemove.add(it)}
    toRemove.forEach {list.remove(it)}
    println(list) // Output: [1, 2]
    list.add(6)
    println(list) //Output: [1,2,6] 
    toRemove.clear()
    list.forEach { if (it %2 != 0) toRemove.add(it)}
    toRemove.forEach {list.remove(it)}
    println(list)//Output: [2,6]
}