fun main() {
   //for문
    /* for(변수 in 시작..끝 step 증가량){
            //code
       }
     */
    for(i in 1..10 step 1)
        print("$i :: ")

    println()
    var leng=5;
    //i<=5
    for(j in 1..leng)
        print("$j / ")

    println()
    //i<5 until은 맨 마지막 수는 포함 X
    for(i in 1 until leng)
        print("$i | ")
}
