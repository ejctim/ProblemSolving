val lines = scala.io.Source.fromFile("4 input.txt").mkString

@main
def main(): Unit =
  val lineSeq = lines.split("\n").toSeq
  val lineSlides = lines.sliding(4)
  var sum = 0
  lineSlides.foreach(str =>
    str match
      case "XMAS" => sum += 1
      case "SMAS" => sum += 1
      case _ =>
  )

  println(sum)