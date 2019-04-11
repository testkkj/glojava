package extra.chap11_02_clone;

public class DeepClone implements Cloneable {
	int i;
	int[] arr;
	
	public DeepClone(int i, int[] arr) {
		this.i = i;
		this.arr = arr;
	}

	public DeepClone copy() throws CloneNotSupportedException {
		DeepClone cloned = (DeepClone) clone();
		int[] copyArr = arr.clone();
		cloned.arr = copyArr;
		return cloned;
	}

}
