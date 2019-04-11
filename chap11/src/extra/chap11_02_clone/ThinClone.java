package extra.chap11_02_clone;

public class ThinClone implements Cloneable {
	int i;
	int[] arr;
	
	public ThinClone(int i, int[] arr) {
		this.i = i;
		this.arr = arr;
	}
	
	public ThinClone copy() throws CloneNotSupportedException {
		return (ThinClone) clone();
	}

}
