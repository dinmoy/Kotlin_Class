fun main() {

    var one:IntArray= intArrayOf(10,20,30)
    for(value in one){
        println(value)
    }
    //while문
    /* while(조건식){
        //조건식이 true인 동안 이 부분을 실헹
       }
     */
    var two:Array<String> = arrayOf("하나","둘","셋")
    for(i in 0..2 step 1){
        println(two[i])
    }
    var k:Int=0
    while(k<two.size){
        println(two[k])
        k++
    }

}
