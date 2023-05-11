"""
Kata Level: 5.

Write an algorithm that takes an array and moves all of the zeros to the end, preserving the order of the other elements.

Kata.MoveZeroes(new int[] {1, 2, 0, 1, 0, 1, 0, 3, 0, 1}) => new int[] {1, 2, 1, 1, 3, 1, 0, 0, 0, 0}
"""

# Interesante que funcione cuando estoy eliminando valores de un array a la misma vez que lo recorro. Tengo entendido que no es una práctica muy recomendada.
def move_zeros(lst):
    for i, number in enumerate(lst):
        if number == 0:
            lst.remove(lst[i])
            lst.append(0)
    return lst

print(move_zeros([1, 2, 3, 0, 4, 0, 0, 3, 2]))