fun main() {
  var one=Array<Int>(4,{0})
    one[0]=10
    one[3]=20
    for(i in one.indices)
        println(one[i])
}