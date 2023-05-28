"""
Kata Level: 6.

Definition (Primorial Of a Number):

Is similar to factorial of a number, In primorial, not all the natural numbers get multiplied, only prime numbers are multiplied to calculate the primorial of a number. 
It's denoted with P# and it is the product of the first n prime numbers.

Task:	Given a number N , calculate its primorial.

Notes:

Only positive numbers will be passed (N > 0).

Input >> Output Examples:

numPrimorial (3) ==> return (30)
Explanation:	Since the passed number is (3), then the primorial should obtained by multiplying 2 * 3 * 5 = 30.
Mathematically written as, P3# = 30.

numPrimorial (5) ==> return (2310)
Explanation: Since the passed number is (5), then the primorial should obtained by multiplying  2 * 3 * 5 * 7 * 11 = 2310.
Mathematically written as, P5# = 2310.

numPrimorial (6) ==> return (30030)
Explanation: Since the passed number is (6), then the primorial should obtained by multiplying  2 * 3 * 5 * 7 * 11 * 13 = 30030.
Mathematically written as, P6# = 30030.
"""

# Mi solución en Python.

def num_primorial(n):
    if n == 0:
        return 0
    if n == 1:
        return 2
    list = [2]
    contador = 3
    while len(list) < n:
        for i in range(2, contador):
            if contador % i == 0:
                break
            if i == contador-1:
                list.append(contador)
        contador += 1
    resultado = 1
    for elemento in list:
        resultado *= elemento
    return resultado

print(num_primorial(3))
print(num_primorial(5))
print(num_primorial(6))