"""
Kata Level: 6.

The Hamming Distance is a measure of similarity between two strings of equal length. 
Complete the function so that it returns the number of positions where the input strings do not match.

Examples:

a = "I like turtles"
b = "I like turkeys"
Result: 3

a = "Hello World"
b = "Hello World"
Result: 0

a = "espresso"
b = "Expresso"
Result: 2

You can assume that the two input strings are of equal length.
"""

def hamming(a,b):
    count = 0
    for i , letter in enumerate(a):
        if a[i] != b[i]:
            count += 1
    return count

# Solución de la comunidad.

def hamming_community(a,b):
    return sum(ch1 != ch2 for ch1, ch2 in zip(a, b))

print(hamming("I like turtles", "I like turkeys"))
print(hamming("Hello World", "Hello World"))
print(hamming("espresso", "Expresso"))