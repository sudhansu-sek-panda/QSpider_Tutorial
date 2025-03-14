To overcome the drawbacks of arrys collection came into picture.
collection - stores only objects and 

util - collection

### Collection Interface
If we want to represent a group of individual objects as a single entity then we should go for collection.
A this is a collection it has methods

### Methods of Collection Interface
1 - **boolean add(Object o);**
--> to add object or element in Collection
--> It returns true if object is added successfully otherwise returns false.
<pre>
ArrayList l = new ArrayList();
System.out.println(l); // [] Empty String
l.add(111);
l.add(222);
l.add(333);
System.out.println(l); // [111,222,333]
</pre>
2 - **boolean addAll(Object o);**

--> It adds a group of elements at a time.

3 - boolean remove the specified object

4. It removes all the elements present inside c.
 l1.remove(l1);
 l1.removeAll(l1);

 5. boolean retainAll(Collection c);
 --> It removes all the element except the object passed in retain.

 6. void clear();
 --> It removes all the element.

 7. boolean contains(Object o);
 --> It checks whether an object is present or not.

8. int size()

9. Object[] toArray();
10. Iterator 

12. 

5 - Different ArrayList in a single ArrayList
Change element in 5 arraylist is affecting the single array list
the size is increasing

ArrayList -   