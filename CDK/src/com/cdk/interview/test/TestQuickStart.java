package com.cdk.interview.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cdk.interview.BusinessRules;
import com.cdk.interview.BusinessRulesImpl;

public class TestQuickStart {
	  protected int salePrice1, salePrice2, salePrice3, salePrice4, salePrice5;
	
	   @Test
	   public void testCalculateRebate(){
		   salePrice1 = 500;
		   salePrice2 = 5000;
		   salePrice3 = 6000;
		   salePrice4 = 10000;
		   salePrice5 = 11000;
		   
		   int expectedValue = 10;
		   int expectedRetailValue = 9000;
		   
		   BusinessRules br = new BusinessRulesImpl();
		   int retailPrice = br.calculateFinalAmount(br.calculateRebate(salePrice4), salePrice4);   	
		   assertSame(expectedValue,br.calculateRebate(salePrice4));
		   assertSame(expectedRetailValue, retailPrice);
		   

	   }
}
