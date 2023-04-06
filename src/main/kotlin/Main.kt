fun main() {
    /*var Car1:Car=Car()
    Car1.color="빨강"
    Car1.speed=0

    var Car2:Car=Car()
    Car2.color="파랑"
    Car2.speed=0

    var Car3:Car=Car()
    Car3.color="초록"
    Car3.speed=0

    Car1.upSpeed(50)
    println("자동차1의 색상은 "+Car1.color+" 이며, 속도는 "+Car1.speed+" km입니다")

    Car2.upSpeed(20)
    println("자동차2의 색상은 "+Car2.color+" 이며, 속도는 "+Car2.speed+" km입니다")

    Car3.upSpeed(250)
    println("자동차3의 색상은 "+Car3.color+" 이며, 속도는 "+Car3.speed+" km입니다")*/

    var Car1:Car=Car("빨강",0)
    var Car2:Car=Car("파랑",0)
    var Car3:Car=Car("초록",0)

}
class Car{
    var color:String=""
    var speed:Int=0

    constructor(color:String,speed:Int){
        this.color=color
        this.speed=speed
    }
    fun upSpeed(value: Int){
        if(speed+value>=200)
            speed=200
        else
            speed=speed+value
    }
    fun downSpeed(value: Int){
        if(speed-value<=0)
            speed=0
        else
            speed=speed-value
    }
}
