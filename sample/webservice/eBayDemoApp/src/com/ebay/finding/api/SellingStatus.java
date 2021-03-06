// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.finding.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import com.leansoft.nano.custom.types.Duration;
import java.util.List;

/**
 * 
 * Selling details pertaining to the respective item.
 * 
 */
public class SellingStatus implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	@Order(value=0)
	public Amount currentPrice;	
	
	@Element
	@Order(value=1)
	public Amount convertedCurrentPrice;	
	
	@Element
	@Order(value=2)
	public Integer bidCount;	
	
	@Element
	@Order(value=3)
	public String sellingState;	
	
	@Element
	@Order(value=4)
	public Duration timeLeft;	
	
	@Element
	@Order(value=5)
	public String delimiter;	
	
	@AnyElement
	@Order(value=6)
	public List<Object> any;	
	
    
}