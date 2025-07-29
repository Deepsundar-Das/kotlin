fun main(){
  println(getMax(2,5))
  println(getMax(6.2, 7.4))
  println(getMax(2.3,5.1,3.2))

}

/*
fun getMax(a : Int, b : Int) : Int {
  return if(a > b) a else b
}
*/

// single expression function 
fun getMax(a : Int, b : Int) = if(a > b) a else b

// function overloading
fun getMax(a : Double, b : Double) = if(a > b) a else b

// another way to method overloading is by changing the number the parameter

/*
fun getMax(a : Double, b : Double, c : Double) : Double{
  var res : Double = 0.0  
  if(a > b && a > c) res = a
  else if(b > a && b > c) res = b
  else res = c
  return res;
}
*/

fun getMax(a : Double, b : Double, c : Double) = if(a > b && a > c) a else if(b > a && b > c) b else c


