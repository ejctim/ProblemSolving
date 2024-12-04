val lines = scala.io.Source.fromFile("1 input.txt").mkString
import scala.collection.mutable.ListBuffer

@main
def main(): Unit =
  val lineSeq = lines.split("\n")
  val numSeq = lineSeq.map(str => str.trim.split("   "))
  val left = ListBuffer[Int]()
  val right = ListBuffer[Int]()

  numSeq.foreach(arSt =>
    left += arSt(0).toInt
    right += arSt(1).toInt)

  val leftSort = left.sorted
  val rightSort = right.sorted

  for i <- rightSort.indices do
    print(leftSort(i) + "   ")
    println(rightSort(i))

  var sum = 0

  println(leftSort.foreach(lNum => leftSort.forall(a => a == lNum)))

  // 1.2
  var sum2 = 0
  var k = 0
  for i <- rightSort.indices do
    k = 0
    for j <- rightSort.indices do
      if rightSort(i) == leftSort(j) then k += 1
    sum2 = k * rightSort(i) + sum2

  for i <- right.indices do
    sum = math.abs(leftSort(i) - rightSort(i)) + sum

  println("sum = " + sum)
  println("sum2 = " + sum2)
