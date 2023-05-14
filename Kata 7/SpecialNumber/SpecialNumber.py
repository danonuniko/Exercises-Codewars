"""
Kata Level: 7.

Definition:
A number is a Special Number if it’s digits only consist 0, 1, 2, 3, 4 or 5.

Given a number determine if it special number or not.

Notes:
The number passed will be positive (N > 0) .
All single-digit numbers within the interval [1:5] are considered as special number.

Input >> Output Examples:

specialNumber(2) ==> return "Special!!"
Explanation: It's a single-digit number within the interval [1:5].

specialNumber(9) ==> return "NOT!!"
Explanation: Although, it's a single-digit number but Outside the interval [1:5] .

specialNumber(23) ==> return "Special!!"
Explanation: All the number's digits formed from the interval [0:5] digits .

specialNumber(39) ==> return "NOT!!"
Explanation: Although, there is a digit (3) Within the interval But the second digit is not (Must be ALL The Number's Digits).

specialNumber(59) ==> return "NOT!!"
Explanation: Although, there is a digit (5) Within the interval But the second digit is not (Must be ALL The Number's Digits) .

specialNumber(513) ==> return "Special!!"
specialNumber(709) ==> return "NOT!!"
"""

# Mi solución en Python.

def special_number(number):
    numbers = "012345"
    for digit in str(number):
        if digit not in numbers:
            return "NOT!!"
    return "Special!!"

# Solución de la comunidad.

def special_number(n):
    return "Special!!" if max(str(n)) <= "5" else "NOT!!"