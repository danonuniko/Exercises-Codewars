"""
Kata Level: 7.

Find the total sum of internal angles (in degrees) in an n-sided simple polygon. N will be greater than 2.
"""

def angle(n):
    return 180*(n-2)

print(angle(3))     # 180
print(angle(4))     # 360