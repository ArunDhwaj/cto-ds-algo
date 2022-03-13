# cto-ds-algo
POC for Data Structure and Algorithms 

# Fact-1:
## Definition and brief:
#### A Trie is an advanced data structure that is sometimes also known as prefix tree or digital tree. It is a tree that stores the data in an ordered and efficient way. We generally use trie's to store strings. Each node of a trie can have as many as 26 references (pointers).

# Fact-2:
## Each node of a trie consists of two things:
### 1. A character
### 2. A boolean value is used to implement whether this character represents the end of the word.

# Fact-3:
### Nodes in a trie do not store entire keys, instead, they store a part of the key(usually a character of the string). When we traverse down from the root node to the leaf node, we can build the key from these small parts of the key.

# Fact-4: 
### Tries are not balanced in nature, unlike AVL trees.

# Fact-5:
## Why use Trie Data Structure?
### When we talk about the fastest ways to retrieve values from a data structure, hash tables generally comes to our mind. 
### Though very efficient in nature but still very less talked about as when compared to hash tables, trie's are much more efficient than hash tables and also they possess several advantages over the same. 

### Mainly:
### 1. There won't be any collisions hence making the worst performance better than a hash table that is not implemented properly.

### 2. No need for hash functions.

### 3. Lookup time for a string in trie is O(k) where k = length of the word.

### 4. It can take even less than O(k) time when the word is not there in a trie.

### 5. The time complexity of creating a trie is O(m*n) where m = number of words in a trie and n = average length of each word.

### 6. Inserting a node in a trie has a time complexity of O(n) where n = length of the word we are trying to insert.

### 7. Inserting a node in a trie has a space complexity of O(n) where n = length of the word we are trying to insert.

### 8. Space complexity for searching a key(word) in a trie is O(1).

### 9. Searching for a prefix of a key(word) also has a time complexity of O(n) and space complexity of O(1).