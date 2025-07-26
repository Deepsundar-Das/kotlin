fun main(){
  // here is the twist if we don't define datatypes and assign null it will infer to that object that accept null
  // but if we define datatype if we null type is not acceptable for the datatype it will give us a compilation error
  // kotlin try to handles null values at compile time 
  var name : String = null 
  print("name is $name")
}
