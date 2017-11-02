import java.util.Arrays;

public class LotsofCopies {
public static void main(String[] args) {
	
	int num= 7;
	String strMain = "APCS";
	int[] arrMain = {1, 2, 3, 4, 5};
	changeMe(num, strMain, arrMain);
	System.out.println(num);
	System.out.println(strMain);
	System.out.println(Arrays.toString(arrMain));
	}
public static void changeMe(int x, String str, int[] arr) {
	x=101;
	str = "APCS 1st Period";
	for (int i= 0; i<arr.length; i++) {
		arr[i]++;
	}
	//a = startingValue
	//b = a
	//a = newValue
	int b = x;
	x = 202;
	System.out.println("b: " + b);
	
	String bStr = str;
	str = "hello sir";
	System.out.println("Bstr: " + bStr);
	
	int[] Barr = arr;
	for (int i= 0; i<arr.length; i++) {
		arr[i]=5;
	}
	System.out.println("Barr: " + Arrays.toString(Barr));
}
}

