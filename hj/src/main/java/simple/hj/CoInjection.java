/**
 * 
 */
package simple.hj;

/**
 * @author ADMIN
 *
 */
public class CoInjection {
	private int da;
	public int getDa() {
		return da;
	}
	public void setDa(int da) {
		this.da = da;
	}
	public int getTa() {
		return ta;
	}
	public void setTa(int ta) {
		this.ta = ta;
	}
	public LetTest getLet() {
		return let;
	}
	public void setLet(LetTest let) {
		this.let = let;
	}
	private int ta;
     private LetTest let;
	public CoInjection(LetTest let){
		this.let =let;		
	}
	
	
	
	
	
	
	
	
}
