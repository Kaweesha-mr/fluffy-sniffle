package quection3B;

import java.util.ArrayList;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class AccendingList <E> {
    
	
	//sorted set is used to because it can remove duplicated and sort the list 
	//<E> is used because can decleare anytype of list in user side and pass to this
	SortedSet<E> arrayList = new TreeSet<>();

	
	//this is used to add values to sorted set which are passed from add method in user side
    public void add(E n) {
        
            arrayList.add(n);
        
    }

    
    //this is used to print elements inside the arraylist
    public void displayList() {
    	
    	
        for (E element : arrayList) {
            System.out.println(element + " ");
        }
    }

}
