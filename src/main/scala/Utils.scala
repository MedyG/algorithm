object Utils {
  def timer[A](blockCode:A) ={
    val start = System.nanoTime()
    val result = blockCode
    val end = System.nanoTime()
    println(s"runtime: ${end - start}ns")
    (result,end - start)
  }
}
