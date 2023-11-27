package generic04_extends;

public class Parent<T, M> {
	private T Kind;
	private M model;
	
	public T getKind() {
		return Kind;
	}
	public void setKind(T kind) {
		Kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	@Override
	public String toString() {
		return "Parent [Kind=" + Kind + ", model=" + model + "]";
	}

}
