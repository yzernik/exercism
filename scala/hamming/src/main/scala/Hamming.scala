

object Hamming {
  def compute(first: String, second: String) = {
    require(first.length == second.length)
    first.zip(second)
      .filter { case (x, y) => x != y }
      .length
  }
}