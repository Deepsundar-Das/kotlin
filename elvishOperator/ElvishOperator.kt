fun main(){
  var text : String? = "Deep"
  // ?: -> this is called elvish operator 
  // this means if the value of text is null then assign next thing after ':' if not null then assign value of text.
  var text2 = text ?: "I have no name"
  print(text2)
}
