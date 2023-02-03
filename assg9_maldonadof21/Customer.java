package assg9_maldonadof21;


public class Customer extends KeyedItem<String> {
	
	String name, pNumber;
	
	/**
	 * 
	 * @param id
	 * @param name
	 * @param pNumber
	 */
	public Customer(String id, String name, String pNumber) {
		super(id);
		this.name = name;
		this.pNumber = pNumber;
	}
	
	/**
	 * method that returns id, name and phone number spaced by a tab
	 */
	public String toString() {
		return getKey() + "\t" + name + "\t" + pNumber;
	}
	
	/**
	 * modifies the name of the customer
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * modifies the phone number of the customer
	 * @param pNumber
	 */
	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}
	
	/**
	 * returns the value of the name variable
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * returns the value of the phone number
	 * @return
	 */
	public String getpNumber() {
		return pNumber;
	}
	
	/**
	 * 
	 * @param id
	 */
	public Customer(String id) {
		super(id);
	}
	
	/**
	 * 
	 * @param obj
	 * @return
	 */
	public int compareTo(Customer obj) {	
		return getKey().compareTo(obj.getKey());
	}
	
	/**
	 * the equals method
	 */
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(obj instanceof Customer) {
			Customer temp = (Customer)obj;
			if(getKey().equals(temp.getKey())) {
				return true;
			}
		}
		else {
			return false;
		}
		
		return false;
	}
	
	
	
}
