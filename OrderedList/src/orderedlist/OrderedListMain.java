package orderedlist;
/**
 * Date 2015
 * @author rdw77236
 */
public class OrderedListMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Rio Weber - Advanced Java - Project 3\n"
                + "> OrderedList <\n");
        
        // Make the new OrderedList
        System.out.println(
                "Creating new OrderedList 'olist' of type 'Double'");
        OrderedList<Double> olist = new OrderedList<>();
        System.out.println(
                "Size of list before adding elements: "+olist.size());
        
        // D - Problem = INSERT
        // Insert 7 elements into the OrderedList
        System.out.println("\nInserting 7 elements into the OrderedList");
        olist.insert(3.5);
        olist.insert(4.5);
        olist.insert(0.5);
        olist.insert(1.5);
        olist.insert(5.5);
        olist.insert(100.0);
        olist.insert(90.2);
        
        // F - Problem = TOSTRING
        // Print out the entire list [, , ]
        System.out.println("Size of list: " + olist.size());
        System.out.println("All the elements in the list:");
        System.out.println(olist + "\n");
        
        // A - Problem = REMOVE
        System.out.println("Removing element '3.5' from List");
        olist.remove(3.5);
        System.out.println("Size of list is now: " + olist.size());
        System.out.println( olist );
        // A - Problem = REMOVE
        System.out.println("\nRemoving element '0.5' from List");
        olist.remove(0.5);
        System.out.println("Size of list: " + olist.size());
        System.out.println( olist );
        // A - Problem = REMOVE
        System.out.println("\nRemoving element '100.0' from List");
        olist.remove(100.0);
        System.out.println("Size of list: " + olist.size());
        System.out.println( olist );
        // A - Problem = REMOVE - test
        System.out.println("\nTryig to remove element '1000.0' from List");
        olist.remove(1000.0);
        System.out.println("Size of list: " + olist.size());
        System.out.println( olist );
        
        // C - Problem = GET
        System.out.println("\nGet the '1' element in the List:");
        olist.get(0);
        
        // B - Problem = KLARGEST
        System.out.println("\nThe largest 5 numbers in the list: " 
                + olist.kLargest(5));
        System.out.println("The largest 2 numbers in the list: " 
                + olist.kLargest(2));
        
        // E - Problem = ADDITION
        System.out.println("\nList + List: " + olist.add(olist));
        OrderedList<Double> olist2 = new OrderedList();
        System.out.println("List2 + List: " + olist2.add(olist));
        System.out.println("List + List2: " + olist.add(olist2));
    }   
}