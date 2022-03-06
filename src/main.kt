fun main(){
    println("hey")
    createfun()
    cities()
    num()
    var jina=name(arrayOf("phelisia","sarah","chumba"))
    println(jina)
}
fun createfun (){
    var takestring= arrayOf("phelisai","Bakari","Chumba","Sarah")

    println(takestring.contentToString())

}
fun cities(){
    var places= arrayOf("harara","mumbai","dodoma","jakarta")
    places.sortedArray() .forEach { pj->
        println(pj.capitalize())

    }

}
fun num(){
var numbers= arrayOf(32,17,42,13,78,43,90,31,3,73,11,158,62)
var sum =numbers[1]+numbers[4]
    println(sum)
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())

}
    fun name(strings:Array<String>):String{
        var leta=strings.contentToString()
        return leta




}
