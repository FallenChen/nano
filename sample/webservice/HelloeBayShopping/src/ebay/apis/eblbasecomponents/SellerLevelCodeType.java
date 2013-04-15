// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * 
 * SellerLevelCodeType - Type declaration to be used by other schema.
 * Indicates the user's eBay PowerSeller tier.
 * 
 */
public enum SellerLevelCodeType {

    /**
     * 
   * (out) Bronze
   * 
     */
    BRONZE("Bronze"),
  

    /**
     * 
   * (out) Silver
   * 
     */
    SILVER("Silver"),
  

    /**
     * 
   * (out) Gold
   * 
     */
    GOLD("Gold"),
  

    /**
     * 
   * (out) Platinum
   * 
     */
    PLATINUM("Platinum"),
  

    /**
     * 
   * (out) Titanium
   * 
     */
    TITANIUM("Titanium"),
  

    /**
     * 
   * (out) Diamond
   * 
     */
    DIAMOND("Diamond"),
  

    /**
     * 
   * (out) None
   * 
     */
    NONE("None"),
  

    /**
     * 
   * (out) Reserved for internal or future use
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    SellerLevelCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static SellerLevelCodeType fromValue(String v) {
        if (v != null) {
            for (SellerLevelCodeType c: SellerLevelCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}