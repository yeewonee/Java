package ch11.exam02;

public class Member {
	private String id;
	private String name;
	public Member(String id, String name) {
		super(); //생략가능, 놔두도 괜찮고!
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { //위에서 들어오는 객체가 Member의 객체인지
			Member m = (Member) obj;
			if(id.equals(m.id) && name.equals(m.name)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return id + ": " + name;
	}
}
