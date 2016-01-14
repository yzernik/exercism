

object Hamming {
  def compute(first: String, second: String) = {
    require(first.length == second.length)
    first.zip(second)
      .count { case (x, y) => x != y }
  }
}