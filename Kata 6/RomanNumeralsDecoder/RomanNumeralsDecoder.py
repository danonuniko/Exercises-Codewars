"""
Kata Level: 6.

DESCRIPTION:
Create a function that takes a Roman numeral as its argument and returns its value as a numeric decimal integer. 
You don't need to validate the form of the Roman numeral.

Modern Roman numerals are written by expressing each decimal digit of the number to be encoded separately, starting with the leftmost digit and skipping any 0s.
So 1990 is rendered "MCMXC" (1000 = M, 900 = CM, 90 = XC) and 2008 is rendered "MMVIII" (2000 = MM, 8 = VIII). 
The Roman numeral for 1666, "MDCLXVI", uses each letter in descending order.

Example:		solution('XXI') # should return 21

Help:

Symbol    Value
I          1
V          5
X          10
L          50
C          100
D          500
M          1,000
"""

def solution(roman):
    dictionary_1 = {"IV": 4, "IX": 9, "XL": 40, "XC": 90, "CD": 400, "CM":900}
    dictionary_2 = {"I": 1, "V": 5, "X": 10, "L": 50, "C": 100, "D": 500, "M": 1000}
    resultado = 0
    for keys in dictionary_1:
        if keys in roman:
            resultado += dictionary_1[keys]
            roman = roman.replace(keys, "")
    for letter in roman:
        resultado += dictionary_2[letter]
    return resultado

print(solution("XIX"))
print(solution("MCCLXXVII"))
print(solution("CDXC"))