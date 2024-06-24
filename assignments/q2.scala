object Main extends App {
  var a: Int = 2
  var b: Int = 3
  var c: Int = 4
  var d: Int = 5
  var k: Float = 4.3f
  var g: Float = 10.0f
  
  b -= 1  
  val exprA = -b * a + c * d
  
  val exprB = a
  a += 1  

  val exprC = -2 * (g - k) + c
  
  val exprD = c
  c += 1  
  
  c += 1  
  val exprE = c * a
  a += 1  
  
  println(s"a) $exprA")
  println(s"b) $exprB")
  println(s"c) $exprC")
  println(s"d) $exprD")
  println(s"e) $exprE")
}
