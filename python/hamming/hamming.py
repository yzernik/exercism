def distance(s1, s2):
    count = 0
    for c1, c2 in zip(s1, s2):
        if c1 != c2:
            count += 1
    return count
