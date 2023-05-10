"""
Kata Level: 7.

Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).

Examples:

solution('abc', 'bc') // returns true
solution('abc', 'd') // returns false
"""

# Mi solución en Python.

def solution(text, ending):
    if text.endswith(ending):
        return True
    return False

# Mi solución pero más simplificada.

def solution(text, ending):
    return True if text.endswith(ending) else False


# Mi solución de la forma más simplificada posible.

def solution(string, ending):
    return string.endswith(ending)

print(solution("abc", "bc"))