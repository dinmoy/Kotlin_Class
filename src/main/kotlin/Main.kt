fun main() {
    println("Hello World!")
    var var1=10
    var var2=10.1f
    var var3=10.2
    var var4='안'
    var var5="안드로이드"

    println(var1)
    println(var2)
    println(var3)
    println(var4)
    println(var5)

    var myVar=100
    myVar=200
    
    var myVal=200
    myVal=300 //오류

    var a="100".toInt()
    var b="100.123".toDouble()

    println(a)
    println(b)
    
    //var notNull:Int null -- 오류
    var okNull:Int?=null //정상

    var ary=ArrayList<Int>(1) //1개짜리 배열 리스트
    ary!!.add(100) //깂 100을 추가


}