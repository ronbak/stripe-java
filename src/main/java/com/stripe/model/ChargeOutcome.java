package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @EqualsAndHashCode(callSuper=false)
public class ChargeOutcome extends StripeObject {
	protected String networkStatus;
	protected String reason;
	protected String sellerMessage;
	protected String type;
}
