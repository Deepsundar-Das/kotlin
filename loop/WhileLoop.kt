fun main(){
  var i = 0
  outer@ while(i < 100){
    i++
    if(i % 10 == 0) {continue}
    else if(i % 5 == 0) {continue}
    else if(i == 99) {break}
    print("$i\t")

    var i = 0
    while(i < 100){
      // this @outer is called lable here clearly we are saying break the outer loop also 
      // also we cannot do reverse thing means we cannot controll inner loop from outer loop
      if(i == 0) break@outer
      else print("I am in the inner loop")
    }
  }
}
