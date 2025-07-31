fun main(){
  println(sum(1,2,3,4))
}

fun sum(vararg num : Int) : Int{
  var s : Int = 0
  for(n in num){
    s += n
  }

  var sum : Int = 0

  num.forEach{
    sum += it
  }
  return sum
}
