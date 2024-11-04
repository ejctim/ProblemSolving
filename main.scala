
//object Solution {
//  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
//    import scala.collection.mutable.ListBuffer
//    val reArray: ListBuffer[Int] = ListBuffer()
//    var d = false
//    if (nums.length > 0)
//      nums.foreach{n =>
//        if (nums.slice(nums.indexOf(n)+1, nums.length).contains(target - n) && !d) {
//          reArray.append(nums.indexOf(n))
//          reArray.append(nums.lastIndexOf(target - n))
//          d = true
//        }
//      }
//    reArray.toArray
//  }
//}


object Solution {
  val reArray: Array[Int] = Array(0, 0)
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val numsMap = collection.mutable.Map[Int, Int]()
    for (num,i) <- nums.zipWithIndex do
      numsMap(num) = i
    for (num,i) <- nums.zipWithIndex do
      if (numsMap.contains(target - num) && numsMap(target - num) != i)
        reArray(0) = numsMap(target - num)
        reArray(1) = i
    reArray
  }
}

/*
Sortera där efter börja
neg tal bara värt att kolla mot tal > target




 */


@main
def main(): Unit = {
  val testArray: Array[Int] = Array(-89, 28, 97) //3,2,4    2,7,11,15
  val t = 8 //9
  println(Solution.twoSum(testArray, t).mkString("Array(", ", ", ")"))
}