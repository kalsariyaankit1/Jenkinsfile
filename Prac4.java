import java.io.*;
import java.util.Scanner;

class Prac5 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s1 = "Nirma University";
		String rev = new String();
		int n=s1.length();
		for(int i=n-1;i>=0;i--) {
			rev = rev + s1.charAt(i);
		}
		System.out.println(rev);
		StringBuffer s2 = new StringBuffer(s1);
		s2 = s2.reverse();
		System.out.println(s2);
		System.out.println(s1.replace("Ni","Ab"));
		int index = s1.indexOf("rma");
		if(s1.indexOf("rma") != -1){
			System.out.println("rma exist in the sting.");
		}
		else{
			System.out.println("rma does not exist.");
		}
		if(s1.indexOf("Uni") != -1){
			System.out.println("Uni exist in the sting.");
		}
		else{
			System.out.println("Uni does not exist.");
		}
		
		//System.out.println(s2.replace("Ni","Ab"));
	}
}