fun main() {
  var one=Array<Int>(4,{0})
    one[0]=10
    one[3]=20
    for(i in one.indices)
       println(one[i])

    var two=Array<IntArray>(3,{IntArray(4,{2})})
    //3행 4열의 2차원 배열
    //row의 index: 0~2
    //col의 index: 0~3
    two[1][2]=100
    two[2][3]=200

    /*for(i in two.indices)
        for(j in two[i].indices)
            println(two[i][j])*/

    for((i,row) in two.withIndex()){
        for((j,col) in row.withIndex()){
            print("($i,$j)=$col\t")
        }
        println()
    }
}