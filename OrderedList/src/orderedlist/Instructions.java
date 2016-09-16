package orderedlist;
/**
 * Date 2015
 * @author rdw77236
 */

/*
Project #3
COMPSCI 221, due: 9/16/2015
Implement a generic class that uses a linked list of generic nodes to maintain
an ordered list, i.e., the nodes are ordered in the list so that the data values
they contain are in sorted order (from smallest to largest) as you traverse the
list from its first node to its last. You need to assume that the type used to
instantiate the node and OrderedList is a type that implements the Comparable
interface.

The public interface of the OrderedList class must include:
(a) A method remove that removes the first instance of a given item from the list

(b) A method kLargest that returns a new OrderedList consisting of copies of the
    k largest elements of the list. If k is largest than the length of the list
    return the list.

(c) A method get that returns a copy of the k-th item in the list for given
    integer k. If k is larger than the length of the list minus 1, through an
    out of bound exception.

(d) A method insert that creates a new node with a given item and inserts it
    into its correct position in the list.

(e) A method addition implemented so that (list1.add(list2)) returns a new
    ordered list containing copies of the items in both list1 and list2.
    Neither list1 nor list2 is modified by this operation. The construction of
    the new list must be done as efficiently as possible, i.e., by traversing
    through the nodes of list1 and list2 exactly once and without repeatedly
    having to search for the location where items should be added to the new
    ordered list. Thus you cannot simply cycle through both lists and repeatedly
    call the new list’s insert function on the items so encountered. (hint: think
    about how you might take 2 piles of test papers that are each in sorted
    order and efficiently use them to create a new pile containing all the
    papers in sorted order, without repeatedly scanning through either of the
    original piles from the beginning.)

(f)	Override the toString method so that list is formed into the format:
a.	[item1, item2, …]
You are free to implement private methods for use by the public ones.
Your solution should adhere to basic principles of object-oriented programming.
The code should be neatly organized, easy to read and understand, with correct
indentation, vertical braces alignment, reasonable choices for identifiers,
standard documentation for each method and internal documentation to explain
non-obvious details of the logic or its implementation.

1.	Because you are going to use the compareTo method from the Comparable
    interface in your OrderedList class, you need to place the constraint/bound
to the type parameter of your class as we have talked about for generic methods:

   public class OrderedList<E extends Comparable>
*/