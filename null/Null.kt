fun main(){
  /*
  here is the twist if we don't define datatypes and assign null it will infer to that object that accept null
   but if we define datatype if we null type is not acceptable for the datatype it will give us a compilation error
   kotlin try to handles null values at compile time

   this '?' tells the compiler that the variable can accept a null value and it will not complain user at compile time
   it will print null whenever and whatever operation we do

   */

  var name : String? = "Deep"

  /*
   at this time the name.length function or method will complain me that the .length method is only applicable on non-null
   variables.
 */

//  print("name is ${name.length}")

   /*

   to handle this we have two method insert safe-call operator(?) or !! operator
   safe call operator says the value can be null if the variable value is then treat as null but if not null give me the result
   in our case if not null print result or it will print null.
   and by using !! operator I am saying to the compiler I am sure you are the value will not be null, so the compiler
   will not complain you at compile time but at runtime it will give you nullPointerException

    */
  name = null
  print("value of Name is : ${name!!.length} ")
}
