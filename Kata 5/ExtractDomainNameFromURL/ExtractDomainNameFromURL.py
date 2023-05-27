"""
Kata Level: 5.

Write a function that when given a URL as a string, parses out just the domain name and returns it as a string. For example:

url = "http://github.com/carbonfive/raygun" -> domain name = "github"
url = "http://www.zombie-bites.com"         -> domain name = "zombie-bites"
url = "https://www.cnet.com"                -> domain name = cnet"
"""

# Mi solución en Python.
def domain_name(url):
    url = url.replace("https://", "").replace("http://", "").replace("www.", "").replace(".", " ")
    list = url.split(" ")
    return list[0]

# Solución propia usando Regex.
import re

def domain_name(url):
    return re.findall("^(?:https?:\/\/)?(?:www.)?([\w-]+).*", url)[0]

"""
Explicación:
    ^ 						Establece que comienza el string.
    (?:https?:\/\/)?		?: indica que es una agrupación que no queremos extraer (paréntesis normales). El resto de ? indican que puede aparecer 1 o 0 veces (por un lado la s y por otro lado el bloque en general). 
                            Verifica que aparezca http:// https:// o nada.
    (?:www.)?				Igual que el anterior. Verifica si aparece www. Puede aparecer 1 vez o ninguna.
    ([\w-]+)				Nombre del dominio que queremos extraer, compuesto por palabras ([\w] equivale a [azA-Z0-9]) y se pueden repetir de 1 a más veces.
    .*						Cualquier símbolo exceptuando el salto de línea que se podrá repetir entre 0 y muchas veces.

    El método findall devolverá un array con todas las coincidencias de cada string, y por ello le pedimos que nos devuelva la primera de ellas.
"""
	
# Solución de la comunida 1.
def domain_name(url):
    url = url.replace('www.','')
    url = url.replace('https://','')
    url = url.replace('http://','')
    
    return url[0:url.find('.')]

# Solución de la comunidad 2.
def domain_name(url):
    return url.split("//")[-1].split("www.")[-1].split(".")[0]