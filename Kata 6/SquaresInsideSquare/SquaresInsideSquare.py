"""
Kata Level: 6.

Richard Phillips Feynman was a well-known American physicist and a recipient of the Nobel Prize in Physics. 
He worked in theoretical physics and pioneered the field of quantum computing.
Recently, an old farmer found some papers and notes that are believed to have belonged to Feynman. 
Among notes about mesons and electromagnetism, there was a napkin where he wrote a simple puzzle: "how many different squares are there in a grid of NxN squares?".

For example, when N=2, the answer is 5: the 2x2 square itself, plus the four 1x1 squares in its corners:

Task: Complete the function that solves Feynman's question in general. The input to your function will always be a positive integer.

Examples:

1  -->   1
2  -->   5
3  -->  14
"""

# Mi solución en Python. La lógica es exactamente igual a la de Java, pero no consigue pasar las pruebas por Time Out (en Java no me da ningún problema).

def count_squares(n):
    resultado = 0
    while n >= 1:
        resultado += n**2
        n -= 1
    return resultado
    # return n*(n+1)*(2*n+1)//6     Esta es la solución de la comunidad que supera todos los test.

print(count_squares(1))
print(count_squares(2))
print(count_squares(3))
print(count_squares(4))