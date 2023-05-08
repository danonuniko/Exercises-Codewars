"""
Kata Level: 7.

Given the triangle of consecutive odd numbers:

                1
             3     5
          7     9    11
      13    15    17    19 
   21    23    25    27    29
 ...
 
Calculate the sum of the numbers in the n-th row of this triangle (starting at index 1) .

e.g.: (Input --> Output)

1 -->  1
2 --> 3 + 5 = 8
"""

# Mi solución en Python.
	
def row_sum_odd_numbers(n):
    first_number = n * (n -1) + 1
    lista = []
    lista.append(first_number)
    for i in range(0, n-1):
        first_number += 2
        lista.append(first_number)
    return sum(lista)
	
# Solución de la comunidad 1.
	
def row_sum_odd_numbers(n):
    return sum(range(n*(n-1)+1, n*(n+1), 2)) 
	
# Solución de la comunidad 2.
	
def row_sum_odd_numbers(n):
    if type(n)==int and n>0:
        return n**3
    else:
        return "Input a positive integer"

print(row_sum_odd_numbers(1))
print(row_sum_odd_numbers(2))
print(row_sum_odd_numbers(3))
print(row_sum_odd_numbers(4))
