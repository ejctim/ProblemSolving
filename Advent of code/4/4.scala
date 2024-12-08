val lines = scala.io.Source.fromFile("4 input.txt").mkString

@main
def main(): Unit =
  val lineSeq = lines.split("\n").toSeq
  val charMatix = lineSeq.map(line => line.trim.split("").toSeq)
  val x = 0
  val y = 0
  charMatix.foreach(s =>
    s.foreach(char =>
      if char == "X" then
        lookAround(x,y)
      y += 1
    )
    x += 1
  )

  def lookAround(x: Int, y: Int): Unit =
    if charMatix(x)(y)

  println(sum)