fun main(){
    val s:String? = readLine()
    if(s != null){
        val n = s.length
        for(i in 0..n){
            when(s.get(i)){
                '1' -> print("mot")
                '2' -> print("hai")
                '3' -> print("ba")
                '4' -> print("bon")
                '5' -> print("nam")
                '6' -> print("sau")
                '7' -> print("bay")
                '8' -> print("tam")
                '9' -> print("chin")
                else -> print("Mai Duc Giang")
            }
        }
    }

}
main()