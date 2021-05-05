import java.lang.Math.sqrt

fun list(): List<Int>{
    val list1: List<Int> = List(100, {index -> index + 1})
    return list1
}
fun nt(number: Double): Boolean{
    if(number < 2) return false
    val s: Int = sqrt(number).toInt()
    val demo: Int = number.toInt()
    for(i in 2..s)
        if(demo % i == 0) return false
    return true
}
fun demo(a: List<Int>): List<Int>{

    return (a.filter { nt(it.toDouble()) })
}
demo(list())