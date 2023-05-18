"""
Kata Level: 7.

Don't give me five!
In this kata you get the start number and the end number of a region and should return the count of all numbers except numbers with a 5 in it. 
The start and the end number are both inclusive!

Examples:

1,9 -> 1,2,3,4,6,7,8,9 -> Result 8
4,17 -> 4,6,7,8,9,10,11,12,13,14,16,17 -> Result 12
The result may contain fives. ;-)

The start number will always be smaller than the end number. Both numbers can be also negative!
"""

#	Mi solución. Pasa correctamente todos los test.

def dont_give_me_five(start,end):
    count = 0
    for number in range(start, end + 1):
        number = str(number)
        if '5' not in number:
            count += 1
    return count

#	Solución de la comunidad.

def dont_give_me_five(start, end):
    return sum('5' not in str(i) for i in range(start, end + 1)) 