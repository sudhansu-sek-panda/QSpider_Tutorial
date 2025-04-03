### Date - 25-03-2025

### Methods of MAP
1. Object put(Object key, Object value); //add
2. void putAll(Map m);
3. Object get(Object key);
4. Object remove(Object key);
5. boolean containsKey(Object key);
6. boolean containsValue(Object value);
7. boolean isEmpty();
8. int size();
9. void clear();

### HashMap
1. The underlying data structure is Hashtable.
2. Duplicate keys are not allowed but values can be duplicated.
3. Insertion order is not preserved but it is based on hashcode of the keys.
4. Heteregeneous objects can be inserted for bith key and value.
5. Null insertion is allowed for both key and value, where where for key is only one time and for value it will be more than one time.
6. It is best suitable for search operation.

### Constructors :
1. HashMap h = new HashMap();
It will create an empty HashMap object with default initial capacity of 16 and a fill ratio of 0.75.
2. HashMap h = new HashMap(int initialCapacity);
Here we can create an empty HashMap object with our desired capacity and here also the fill ratio will be 0.75.
3. HashMap h = new HashMap(int initialCapacity, float fill ratio);
4. HashMap h = new HashMap(Map p);
