package com.gl.main;

import java.util.Scanner;

  public class Main {
	NotesCounter notesCounter = new NotesCounter();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of the currency denominations");
		Scanner sc=new Scanner(System.in);
		int size= sc.nextInt();
        int [] currency = new int[size];
		
		System.out.println("Enter the currency denominations value");
		for(int i=0;i<size;i++)
		{
			currency[i] = sc.nextInt();
		}
		
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		MergeSort sort = new MergeSort();
		sort.sort(currency, 0, currency.length-1);
		NotesCounter.notesCounterImplementation(currency, amount);
		sc.close();
		}
	}

