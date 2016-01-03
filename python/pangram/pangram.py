def is_pangram(sentence):
    s = set()
    for c in sentence.lower():
        if c.isalpha():
            s.add(c)
    return len(s) == 26
