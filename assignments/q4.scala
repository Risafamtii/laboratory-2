object TicketProfitCalculate extends App {

  val flatPerformancePrice = 500

 
  def attendance(ticketPrice: Int): Int = {
    val gradient = (120 - 100).toFloat / (15 - 20) 
    val intercept = 120 - (gradient * 15) 
    (gradient * ticketPrice + intercept).toInt
  }

  def baseProfit(ticketPrice: Int): Int = {
    ticketPrice * attendance(ticketPrice)
  }

  def costPerAttendee(ticketPrice: Int): Int = {
    3 * attendance(ticketPrice)
  }

  def trueProfit(ticketPrice: Int): Int = {
    baseProfit(ticketPrice) - (costPerAttendee(ticketPrice) + flatPerformancePrice)
  }

  println("Profit at Rs. 5 : " + trueProfit(5))
  println("Profit at Rs. 10 : " + trueProfit(10))
  println("Profit at Rs. 15 : " + trueProfit(15))
  println("Profit at Rs. 20 : " + trueProfit(20))
  println("Profit at Rs. 25 : " + trueProfit(25))
  println("Profit at Rs. 30 : " + trueProfit(30))
  println("Profit at Rs. 35 : " + trueProfit(35))
  println("Profit at Rs. 40 : " + trueProfit(40))

  val prices = List(5, 10, 15, 20, 25, 30, 35, 40)
  val bestPrice = prices.maxBy(trueProfit)
  val maxProfit = trueProfit(bestPrice)

  println(s"The best ticket price is Rs. $bestPrice with a maximum profit of Rs. $maxProfit")
}
