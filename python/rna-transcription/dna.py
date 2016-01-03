complements = {'G': 'C',\
               'C': 'G',\
               'T': 'A',\
               'A': 'U'}

def to_complement(c):
    return complements[c]

def to_rna(dna):
    return ''.join(map(to_complement, dna))
