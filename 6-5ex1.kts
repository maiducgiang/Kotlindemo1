fun sortt(arr: IntArray ): IntArray{
    arr.sort()
    return arr
}
fun main() {
    var arr: IntArray = intArrayOf(2,1,2,3,5,6,7,10,1)
    arr = sortt(arr)
    for(i in arr) print("${i} ")
}
main()