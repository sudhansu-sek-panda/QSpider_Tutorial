### Queue

> - Queue is the child interface of Collection Interface.
> - Usually queue follows **First in First Out (FIFO)** order then will go for queue interface.

### Queue Interface Methods
1. boolean offer(Object o);
To add object in queue.
2. Object poll();
This element will **remove** the head element on the Queue and if the Queue is empty then it will return null.

3. Object remove(); 
This element will **remove** the head element on the Queue and if the Queue is empty then it will return an exception saying **NoSuchElementException**.(UNchecked Exception)

4. Object peek();
This method will return the head element **without removing** and if the Queue is empty then it will return null.

5. Object element();
This method will return the head element in the queue a **without removing** and if the Queue is empty then it will return **NoSuchElementException**.
<!-- halt  networking, 
ArrayList 

Zeera - Development tool -->

### PriorityQueue

- It is the implemented class of Queue.
- If we want to represent a group of individual object in prior to processing according to priority then we will go for PriorityQueue.
- Heterogeneous elements are not allowed.
- Insertion order is not preserved but it will insert according to default natural sorting order.
- Null insertion is not possible.
- Duplicate elements are allowed