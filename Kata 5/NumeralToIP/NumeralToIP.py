"""
Kata Level: 5.

Take the following IPv4 address: 128.32.10.1
This address has 4 octets where each octet is a single byte (or 8 bits).

1st octet 128 has the binary representation: 10000000
2nd octet 32 has the binary representation: 00100000
3rd octet 10 has the binary representation: 00001010
4th octet 1 has the binary representation: 00000001

So 128.32.10.1 == 10000000.00100000.00001010.00000001

Because the above IP address has 32 bits, we can represent it as the unsigned 32 bit number: 2149583361

Complete the function that takes an unsigned 32 bit number and returns a string representation of its IPv4 address.

Examples:

2149583361 ==> "128.32.10.1"
32         ==> "0.0.0.32"
0          ==> "0.0.0.0"
"""

# Mi solución en Python. Mirar en las soluciones de la comunidad por si encuentro una alternativa más optimizada.

def int32_to_ip(int32):
    binario = bin(int32).replace("0b", "")
    resultado_1, resultado_2, resultado_3, resultado_4 = 0, 0, 0, 0
    
    if len(binario) < 9:
        
        for i, digit in enumerate(reversed(str(binario))):
            if digit == "1":
                resultado_1 += 2**i
        return "0.0.0.{}".format(resultado_1)
    
    elif len(binario) < 17:
        
        primer_octeto = binario[-8:]
        segundo_octeto = binario[:-8]
        for i, digit in enumerate(reversed(str(primer_octeto))):
            if digit == "1":
                resultado_1 += 2**i
        for i, digit in enumerate(reversed(str(segundo_octeto))):
            if digit == "1":
                resultado_2 += 2**i
        return "0.0.{}.{}".format(resultado_2, resultado_1)
        
    elif len(binario) < 25:
        
        primer_octeto = binario[-8:]
        segundo_octeto = binario[-16:-8]
        tercer_octeto = binario[:-16]
        for i, digit in enumerate(reversed(str(primer_octeto))):
            if digit == "1":
                resultado_1 += 2**i
        for i, digit in enumerate(reversed(str(segundo_octeto))):
            if digit == "1":
                resultado_2 += 2**i
        for i, digit in enumerate(reversed(str(tercer_octeto))):
            if digit == "1":
                resultado_3 += 2**i        
        return "0.{}.{}.{}".format(resultado_3, resultado_2, resultado_1)
        
    else:
        
        primer_octeto = binario[-8:]
        segundo_octeto = binario[-16:-8]
        tercer_octeto = binario[-24:-16]
        cuarto_octeto = binario[:-24]
        for i, digit in enumerate(reversed(str(primer_octeto))):
            if digit == "1":
                resultado_1 += 2**i
        for i, digit in enumerate(reversed(str(segundo_octeto))):
            if digit == "1":
                resultado_2 += 2**i
        for i, digit in enumerate(reversed(str(tercer_octeto))):
            if digit == "1":
                resultado_3 += 2**i 
        for i, digit in enumerate(reversed(str(cuarto_octeto))):
            if digit == "1":
                resultado_4 += 2**i 
        return "{}.{}.{}.{}".format(resultado_4, resultado_3, resultado_2, resultado_1)

# Solución de la comunidad 1. No es la más optimizada, pero ya lo es más que mi solución y sigue siendo un código entendible/legible.

# convert binary
def convert_bin(arr):
    summa = 0
    for x,y in enumerate(arr[::-1]):
        summa = summa + 2**x * int(y)
    return summa
    
    
def int32_to_ip(int32):

    n = ""

    while int32 > 0:
        y = str(int32 % 2)
        n = y + n
        int32 = int(int32 / 2)


    if len(n) != 32: # make 32 bit
        while len(n) != 32:
            n = '0' + n

    a = n[:8] # first 8
    b = n[8:16] # secound 8
    c = n[16 : 24] # third 8
    d = n[24 : 32] # fourth 8

    return(str(convert_bin(a))+'.'+str(convert_bin(b))+'.'+str(convert_bin(c))+'.'+str(convert_bin(d)))

print(int32_to_ip(2149583361))
print(int32_to_ip(32))
print(int32_to_ip(0))