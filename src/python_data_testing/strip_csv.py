import csv

with open("product_master_file_copy_1.csv", "rU") as file:
	reader = csv.reader(file)
	for line in reader:
 		print ",".join(['"' + str.strip() + '"' for str in line])

