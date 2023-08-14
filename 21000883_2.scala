object q2 extends App{
    val number: Int => String = { number =>
        number match {
        case number if number <= 0 => "Negative/Zero"
        case number if number%2 == 0 => "Even"
        case number => "Odd"
        }
    }
    val a = scala.io.StdIn.readInt()
    print(number(a))
}