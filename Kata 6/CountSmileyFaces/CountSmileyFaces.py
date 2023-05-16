"""
Kata Level: 6.

Given an array (arr) as an argument complete the function countSmileys that should return the total number of smiling faces.

Rules for a smiling face:
Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
Every smiling face must have a smiling mouth that should be marked with either ) or D
No additional characters are allowed except for those mentioned.

Valid smiley face examples: :) :D ;-D :~)
Invalid smiley faces: ;( :> :} :]

Example:
countSmileys([':)', ';(', ';}', ':-D']);       // should return 2;
countSmileys([';D', ':-(', ':-)', ';~)']);     // should return 3;
countSmileys([';]', ':[', ';*', ':$', ';-D']); // should return 1;

Note:
In case of an empty array return 0. You will not be tested with invalid input (input will always be an array).
Order of the face (eyes, nose, mouth) elements will always be the same.
"""

# Mi solución en Python. 
# Ocurre lo mismo que con el código de Java, donde dará válidas caras que no debería (medias caras).
# Podemos solucionarlo utilizando un array con cada una de las caras posibles en vez de hacerlo en formato string.
# smileys = [":)", ";)", ":~)", ";~)", ":-)", ";-)", ":D", ";D", ":~D", ";~D", ":-D", ";-D"]
# for i in arr:
# 	if i in smileys:
#   count += 1
	
def count_smileys(arr):
    valid_faces = ":-) :-D :~) :~D ;-) ;-D ;~) ;~D :) :D :) :D ;) ;D ;) ;D"
    count = 0
    for face in arr:
        if face in valid_faces:
            count += 1
    return count

# Solución de la comunidad sin necesidad de usar regex.

def count_smileys(arr):
    eyes = [":", ";"]
    noses = ["", "-", "~"]
    mouths = [")", "D"]
    count = 0
    for eye in eyes:
        for nose in noses:
            for mouth in mouths:
                face = eye + nose + mouth
                count += arr.count(face)
    return count