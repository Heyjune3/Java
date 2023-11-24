package a_object.equals;

public class Member {
	
	String id;
	
	
	public Member(String id) {
		super();
		this.id = id;
	}

	// alt + s + v ==> equals check
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {
			Member member3 = (Member)obj;
			if(this.id != null && this.id.equals(member3.id)) {
				return true;
			}
		}
		return false;
	}

	
	// CodeTree
	@Override
	public String toString() {
		return "Member [id=" + id + "]";
	}
}
