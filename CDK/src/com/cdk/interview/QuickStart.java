package com.cdk.interview;

public class QuickStart {

	//function to initiate the execution
	public static void main(String[] args) {		
		
		QuickStart qs = new QuickStart();
		int salePrice = 20000;
		qs.calculateRetailPrice(salePrice);
		
	}

	private double calculateRetailPrice(int salePrice) {
		
		BusinessRules br = new BusinessRulesImpl();			
		int rebate = br.calculateRebate(salePrice);
		double retailPrice = br.calculateFinalAmount(rebate, salePrice);		
		System.out.println("Retail Price = " + retailPrice + " when Sale Price = " + salePrice);
		
		return retailPrice;
	}
	

}
