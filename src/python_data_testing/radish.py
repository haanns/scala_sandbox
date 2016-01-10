from pprint import pprint

file = open('radishsurvey.txt')
count = 0
for line in file:
  line = line.strip().split(' - ')
  name, item = line
  print name + ' voted for ' + item
  if item == "White Icicle":
    print name
    count = count + 1
x, y, z, k = [1, 2, 3, 20]
print x
print y
print z
print k
print count

def count_radish(radish_name):
  file = open('radishsurvey.txt')
  count = 0
  for line in file:
    line = line.strip().split(' - ')
    name, item = line
    if item == radish_name:
      count = count + 1
  return count

print count_radish("White Icicle")
print count_radish("Daikon")
print count_radish("Sicily Giant radishes")

def count_radish_total():
  file = open('radishsurvey.txt')
  count = 0
  empty_dict = {}
  for line in file:
    line = line.strip().split(' - ')
    name, item = line
    item_strip = item.strip().lower().replace("  "," ")
    if item_strip not in empty_dict:
      empty_dict[item_strip] = 1
    else:        
      empty_dict[item_strip] = empty_dict[item_strip]+1
  return empty_dict

print count_radish_total()
pprint(count_radish_total())

def warning():
  file = open('radishsurvey.txt')
  count = 0
  empty_list = []
  for line in file:
    line = line.strip().split(" - ")
    name, item = line
    name_strip = name.strip().lower().replace("  "," ")
    if name_strip not in empty_list:
      empty_list.append(name_strip)
    else:
      print("warning!")

warning()
