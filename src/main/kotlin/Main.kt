fun main() {
    //ArrayList
    var one=ArrayList<Int>(4)
    one.add(10)
    one.add(20)
    one.add(30)
    one.add(40)
    one.add(50)
    var sum=0
    for(num in one){
        sum+=num
    }
    println(sum)
    //첫번째 값 + 두번째 값
}
