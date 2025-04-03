
### PriorityQueue

- It is the implemented class of Queue.
- If we want to represent a group of individual object in prior to processing according to priority then we will go for PriorityQueue.
- Heterogeneous elements are not allowed.
- Insertion order is not preserved but it will insert according to default natural sorting order.
- Null insertion is not possible.
- Duplicate elements are allowed.


### Constructor

1. PriorityQueue p = new PriorityQueue();
 Whenever we will be creating an object of Priority queue by using this constructor then it will create an empty PriorityQueue object with default initial capacity 11 and default natural sorting order.
2.  PriorityQueue p = new PriorityQueue(int InitialCapacity, Comparator c);
3. PriorityQueue p = new PriorityQueue(int InitialCapacity);
4. PriorityQueue p = new PriorityQueue(Collection c);