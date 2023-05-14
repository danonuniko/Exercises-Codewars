"""
Kata Level: 7.

Definition:
Disarium number is the number that the sum of its digits powered with their respective positions is equal to the number itself.

Task:
Given a number, Find if it is Disarium or not.

Notes:
Number passed is always Positive.
Return the result as String.

Input >> Output Examples:

disariumNumber(89) ==> return "Disarium !!"
Explanation: Since , 8^1 + 9^2 = 89 , thus output is "Disarium !!"

disariumNumber(564) ==> return "Not !!"
Explanation: Since , 5^1 + 6^2 + 4^3 = 105 != 564 , thus output is "Not !!"
"""

# Mi solución en Python.

def disarium_number(number):
    result = 0
    for i, digit in enumerate(str(number)):
        result += int(digit)**(i+1)
    return "Disarium !!" if result == number else "Not !!"

# Solución de la comunidad 1.

def disarium_number(n):
    return "Disarium !!" if n == sum(int(d)**i for i, d in enumerate(str(n), 1)) else "Not !!"

print(disarium_number(89))
print(disarium_number(564))