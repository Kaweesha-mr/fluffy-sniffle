package qs2B;

import quection3B.AccendingList;

public class GenaricDemo {

	public static void main(String[] args) {

		AscendingTable <Integer,String> mytable = new AscendingTable<>();
		mytable.add(40, "DD");
		mytable.add(50, "DdD");
		mytable.add(70, "DeD");
		mytable.add(80, "DasD");
		mytable.add(30, "DDfds");
		
		
		AscendingTable<Integer, Double> myTable2 = new AscendingTable<>();
		myTable2.add(40, 12.36);
		myTable2.add(30, 12.34);
		myTable2.add(50, 12.31);
		
		

		
		
		mytable.display();
		myTable2.display();
		
		
		
		

	}

}
