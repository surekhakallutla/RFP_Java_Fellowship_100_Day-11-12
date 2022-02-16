package com.bridgelabz.stockaccountmanagement;

import java.util.*;

public class StockOperations {
	
	Scanner scn = new Scanner(System.in);
	
	private ArrayList <StockPortfolio> stockList = new ArrayList <StockPortfolio> ();
	
	private StockOperations() {
		
	}
	
	private static StockOperations instance;
	
	public static StockOperations getInstance() {
		if(instance == null) {
			instance = new StockOperations();
		}
		return instance;
	}
	
	public ArrayList <StockPortfolio> getStockList() 
	{
		return stockList;
	}
	
	public void add(StockPortfolio stockPortfolio)
	{
		stockList.add(stockPortfolio);		
	}
		
	public void remove(StockPortfolio stockPortfolio)
	{
		stockList.remove(stockPortfolio);	
	}
	
	public String selectStock() {
		System.out.println("Enter the Stock Name :");
		String userSelection = scn.next();
		return userSelection;
	}
		
	public StockPortfolio getStock(String stockName) {
		for(StockPortfolio stockPortfolio : stockList) {
			if(stockName.equalsIgnoreCase(stockPortfolio.getStockName())) {
				return stockPortfolio;
			}
		}
		return null;
	}
	
	public void printStockList() {
		System.out.println(stockList);
	}
		
	public void eachStockValue() {
		double eachStockValue = 0;
		for(StockPortfolio stockPortfolio : stockList) {
			eachStockValue = stockPortfolio.getPrice();
			System.out.println("StockValue for "+ stockPortfolio.getStockName() + " is " + eachStockValue );	
		}	
	}
	
	public void totalStockValue() {
				
		double totalStockValue = 0;
		double eachStockValue = 0;
		for(StockPortfolio stockPortfolio : stockList) {
			eachStockValue= stockPortfolio.getPrice();
			totalStockValue += eachStockValue;
		}
		System.out.println("The Total StockValue is "+ totalStockValue);
	}
}
	
			
	
	
