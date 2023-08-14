object q1 extends App{
  val calculateInterest: Double => Double = { depositAmount =>
    depositAmount match {
      case amount if amount <= 20000 => 0.02 * amount
      case amount if amount <= 200000 => 0.04 * amount
      case amount if amount <= 2000000 => 0.035 * amount
      case amount => 0.065 * amount
    }
  }
  println(calculateInterest(15000))
}