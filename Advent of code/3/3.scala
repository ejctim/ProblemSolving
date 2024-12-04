val lines = scala.io.Source.fromFile("3 input.txt").mkString

@main
def main(): Unit =
  val regexMul = "mul(\\(\\d+,\\d+\\))".r
  val sepMul = regexMul.findAllIn(lines)
  val regexNum = "(\\d+,\\d+)".r
  val numPairs = regexNum.findAllIn(sepMul.mkString).toSeq
  val multiplied = numPairs.map(str =>
    val Array(a, b) = str.split(',').map(_.toInt)
    a * b
  )
  val sum = multiplied.sum
  println(sum)



