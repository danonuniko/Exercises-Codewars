"""
Kata Level: 8.

What if we need the length of the words separated by a space to be added at the end of that same word and have it returned as an array?

Example(Input --> Output)

"apple ban" --> ["apple 5", "ban 3"]
"you will win" -->["you 3", "will 4", "win 3"]

Your task is to write a function that takes a String and returns an Array/list with the length of each word added to each element .
Note: String will have at least one element; words will always be separated by a space.
"""

def add_length(str_):
    list = str_.split(" ")
    for i, word in enumerate(list):
        list[i] = word + " " + str(len(word))
    return list

# Solución de la comunidad.

def add_length_community(str_):
    return ["{} {}".format(i, len(i)) for i in str_.split(' ')]

print(add_length("Hola que tal estás"))