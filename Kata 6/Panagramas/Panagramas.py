"""
Kata Level: 6.

A pangram is a sentence that contains every single letter of the alphabet at least once. 
For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).
Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
"""

def is_pangram(s):
    solution = set()
    for letter in s.lower():
        if letter.isalpha():
            solution.add(letter)
    return len(solution) == 26

# Posible variante de solución (comunidad).

def is_pangram_community(s):
    s = s.lower()
    for char in 'abcdefghijklmnopqrstuvwxyz':
        if char not in s:
            return False
    return True

print(is_pangram("Hello"))
print(is_pangram("The quick brown fox jumps over the lazy dog"))