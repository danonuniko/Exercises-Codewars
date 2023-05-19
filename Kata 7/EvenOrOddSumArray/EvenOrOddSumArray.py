"""
Kata Level: 7.

Task:
Given a list of integers, determine whether the sum of its elements is odd or even.
Give your answer as a string matching "odd" or "even".
If the input array is empty consider it as: [0] (array with a zero).

Examples:

Input: [0]
Output: "even"

Input: [0, 1, 4]
Output: "odd"

Input: [0, -1, -5]
Output: "even"
"""

def odd_or_even(arr):
    resultado = sum(arr)
    if resultado % 2 == 0:
        return "even"
    else:
        return "odd"
        
# Solución de la comunidad. Igual que el mío pero simplificado con respecto al número de líneas.
    
def oddOrEven(arr):
    return 'even' if sum(arr) % 2 == 0 else 'odd'
    
print(odd_or_even([0, 1, 4]))
print(odd_or_even([0, -1, -5]))