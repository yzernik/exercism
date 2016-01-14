

class Bob {
  def hey(prompt: String) =
    if (prompt.exists(_.isLetter) && prompt.toUpperCase == prompt)
      "Whoa, chill out!"
    else if (prompt.endsWith("?"))
      "Sure."
    else if (!prompt.exists(_.isLetterOrDigit))
      "Fine. Be that way!"
    else
      "Whatever."
}