"""
Kata Level: 7.

Definition: A Tidy number is a number whose digits are in non-decreasing order.

Task: Given a number, Find if it is Tidy or not.

Notes:
Number passed is always Positive.
Return the result as a Boolean.

Input >> Output Examples:

tidyNumber (12) ==> return (true)
Explanation: The number's digits {1, 2} are in non-Decreasing Order (i.e) 1 <= 2.

tidyNumber (32) ==> return (false)
Explanation: The Number's Digits {3, 2} are not in non-Decreasing Order (i.e) 3 > 2.

tidyNumber (1024) ==> return (false)
Explanation: The Number's Digits {1, 0, 2, 4} are not in non-Decreasing Order as 0 <= 1.

tidyNumber (13579) ==> return (true)
Explanation: The number's digits {1, 3, 5, 7, 9} are in non-Decreasing Order.

tidyNumber (2335) ==> return (true)
Explanation: The number's digits {2, 3, 3, 5} are in non-Decreasing Order , Note 3 <= 3.
"""

# Mi solución en Python.

def tidyNumber(n):
    number = int(str(n)[0])
    for i, digit in enumerate(str(n), 1):
        if int(digit) < number:
            return False
        number = int(digit)
    return True

# Solución de la comunidad 1.

def tidyNumberCommunity1(n):
    return n == int(''.join(sorted(str(n))))

# Solución de la comunidad 2.

def tidyNumberCommunity2(n):
    n = str(n)
    for i in range(0, len(n) - 1):
        if n[i] > n[i + 1]:
            return False

    return True

print(tidyNumber(12))
print(tidyNumber(32))
print(tidyNumber(1024))
print(tidyNumber(13579))
print(tidyNumber(2335))