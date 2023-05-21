"""
Kata Level: 6.

Description:
Middle Earth is about to go to war. The forces of good will have many battles with the forces of evil. 
Different races will certainly be involved. Each race has a certain worth when battling against others. 

On the side of good we have the following races, with their associated worth:
Hobbits: 1
Men: 2
Elves: 3
Dwarves: 3
Eagles: 4
Wizards: 10

On the side of evil we have:
Orcs: 1
Men: 2
Wargs: 2
Goblins: 2
Uruk Hai: 3
Trolls: 5
Wizards: 10

Although weather, location, supplies and valor play a part in any battle, if you add up the worth of the side 
of good and compare it with the worth of the side of evil, the side with the larger worth will tend to win.

Thus, given the count of each of the races on the side of good, followed by the count of each of the races on the side of evil, determine which side wins.

Input:
The function will be given two parameters. Each parameter will be a string of multiple integers separated by a single space. 
Each string will contain the count of each race on the side of good and evil.

The first parameter will contain the count of each race on the side of good in the following order:
Hobbits, Men, Elves, Dwarves, Eagles, Wizards.

The second parameter will contain the count of each race on the side of evil in the following order:
Orcs, Men, Wargs, Goblins, Uruk Hai, Trolls, Wizards.

All values are non-negative integers. The resulting sum of the worth for each side will not exceed the limit of a 32-bit integer.

Output:
Return "Battle Result: Good triumphs over Evil" if good wins, "Battle Result: Evil eradicates all trace of Good" if evil wins, 
or "Battle Result: No victor on this battle field" if it ends in a tie.
"""

# Mi solución en Python. Me gustaría que fuera más optimizado. Tengo que repasar alguna solución de la comunidad para ofrecer una alternativa más funcional que entienda.
	
def good_vs_evil(good, evil):
    list_good, list_evil = good.split(" "), evil.split(" ")
    global_good, global_evil = 0, 0
    global_good += int(list_good[0])*1	#Hobbits
    global_evil += int(list_evil[0])*1	#Orcs
    global_good += int(list_good[1])*2	#Men
    global_evil += int(list_evil[1])*2	#Men
    global_good += int(list_good[2])*3	#Elves
    global_evil += int(list_evil[2])*2	#Wargs
    global_good += int(list_good[3])*3	#Dwarves
    global_evil += int(list_evil[3])*2	#Goblins
    global_good += int(list_good[4])*4	#Eagles
    global_evil += int(list_evil[4])*3	#Uruk Hai
    global_good += int(list_good[5])*10	#Wizards
    global_evil += int(list_evil[5])*5	#Trolls
    global_evil += int(list_evil[6])*10	#Wizards
    
    if global_good > global_evil:
        return "Battle Result: Good triumphs over Evil"
    elif global_evil > global_good:
        return "Battle Result: Evil eradicates all trace of Good"
    else:
        return "Battle Result: No victor on this battle field"