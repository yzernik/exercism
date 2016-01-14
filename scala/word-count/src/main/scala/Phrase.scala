

class Phrase(s: String) {
  def wordCount = s
    .toLowerCase
    .split("[^\\w']+")
    .foldLeft(Map.empty[String, Int]) {
      case (m, w) =>
        val n = m.getOrElse(w, 0)
        m + (w -> (n + 1))
    }
}