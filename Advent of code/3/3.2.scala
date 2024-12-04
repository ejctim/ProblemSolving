val lines = scala.io.Source.fromFile("3 input.txt").mkString

@main
def main(): Unit =
  var doMul = true
  val regexMul = "don't\\(\\)|do\\(\\)|mul\\((\\d+,\\d+)\\)".r
  val regexNum = "(\\d+,\\d+)".r
  val sepMul = regexMul.findAllIn(lines)
  var sum = 0
  sepMul.foreach(str =>
    str match
      case "don't()" => doMul = false
      case "do()" => doMul = true
      case q => val a = regexNum.findAllIn(q).mkString.split(',').map(_.toInt); if doMul then sum = sum + (a(0) * a(1))
  )
  print(sum)



