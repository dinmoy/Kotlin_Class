fun main() {
    var Car1:Car=Car("빨강",0)
    var Car2:Car=Car("파랑",0)
    var Car3:Car=Car("초록",0)

}
class Car{
    var color:String=""
    var speed:Int=0

    companion object {
        var carCount:Int=0
        const val MAXSPEED: Int = 200
        const val MINSPEED: Int=0
        //메서드명 뒤에 return타입 쓰기
        fun currentCarCount(): Int{
            return carCount
        }
    }
    constructor(color:String,speed:Int){
        this.color=color
        this.speed=speed
    }
    constructor(speed:Int){
        this.speed=speed
    }
    constructor(){

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
