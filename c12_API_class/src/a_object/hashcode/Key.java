package a_object.hashcode;

public class Key {

	int number;

	public Key(int number) {
		this.number = number;
	}
	
	// hashCode
	@Override
	public int hashCode() {
		return number;
	}
	
	// equals
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key key = (Key)obj;
			if(this.number == key.number) {
				return true;
			}
		}
		return super.equals(obj);
	}
	
	
	
}
