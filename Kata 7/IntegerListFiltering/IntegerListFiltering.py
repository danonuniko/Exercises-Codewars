"""
Kata Level: 7.

In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.
Example:
Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
Kata.filterList(List.of(1, 2, "a", "b", 0, 15)) => List.of(1,2,0,15)
Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)) => List.of(1,2,231)
"""

def filter_list(l):
    l_2 = []
    for i in l:
        if type(i) == int or type(i) == float:
            l_2.append(i)
    return l_2

print(filter_list([1, 2, "a", "b"]))
print(filter_list([1, 2, "a", "b", 0, 15]))
print(filter_list([1, 2, "a", "b", "aasf", "1", "123", 231]))