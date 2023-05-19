"""
Kata Level: 6.

DESCRIPTION:

Your task is to sort a given string. Each word in the string will contain a single number.
This number is the position the word should have in the result.

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.

Examples:

"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
"4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
""  -->  ""
"""

def order(sentence):
    lista = sentence.split(" ")
    lista_resultado = []                    
    #lista_resultado = lista    no funcionaría porque al modificar lista_resultado también modificaríamos lista. Por ello creo lista_resultado de igual tamaño pero diferentes valores.
    for i in range(0, len(lista)):    
        lista_resultado.append("")
   
    for palabra in lista:
        if '1' in palabra:
            lista_resultado[0] = palabra
        elif '2' in palabra:
            lista_resultado[1] = palabra
        elif '3' in palabra:
            lista_resultado[2] = palabra
        elif '4' in palabra:
            lista_resultado[3] = palabra
        elif '5' in palabra:
            lista_resultado[4] = palabra
        elif '6' in palabra:
            lista_resultado[5] = palabra
        elif '7' in palabra:
            lista_resultado[6] = palabra
        elif '8' in palabra:
            lista_resultado[7] = palabra
        elif '9' in palabra:
           lista_resultado[8] = palabra
        
    return " ".join(lista_resultado)

# Solución de la comunidad que he entendido. Bastante más elegante que mi solución.

def order_community(sentence):
    if not sentence:
        return ""
    result = []    #the list that will eventually become our setence
        
    split_up = sentence.split() #the original sentence turned into a list
    
    for i in range(1,10):
        for item in split_up:
            if str(i) in item:
                    result.append(item)    #adds them in numerical order since it cycles through i first
    
    return " ".join(result)

print(order("is2 Thi1s T4est 3a"))
print(order("4of Fo1r pe6ople g3ood th5e the2"))