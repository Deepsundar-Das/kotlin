fun main(){
  val m = Car("          Maruti", false, 2)
  print("name of b is ${m.model}")

  val porsche = Car("992 GT 3")
  println("porsche car details -> name : ${porsche.model}, number of seats : ${porsche.noOfSeats}")
}


class Car(var model : String, var wornSeatBelt : Boolean, val noOfSeats : Int) {

  // init(initializer) block runs first when an object is created
  // you can use multiple initializer block 
  init{
    model = model.trim()
    if(!wornSeatBelt){
      println("please close the door")
    }
  }

  init{
    if(this.noOfSeats < 4){
      println("You should buy a 4 seater car")
    }
  }


  // secondary constructor must call primary constructor before entering its body, it prevents from null safty
  constructor(model : String) :  this(model, false, 2){
    
  }


}
