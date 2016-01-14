

class Anagram(word: String) {
  def matches(candidates: Seq[String]) =
    candidates.filter { c => isAnagram(word, c) }

  def isAnagram(word: String, other: String) = {
    val w = word.toLowerCase
    val o = other.toLowerCase
    w != o && w.sorted == o.sorted
  }
}