fun main(){

  // we can store the names and we have to define what to do when array is initialized using a lambda,
  // because kotlin does not like null pointer exception.
  
  /*
  val names : Array<String> = Array<String>(10){""}
  names[0] = "deep"
  names[1] = "bud"
  names[2] = "dipan"
  */

  // now you can define insert a null value in the array using the arrayOfNulls<T>(size : Int)
  
  val names : Array<String?> = arrayOfNulls(5)
  names[0] = "deep"
  names[1] = "bud"
  names[2] = "dipan"

  // contentToString is equivalent to Arrays.toString(array_name) in java
  println(names.contentToString())
  println("size of the array is : " + names.size)

  // for integers we can use IntArray, we can initialize using a lambda or 
  // only give the size and it will initialize indexes with 0
  val numbers : IntArray = IntArray(10)
    
    // '..' is actually rangeTo() function we can actually use rangeTo() function instead of '..'
    for(i in 1.rangeTo(10)){
        numbers[i-1] = i * 2
    }
    println(numbers.contentToString())


    // we can store any type of variabeles in this type of array
  val arrayOfAny : Array<Any?> = Array(10,{})
    arrayOfAny[0] = 1
    arrayOfAny[1] = "something"
    arrayOfAny[2] = 'h'
    arrayOfAny[3] = false
    println(arrayOfAny.contentToString())

    for(i in arrayOfAny){
      if(i is Int){
        print(i)
      }
    }

}
