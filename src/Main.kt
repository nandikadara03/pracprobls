fun summ(n: Int):Int{
    return n*(n+1)/2
}
fun summ1(n: Int): Int{
    var s = 0
    for(i in 1..n){
        s=s+i
    }
    return s
}
fun main() {
    val n=5
    val res =summ(n)
    println("$res")
    val result = summ1(8)
    println("$result")

}