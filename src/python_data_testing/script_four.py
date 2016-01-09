import csv
f = open("airports.dat")
for row in csv.reader(f):
	if row[3] == "Australia" or row[3] == "United States":
		print(row[1])
