
public enum Prioridade {

	MIN(1), NORMAL(5), MAX(10);
	
	private int val;
	
	 Prioridade(int val) {
		this.val = val;
		
		
	}
@ricardo
	public int getVal() {
		return val;
	}
}
