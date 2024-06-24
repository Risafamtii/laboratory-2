object Main extends App {
  var k: Int = 2
  var i: Int = 2
  var j: Int = 2
  var m: Int = 5
  var n: Int = 5
  var f: Float = 12.0f
  var g: Float = 4.0f
  var c: Char = 'X'
  
  
  val exprA = k + 12 * m
  val exprB = m / j
  val exprC = n % j
  val exprD = m / j * j
  val exprE = f + 10 * 5 + g
  
 
  println(s"a) k + 12 * m = $exprA")
  println(s"b) m / j = $exprB")
  println(s"c) n % j = $exprC")
  println(s"d) m / j * j = $exprD")
  println(s"e) f + 10 * 5 + g = $exprE")
}
