object q3 extends App{

    val formatNames: (Int, String, Int) => String = { (opp, name, index) =>
        opp match {
        case opp if opp == 1 => name.substring(0, index - 1) + name.charAt(index - 1).toUpper.toString() + name.substring(index)
        case opp if opp == 2 => name.substring(0, index - 1) + name.charAt(index - 1).toLower.toString() + name.substring(index)
        case opp => "Invalid Type"
        }
    }

    println("1 ->> ToUpper")
    println("2 ->> ToLower")
    val a = scala.io.StdIn.readInt()
    println("Enter the word -> ")
    val b = scala.io.StdIn.readLine()
    println("Witch letter you want to converts -> ")
    val c = scala.io.StdIn.readInt()
    print(formatNames(a, b, c))
}