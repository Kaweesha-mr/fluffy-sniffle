package quection3B;

import java.util.ArrayList;
import java.util.Collections;

public class AccendingList <E> {
    
	ArrayList<E> arrayList = new ArrayList<>();

    public void add(E n) {
        if (!arrayList.contains(n)) {
            arrayList.add(n);
        }
    }

    public void displayList() {
    	Collections.sort(arrayList);
    	
        for (E element : arrayList) {
            System.out.println(element + " ");
        }
    }

}
