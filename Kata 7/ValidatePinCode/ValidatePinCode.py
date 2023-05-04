"""
Kata Level: 7.

ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
If the function is passed a valid PIN string, return true, else return false.

Examples (Input --> Output)

"1234"   -->  true
"12345"  -->  false
"a234"   -->  false
"""

# Solución propia en Python.
	
def validate_pin(pin):
    valid_characters = "0123456789"
    if len(pin) == 4 or len(pin) == 6:
        for character in str(pin):
            if character not in valid_characters:
                return False
        return True
    return False

# Solución de la comunidad.

def validate_pin(pin):
    return len(pin) in [4, 6] and pin.isdigit()

print(validate_pin("1234"))
print(validate_pin("12345"))
print(validate_pin("a234"))