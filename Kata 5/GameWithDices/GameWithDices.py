"""
Kata Level: 5.

Greed is a dice game played with five six-sided dice. Your mission, should you choose to accept it, is to score a throw according to these rules. 
You will always be given an array with five six-sided dice values.

Three 1's => 1000 points
Three 6's =>  600 points
Three 5's =>  500 points
Three 4's =>  400 points
Three 3's =>  300 points
Three 2's =>  200 points
One   1   =>  100 points
One   5   =>   50 point

A single die can only be counted once in each roll. 
For example, a given "5" can only count as part of a triplet (contributing to the 500 points) or as a single 50 points, but not both in the same roll.

Example scoring

Throw       Score
---------   ------------------
5 1 3 4 1   250:  50 (for the 5) + 2 * 100 (for the 1s)
1 1 1 3 1   1100: 1000 (for three 1s) + 100 (for the other 1)
2 4 4 5 4   450:  400 (for three 4s) + 50 (for the 5)

In some languages, it is possible to mutate the input to the function. 
This is something that you should never do. If you mutate the input, you will not be able to pass all the tests.
"""

# Mi solución en Python. 
#  Supera los test pero me parece una solución muy poco optimizada (intentar aprender otra forma de plantear la solución a través de las soluciones de la comunidad).
def score(dice):
    contador_1s, contador_2s, contador_3s, contador_4s, contador_5s, contador_6s, resultado = 0, 0, 0, 0, 0, 0, 0
    
    for number in dice:
        if number == 1:		contador_1s += 1
        elif number == 2: 	contador_2s += 1
        elif number == 3: 	contador_3s += 1
        elif number == 4: 	contador_4s += 1
        elif number == 5: 	contador_5s += 1
        elif number == 6: 	contador_6s += 1
        
    if contador_1s == 6:	return 2000
    if contador_1s >= 3:
        resultado += 1000
        contador_1s -= 3
    if contador_1s > 0:
        for i in range(contador_1s):	resultado += 100
        
    if contador_2s == 6:	return 400
    if contador_2s >= 3:	resultado += 200
    
    if contador_3s == 6:	return 600
    if contador_3s >= 3:	resultado += 300
    
    if contador_4s == 6:	return 800
    if contador_4s >= 3:	resultado += 400
    
    if contador_5s == 6:	return 1000
    if contador_5s >= 3:
        resultado += 500
        contador_5s -= 3
    if contador_5s > 0:
        for i in range(contador_5s):	resultado += 50
        
    if contador_6s == 6:	return 1200
    if contador_6s >= 3:	resultado += 600
    
    return resultado

# Solución de la comunidad 1.
def score_community1(dice):
    total = 0
    for d in range(1, 7):
        count = dice.count(d)
        if count >= 3:
            total += 1000 if d == 1 else d * 100
            count -= 3
        total += 100 * count if d == 1 else 50 * count if d == 5 else 0
    return total

# Solución de la comunidad 2.
SCORES = [
    # triples
    ["111", 1000],
    ["666", 600],
    ["555", 500],
    ["444", 400],
    ["333", 300],
    ["222", 200],
    # singles
    ["1", 100],
    ["1", 100],
    ["5", 50],
    ["5", 50] ]


def score_community2(dice):
    dice = "".join(str(d) for d in sorted(dice))
    total = 0
    
    for key, val in SCORES:
        if key in dice:
            total += val
            dice = dice.replace(key, "", 1)
    
    return total

print(score([5, 1, 3, 4, 1]))       # 250
print(score([1, 1, 1, 3, 1]))       # 1100
print(score([2, 4, 4, 5, 4]))       # 450