"""
Kata Level: 8.

Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
"""

def even_or_odd(number):
    return "Even" if number % 2 == 0 else "Odd"

print(even_or_odd(0))
print(even_or_odd(10))
print(even_or_odd(1))
print(even_or_odd(13))