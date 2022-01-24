package com.practice;

import java.util.ArrayList;

public class GroceryList {
 
	public static ArrayList<String> groceryList = new ArrayList<String>();
 
	public static ArrayList<String> getGroceryList() {
		return groceryList;
	}

	public  void addGroceryItems(String item) {
		groceryList.add(item);
	}
	
	public  void printGroceryList(){
		System.out.println("You have " + groceryList.size() + " items");
		for(int i=0; i<groceryList.size(); i++) {
		System.out.println((i+1) + "." + groceryList.get(i));	 
		}
	}
	
	private  void modifyItem(int position, String newItem) {
		groceryList.set(position, newItem);
		System.out.println("Grocery item " + (position+1) + " updated");
	}
	
	public void modifyItem(String item, String newItem) {
		int position = searchItem(item);
		if(position >= 0) {
			modifyItem(position,newItem);
		}
	}
	
	private  void removeItem(int position) {
		String theItem = groceryList.get(position);
		groceryList.remove(position);
	}
	
	public void removeItem(String item) {
		int position = searchItem(item);
		if(position >= 0) {
			removeItem(position);
		}
	}
	
	public  int searchItem(String item) {
		//boolean exists = groceryList.contains(item);
		return groceryList.indexOf(item);
	}
	
	public boolean onFile(String item) {
		int position = searchItem(item);
		if(position >=0) {
			return true;
		}
		
		return false;
	}
		

}
