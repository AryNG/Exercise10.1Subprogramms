package com.subprogramas.app;
import java.util.Scanner;
public class Subprogramas {
	public static void main(String[] args) {
//Variables------------------------------------------------------------------------------------
		int n1=0;
		int n2=0;
		int r=0;
//Imports and Methods--------------------------------------------------------------------------
		Scanner input= new Scanner(System.in);
		System.out.println(ShowMessage("Cyan"));
		ShowInputMessage();
		n1=input.nextInt();
		ShowInputMessage();
		n2=input.nextInt();
//Process---------------------------------------------------------------------------------------
		r=SumNumbers(n1,n2);
		System.out.println("Answer: "+r);
		
		input.close();
	}
//Method to ask numbers-------------------------------------------------------------------------
	public static void ShowInputMessage() {
		System.out.println("Variables, please; ");
	}
//Method to show a tuned message---------------------------------------------------------------
	public static String ShowMessage(String message) {
		return "Hi, " + message;
	}
//Method to add numbers------------------------------------------------------------------------
	public static int SumNumbers(int n1, int n2) {
		return n1+n2;
	}
}
