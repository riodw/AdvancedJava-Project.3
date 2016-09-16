package orderedlist;
/**
 * Date 2015
 * @author rdw77236
 */
public class OrderedList <E extends Comparable>
{
    private Node<E> head;
    private int length;
    
    // Default Constructor
    public OrderedList()
    {
        head = null;
        length = 0;
    }
    
    // Problem - A
    /**
     * REMOVE - remove first found instance of passed obj
     * @param obj - object that is passed to be removed
     */
    public void remove(E obj)
    {
        Node<E> temp = head, prev = null;
        for(; temp != null; temp = temp.getLink())
        {
            if(obj.equals(temp.getData()))
                break;
            prev = temp;
        }
        if(prev == null)
            head = head.getLink();
        else if(temp != null)
            prev.setLink(temp.getLink());
        if(temp != null)
            length--;
    }
    
    // Problem - B
    /**
     * KLARGEST - returns a new OrderedList of copies 
     *      of the k largest elements of the list
     * If k is larger than the length of the list, return the list.
     * @param k number to start at in the list. from number up = new List
     * @return l = new OrderedList
     */
    public OrderedList kLargest(int k)
    {
        if(k >= length)
            return this;
        
        Node<E> t = head;
        for(int i = 0; i < length-k; i++)
            t = t.getLink();
        
        // The Other way, but is less efficient.
        OrderedList l = new OrderedList();
        Node<E> last = null;
        while(t != null)
        {
            if(last == null)
            {
                l.head = new Node(t.getData(), null);
                last = l.head;
            }
            else 
            {
                last.setLink(new Node(t.getData(), null));
                last = last.getLink();
            }
            t = t.getLink();
        }
        return l;
    }
    
    // Problem - C
    /**
     * GET - returns the element at position k
     * @param k the position of the element to get
     * @return what is at that element, or the last element in the list
     */
    public Node<E> get(int k)
    {
        if(k >= length)
        {
            Node<E> t = head;
            for(int i = 0; i < length; i++)
                t = t.getLink();
            
            return t;
        }
        
        Node<E> t = head;
        for(int i = 0; i <= k; i++)
            t = t.getLink();
        
        return t;
    }
    
    // Problem - D
    /**
     *INSERT -creates new node of given item, inserts it into correct position
     * @param obj - obj to be made into a Node and inserted into List
     */
    public void insert(E obj)
    {
        if(head == null || head.getData().compareTo(obj) > 0)
        {
            head = new Node(obj, head);
            length++;
            return;
        }
        Node<E> temp = head, prev = null;
        for(; temp != null; temp = temp.getLink())
        {
            if(temp.getData().compareTo(obj) > 0)
                break;
            prev = temp;
        }
        
        prev.setLink(new Node(obj, temp));
        length++;        
    }
    
    // Problem - E
    /**
     * ADD - Adds passed element to the correct spot in the List
     * @param l the ordered list to be added to the current list
     * @return n1 = the new List with both Lists
     */
    public OrderedList add(OrderedList l)
    {
        OrderedList nl = new OrderedList();
        Node<E> n1 = head, n2 = l.head, n3 = null;
        Node<E> newNode = null;
        E newData = null;
        while(n1 != null || n2 != null)
        {
            if(n1 != null && n2 != null)
            {
                if(n1.getData().compareTo(n2.getData()) < 0)
                {
                    newData = n1.getData();
                    n1 = n1.getLink();
                }
                else
                {
                    newData = n2.getData();
                    n2 = n2.getLink();
                }
            }
            else if(n1 != null)
            {
                newData = n1.getData();
                n1 = n1.getLink();
            }
            else
            {
                newData = n2.getData();
                n2 = n2.getLink();
            }
            //place new node to the end of the new list
            newNode = new Node(newData, null);
            if(n3 == null)
            {
                nl.head = newNode;
                n3 = newNode;
            }
            else
            {
                n3.setLink(newNode);
                n3 = newNode;
            }
            nl.length = length+l.length;
        }
        
        /*Node<E> n1 = head, n2 = l.head, n3 = null;
        while(n1 != null || n2 != null)
            if n1 == null, ...
            if n2 == null, ...
            if(n1 != null && n2 != null)
                ...
            set the link of n3 and advance n
        */
        /*
        for(Node<E> t = head; t != null; t = t.getLink())
            nl.insert(t.getData());
        for(Node<E> t = l.head; t != null; t = t.getLink())
            nl.insert(t.getData());
                */
        return nl;
    }
    
    // Problem - F
    /**
     * over ride the toString() method
     * @return an output string
     */
    @Override
    public String toString()
    {
        String s = "[";
        for(Node<E> t = head; t != null; t = t.getLink())
            s += t.getData() + ", ";
        s += "]";
        return s;
    }
    
    /**
     * SIZE - return the size of the list
     * @return the length of the List
     */
    public int size()
    {
        return length;
    }
}