fun main() {
   //이차원 배열 선언 형식: var 배열명=Array<배열 데이터 형식>(행 개수,{배열 데이터 형식(열 개수)})/var 배열명=Array<데이터형식>(개수){초깃값}
    var two=Array<IntArray>(3,{IntArray(4)})
    two[0][0]=100
    two[2][3]=200
    println(two[0][0])
    println(two[2][3])
}