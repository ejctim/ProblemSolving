val lines = scala.io.Source.fromFile("2 input.txt").mkString

@main
def main(): Unit =
  val lineSeq = lines.split("\n").toSeq
  val numSeq = lineSeq.map(str => str.trim.split(" ").map(_.toInt).toSeq)

  var disqualifi = 0
  var k = 0
  var j = 0
  for i <- numSeq.indices do
    disqualifi = 0
    if (numSeq(i)(j) - numSeq(i)(numSeq(i).length-1)) > 0 then numSeq.updated(i, numSeq(i).reverse); println("rev " + numSeq(i))
    for j <- numSeq(i).indices.dropRight(1) do
      //if numSeq(i) == numSeq(i).sorted | numSeq(i) == numSeq(i).sorted.reverse then
        if (numSeq(i)(j) - numSeq(i)(j+1) >= 1) && (numSeq(i)(j) - numSeq(i)(j+1) <= 3) && (disqualifi <= 1) then
          //println(s"Comparing ${numSeq(i)(j)} and ${numSeq(i)(j+1)}: Difference = ${math.abs(numSeq(i)(j) - numSeq(i)(j+1))}")
          if j == numSeq(i).length-2 then
            k += 1
            println(numSeq(i))
            println("disq = " + disqualifi)
        else  disqualifi += 1
  println(k)
  numSeq println ()