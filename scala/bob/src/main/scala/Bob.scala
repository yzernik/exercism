

class Bob {
  def hey(prompt: String) = {
    val letters = prompt.filter(_.isLetter)
    if (!letters.isEmpty && letters.forall(_.isUpper))
      "Whoa, chill out!"
    else if (prompt.endsWith("?"))
      "Sure."
    else if (prompt.filter(_.isLetterOrDigit).isEmpty)
      "Fine. Be that way!"
    else
      "Whatever."
  }
}