import csv
f = open("airports.dat")
for row in csv.reader(f):
	print(row[1])
