val lines = scala.io.Source.fromFile("2 input.txt").mkString

@main
def main(): Unit =
  val lineSeq = lines.split("\n").toSeq
  val numSeq = lineSeq.map(str => str.trim.split(" ").map(_.toInt).toSeq)



  var i = 0
  var j = 0
  var sum = 0
  var deQual = 0

  val numSeqDiff = numSeq.map(seq => seq.sliding(2).map{case Seq(a, b) => b - a}.toSeq)
  numSeqDiff.foreach(seq =>
    deQual = 0
    if seq.contains(0) then deQual +=1
    if seq.exists(x => x < -3 || x > 3) then deQual += 1
    if seq.exists(x => x < 0 && x > 0) then deQual += 1
    if deQual <= 1 then
      sum += 1
      println("deQual num = " +deQual + " " + numSeqDiff(numSeqDiff.indexOf(seq)))
)
  println(sum)

//  for k <- numSeq.indices do
//  val  numSeqDiff = numSeq(k).map(num => math.abs(num - numSeq(k)(numSeq(k).indexOf(num)+1)))
//  print(numSeq)

//  while i < numSeq.length do
//    j = 0
//    deQual = 0
//    while j < numSeq(i).length-1 do
//      if((numSeq(i)(j) - numSeq(i)(j+1) <= 3) && (numSeq(i)(j) - numSeq(i)(j+1) >= 1) || (numSeq(i)(j) - numSeq(i)(j+1) >= -3) && (numSeq(i)(j) - numSeq(i)(j+1) <= -1)) && deQual <= 1 then
//        if j == numSeq(i).length-2 then
//          sum += 1
//          println(numSeq(i))
//      else if deQual <= 1 then
//        numSeq(i).filter(_ != numSeq(i)(j))
//        deQual += 1
//        j -= 1
//      else
//        deQual += 1
//
//      j += 1
//    i += 1

  print(sum)

