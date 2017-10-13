import math
import numpy as np

key=raw_input("Enter the key, the length of key should be a complete square (1,4,9,16 etc): ")
key=key.upper()
print key
matrix = [ [ 0 for x in xrange(int(math.sqrt(len(key))))] for y in xrange(int(math.sqrt(len(key))))]
position = 0
for char in key:
	x = position/int(math.sqrt(len(key)))
	y = position%int(math.sqrt(len(key)))
	a = ord(char)-65
	matrix[x][y]=a
	position+=1

message = raw_input("Enter the original message : ").upper()
temp=""
for char in message:
	if 65<=ord(char)<=90:
		temp+=char
message=temp
strings =[]
i=0
while i<len(message):
	temp=[]
	temp.append((ord(message[i])-65) %26)
	if i+1 <len(message):
		temp.append((ord(message[i+1]) -65) %26)
	if i+2 <len(message):
		temp.append((ord(message[i+2])-65) %26)

	while len(temp)!=int(math.sqrt(len(key))):
		temp.append(23) #added X if can't complete the required length

	i+=int(math.sqrt(len(key)))
	strings.append(temp)

print "Encyrypted string is : "
for item in strings:
	abc = np.matmul(matrix,item)
	string=""
	for i in range(len(abc)):
		abc[i]=abc[i]%26
		string+= chr(abc[i] +65)
	print string,

inverse = np.linalg.inv(matrix);
det = np.linalg.det(matrix)
adj = det * inverse

print adj