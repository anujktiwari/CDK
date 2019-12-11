package com.cdk.interview;

public class BusinessRulesImpl implements BusinessRules {

	@Override
	public int calculateRebate(int salePrice) {
		int rebate = 0;
		
		switch(1){
		case 1:
			if(salePrice > 5000 && salePrice <= 10000){
				rebate = Utils.tenPercentRebate;
				return rebate;
			} else {				
			}
			
		case 2:
			if(salePrice > 10000){
				rebate = Utils.twentyPercentRebate;
				return rebate;
			} else {		
			}
			
		default:
			return rebate;
		}
			
	}

	@Override
	public int calculateFinalAmount(int rebate, int salePrice) {
				
		int rebateAmount = (rebate * salePrice) / 100 ;
		int retailPrice = salePrice - rebateAmount;
		
		return retailPrice;
	}

	
}
