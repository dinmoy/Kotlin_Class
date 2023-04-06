fun main() {
    var auto: Automobbile=Automobbile()
    auto.upSpeed(250)
    println("승용차의 속도는 "+auto.speed+"km입니다")


}
open class Car{
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
    open fun upSpeed(value: Int){
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
class Automobbile: Car{
    var seatNum:Int=0

    constructor(){

    }
    fun countSeatNum(): Int{
        return seatNum
    }
    open override fun upSpeed(value:Int){
        if(speed+value>=300)
            speed=300
        else
            speed=speed+value
    }
}
