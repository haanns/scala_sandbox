f = open("months.txt")
next = f.readline()
while next != "":
  print(next.strip())
  next = f.readline()
