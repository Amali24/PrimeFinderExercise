fun main(args:Array<String>){
    val maxNum = 2000
    for (i in 2..maxNum){
        if (isPrime(i)){
            println(i)
        }
    }
}

fun isPrime(num:Int):Boolean{
    for (i in 2..num/2){
        if (num % i == 0){
            return false
        }
    }
    return true
}