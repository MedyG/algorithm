
object Utils {

  def timer[A](blockCode: A) = {
    val start: Long = System.nanoTime()
    val result: A = blockCode
    val end: Long = System.nanoTime()
    println(s"runtime: ${end - start}ns")
    (result, end - start)
  }

}
