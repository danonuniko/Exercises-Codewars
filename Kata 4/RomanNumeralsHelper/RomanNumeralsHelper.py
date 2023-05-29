"""
Kata Level: 4.

Write two functions that convert a roman numeral to and from an integer value. 
Multiple roman numeral values will be tested for each function.

Modern Roman numerals are written by expressing each digit separately starting with the left most digit and skipping any digit with a value of zero. 
In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC. 
2008 is written as 2000=MM, 8=VIII; or MMVIII. 
1666 uses each Roman symbol in descending order: MDCLXVI.

Input range : 1 <= n < 4000

In this kata 4 should be represented as IV, NOT as IIII (the "watchmaker's four").

Examples
to roman:
2000 -> "MM"
1666 -> "MDCLXVI"
1000 -> "M"
 400 -> "CD"
  90 -> "XC"
  40 -> "XL"
   1 -> "I"

from roman:
"MM"      -> 2000
"MDCLXVI" -> 1666
"M"       -> 1000
"CD"      -> 400
"XC"      -> 90
"XL"      -> 40
"I"       -> 1

Help
Symbol	Value
I	1
IV	4
V	5
X	10
L	50
C	100
D	500
M	1000
"""

def to_roman(n):
    dictionary = {1000: 'M', 2000: 'MM', 3000: 'MMM', 100: 'C', 200: 'CC', 300: 'CCC', 400: 'CD', 500: 'D', 
    600: 'DC', 700: 'DCC', 800: 'DCCC', 900: 'CM', 10: 'X', 20: 'XX', 30: 'XXX', 40: 'XL', 50: 'L', 60: 'LX', 
    70: 'LXX', 80: 'LXXX', 90: 'XC', 1: 'I', 2: 'II', 3: 'III', 4: 'IV', 5: 'V', 6: 'VI', 7: 'VII', 8: 'VIII', 9: 'IX', 0: ''}
    miles = n//1000 * 1000
    n = n - miles
    centenas = n // 100 * 100
    n = n - centenas
    decenas = n // 10 * 10
    n = n - decenas
    return dictionary[miles] + dictionary[centenas] + dictionary[decenas] + dictionary[n]

def from_roman(roman):
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
    
print(to_roman(1249))
print(from_roman("MCCXLIX"))