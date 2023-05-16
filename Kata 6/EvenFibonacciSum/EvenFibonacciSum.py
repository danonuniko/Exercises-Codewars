"""
Kata Level: 6.

Give the summation of all even numbers in a Fibonacci sequence up to, but not including, the number passed to your function.
Or, in other words, sum all the even Fibonacci numbers that are lower than the given number n (n is not the nth element of Fibonnacci sequence) without including n.

The Fibonacci sequence is a series of numbers where the next value is the addition of the previous two values. The series starts with 0 and 1:
0 1 1 2 3 5 8 13 21...

For example:

fibonacci(0)==0
fibonacci(33)==10
fibonacci(25997544)==19544084
"""

# Mi solución en Python.

def even_fib(m):
    fibonacci_numbers = []
    a, b, c = 0 , 1, 1
    fibonacci_numbers.append(a)
    fibonacci_numbers.append(b)
    fibonacci_numbers.append(c)
    while b < m:
        a, b = b, a + b
        fibonacci_numbers.append(b)
    return sum(x for x in fibonacci_numbers if x % 2 == 0 and x < m)

# Solución de la comunidad 1.

def even_fib_community(m):
    x,y = 0, 1
    counter = 0
    while y < m:
        if y % 2 == 0:
            counter += y
        x,y = y, x+ y
    return counter

print(even_fib(0))
print(even_fib(33))
print(even_fib(25997544))