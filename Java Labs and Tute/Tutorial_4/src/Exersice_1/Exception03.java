package Exersice_1;

import java.util.InputMismatchException;

class Exception03 {
static int divide(String s1[]) { int x,y;
x = Integer.parseInt(s1[0]);
y = Integer.parseInt(s1[1]); 
return x/y;
}
public static void main (String args[ ]) {
	
String a[] = {"10", "-2"};
try {
	
	System.out.println(a[0]+"/"+a[1]+" = "+divide(a));
	
} catch (ArithmeticException e) {
	System.out.println("Divided by Zero");
}

catch (ArrayIndexOutOfBoundsException e) {
	System.out.println("Array index is out of the scope");
}
catch (InputMismatchException e) {
	System.out.println("Entered value is not valid");
}
}
}

