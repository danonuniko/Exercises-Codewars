"""
Kata Level: 6.

I would like for you to write me a function that, when given a number n (n >= 1 ), returns the nth number in the Fibonacci Sequence.

For example:

nth_fib(4) == 2
Because 2 is the 4th number in the Fibonacci Sequence.

For reference, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.
"""

def nth_fib(n):
    contador = 1
    lista = []
    a = 0
    lista.append(a)
    b = 1
    lista.append(b)
    c = a + b
    lista.append(c)
    while contador < n:
        a = b
        b = c
        c = a + b
        lista.append(c)
        contador += 1
    return lista[n-1]

# Solución de la comunidad.

def nth_fib(n):
    a, b = 0, 1
    for i in range(n-1):
        a, b = b, a + b
    return a