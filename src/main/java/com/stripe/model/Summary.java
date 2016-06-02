package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @EqualsAndHashCode(callSuper=false)
public class Summary extends StripeObject {
	Integer adjustmentCount;
	Integer adjustmentGross;
	Integer chargeCount;
	Integer chargeFees;
	Integer chargeGross;
	Integer net;
	Integer refundCount;
	Integer refundFees;
	Integer refundGross;
	Integer validationCount;
	Integer validationFees;
}
