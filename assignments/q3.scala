object SalaryCalculator extends App {

  val normalRate: Double = 250.0
  val otRate: Double = 85.0
  val taxRate: Double = 0.12

  def calculateSalaryWithoutTax(normalHours: Int, otHours: Int): Double = {
    (normalHours * normalRate) + (otHours * otRate)
  }

  def taxAmount(grossSalary: Double): Double = {
    grossSalary * taxRate
  }

  def calculateTakeHomeSalary(normalHours: Int, otHours: Int): Double = {
    val grossSalary = calculateSalaryWithoutTax(normalHours, otHours)
    val tax = taxAmount(grossSalary)
    grossSalary - tax
  }

  val normalHours = 40
  val otHours = 30

  val takeHomeSalary = calculateTakeHomeSalary(normalHours, otHours)
  println(f"Take-home salary: Rs. $takeHomeSalary%.2f")
}
