fun main() {
    //when문: 여러가지 경우에 따라 어떤 작업을 할지를 결정
    //when은 switch~case 와 비슷하지만 break를 쓰지 않음
    //범위로 처리가능: in 키워드 사용
    var count:Int=90
    if(count>=90){
        println("if문:합격(장학생)")
    }else if(count>=60){
        println("if문:합격")
    }else{
        println("if문:불합격")
    }
    
    var jumsu: Int=(count/10)*10
    when(jumsu){
        in 90..100 ->  println("when문:합격(장학생)")
        in 60..89 -> println("when문:합격")
        else -> println("when문:불합격")
    }
}