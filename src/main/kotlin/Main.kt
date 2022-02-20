fun main(args: Array<String>) {

       // difference(55,22)
    add("Shamim","Gard")
    multiply(23,2)
    name("james",26)
    divide(22,5)

    }
    fun difference(a:Int,b:Int):Int{
        var subtract= a-b
        return (subtract)

    }

fun add ( firstName:String,lastName:String):String{
    var fullName = firstName+ lastName
    return fullName
}
fun multiply(a: Int,b: Int):Int{
    var product= a*b
    return product
}

fun name(firstName: String,years:Int){
    println(firstName+years)


}
fun divide(a: Int,b: Int){
    var modulus= a%b
    println(modulus)
}