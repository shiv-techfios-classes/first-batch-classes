package builder;

/**
 * Domain model of the fast food restaurant business application
 * @author shivj
 *
 */

public interface Item {
	
	public String name();
	
	public Packing packing();
	
	public float price();

}
