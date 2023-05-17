"""
Kata Level: 7.

In this little assignment you are given a string of space separated numbers, 
and have to return the highest and lowest number.

Examples:
highAndLow("1 2 3 4 5")  // return "5 1"
highAndLow("1 2 -3 4 5") // return "5 -3"
highAndLow("1 9 3 4 -5") // return "9 -5"

Notes:
All numbers are valid Int32, no need to validate them.
There will always be at least one number in the input string.
Output string must be two numbers separated by a single space, and highest number is first.
"""

def high_and_low(numbers):
    
    result = []
    for number in numbers.split():
        result.append(int(number))
    result.sort()
    return f"{result[-1]} {result[0]}"

def high_and_low_community(numbers):
    
    nn = [int(s) for s in numbers.split(" ")]
    return "%i %i" % (max(nn),min(nn))

print(high_and_low("1 2 3 4 5 0"))
print(high_and_low("8 3 -5 42 -1 0 0 -9 4 7 4 -4"))