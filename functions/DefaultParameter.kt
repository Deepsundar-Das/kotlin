fun main(){
  getDetails(age = 22)
}

/* here name and isEarning is given the default parameter if any arguments are not passed for these parameters
the default pareameter will be used */
/*
 you must use named arguments to tell the compiler exactly which parameter  you are providing a value for. This avoids confusion and lets you skip the default ones.
  */
fun getDetails(name : String = "No name", isEarning : Boolean = false , age : Int){
  println("the name is : $name, is he/she earning : $isEarning, his age is : $age")
}
