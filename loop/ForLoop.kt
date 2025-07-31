fun main(){
  // .. -> 1<=i<=10 
  for(i in 1..10){
    print("$i \t")
  }

  println()

  // until -> 1 <= i < 10
  for (j in 1 until 10){
    print("$j \t")
  }

  println()

  // to decrese the numbers we have to use downTo keyword, otherwise it will compile but won't work

  // step -> for jump , like 10,8, 6, 4, 2 ...
  for(i in 10 downTo 1 step 22){
    print("$i \t")
  }
    
}
