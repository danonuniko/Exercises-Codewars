"""
Kata Level: 7.

Square every digit of a number and concatenate them.
For example, if we run 9119 through the function, 811181 will come out, because 9^2 is 81 and 1^2 is 1.

Note: The function accepts an integer and returns an integer
"""

# Mi solución en Python.

def square_digits(num):
    result = ""
    for digit in str(num):
        result += str(int(digit)**2)
    return int(result)

print(square_digits(9119))