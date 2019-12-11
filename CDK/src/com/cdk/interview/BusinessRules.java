package com.cdk.interview;

import com.sun.istack.internal.NotNull;

public interface BusinessRules {
	
	public int calculateRebate(@NotNull int salePrice);
	
	public int calculateFinalAmount(@NotNull int rebate, @NotNull int salePrice);
}
