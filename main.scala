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
