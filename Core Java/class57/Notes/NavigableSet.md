
   It was intorduced in JAVA 6 version, it is a child interface to SortedSet interface, It is following all the properties of SortedSet and it has define methods to provide navigations over the elements.

   Method:

   - public Object celling(Objec o);
   It will return lowest element among all the elements which are greate than or equals to the specified element.

   - public Object higher(Object obj);
   It will return lowest element among all the elements which are greater than the specified element.

    - public Object floor(Object obj)
    It will return highest element among all the elements which are less than or equals to the specified element.

- public Object lower(Object o);
It will return highest element among all the elements which are less than the specified element.

- public Object pollFirst()
It will remove and return first element from NavigableSet. 
- public Object pollLast()
It will remove and return last element from NavigableSet. 
- public NavigableSet descendingSet()
It will return all elements in the form of NavigableSet in descending order..

EX: 
import java.util.*;





