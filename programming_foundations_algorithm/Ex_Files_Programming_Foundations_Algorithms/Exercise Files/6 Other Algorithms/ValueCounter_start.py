# using a hashtable to count individual items


# define a set of items that we want to count
items = ["apple", "pear", "orange", "banana", "apple",
         "orange", "apple", "pear", "banana", "orange",
         "apple", "kiwi", "pear", "apple", "orange"]

# TODO: create a hashtable object to hold the items and counts
counter = dict()
countercounter = dict()

# TODO: iterate over each item and increment the count for each one
for i in items:
    if i in counter.keys():
        counter[i]+=1
    else:
        counter[i]=1

for i,j in counter.items():
    if j>2:
        print(i)
    else:
        print(j)
    #print(str(i)+' '+str(j))

# print the results
print(counter)
