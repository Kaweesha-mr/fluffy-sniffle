package quection3B;

public class GenraticTest {

	public static void main(String[] args) {
		
		
		
		//creating objects from accendinglist classs
		AccendingList<Integer> list = new AccendingList();
		list.add(80);
		list.add(46);
		list.add(10);
		list.add(80);
		list.add(46);
		list.add(10);
		list.add(80);
		list.add(46);
		list.add(10);
		
		//creating objects from accending list class
		AccendingList<String> list2 = new AccendingList();
		list2.add("aaaa");
		list2.add("bbbb");
		list2.add("dddd");
		list2.add("bbbb");
		list2.add("dddd");
		list2.add("cccc");
		
		
		list.displayList();
		list2.displayList();

	}

}
