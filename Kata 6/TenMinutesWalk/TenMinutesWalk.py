"""
Kata Level: 6.

You live in the city of Cartesia where all roads are laid out in a perfect grid. 
You arrived ten minutes too early to an appointment, so you decided to take the opportunity to go for a short walk. 
The city provides its citizens with a Walk Generating App on their phones -- everytime you press the button it sends 
you an array of one-letter strings representing directions to walk (eg. ['n', 's', 'w', 'e']). 
You always walk only a single block for each letter (direction) and you know it takes you one minute to traverse one city block, 
so create a function that will return true if the walk the app gives you will take you exactly ten 
minutes (you don't want to be early or late!) and will, of course, return you to your starting point. Return false otherwise.

Note: you will always receive a valid array containing a random assortment of direction letters ('n', 's', 'e', or 'w' only). 
It will never give you an empty array (that's not a walk, that's standing still!).
"""

def is_valid_walk(walk):
    time = 0
    vertical_move = 0
    horizontal_move = 0
    for letter in walk:
        time += 1
        if letter == 'n':
            vertical_move += 1
        elif letter == 's':
            vertical_move -= 1
        elif letter == 'w':
            horizontal_move -= 1
        elif letter == 'e':
            horizontal_move += 1
    if time == 10 and vertical_move == 0 and horizontal_move == 0:
        return True
    return False

# Solución de la comunidad.

def isValidWalk(walk):
    return len(walk) == 10 and walk.count('n') == walk.count('s') and walk.count('e') == walk.count('w')