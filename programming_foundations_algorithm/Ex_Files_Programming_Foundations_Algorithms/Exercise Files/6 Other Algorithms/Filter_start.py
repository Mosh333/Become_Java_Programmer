# use a hashtable to filter out duplicate items


# define a set of items that we want to reduce duplicates
items = ["apple", "pear", "orange", "banana", "apple",
         "orange", "apple", "pear", "banana", "orange",
         "apple", "kiwi", "pear", "apple", "orange"]

dicts = {"a":1,"b":2,"c":3,"d":4,"e":5,"f":6,"f":7,"g":8,"d":9}
# create a hashtable to perform a filter
filter = dict()

# loop over each item and add to the hashtable
for item in items:
    filter[item] = 0

# create a set from the resulting keys in the hashtable
result = set(filter.keys())
temp = set(dicts)

for i in temp:
    print(str(i)+' '+str(dicts[i]))

print(dicts['d'])
print(dicts.keys())
print(dicts.values())
print(result)
