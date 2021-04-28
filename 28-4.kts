import java.lang.StrictMath.sqrt

fun main() {
    var a:Double=0.0
    var b:Double=0.0
    var c:Double=0.0
    var s= readLine()
    if(s!=null)
        a=s.toDouble()
    s= readLine()
    if(s!=null)
        b=s.toDouble()
    s= readLine()
    if(s!=null)
        c=s.toDouble()
    if(a == 0.0){
        if(b == 0.0 && c != 0.0) print("pt vo nghiem")
        else if(b == 0.0 && c == 0.0) print("pt vo so nghiem")
        else print((-c / b))
    }
    else{
        var x = b * b - 4 * a * c
        if(x < 0) print("pt vo nghiem")
        else {
            var x1 = (-b + sqrt(x))/(2 * a)
            var x2 = (-b - sqrt(x))/(2 * a)
            print("x1 = ${x1}\n")
            print("x2 = ${x2}")
        }
    }
}
main()