package inheritance_interface;

public class Ex5 {

	public static void main(String[] args) {
		Artist kim = new Artist("뮤지션 김씨");
		Architect lee = new Architect("건축가 이씨");
		Developer park = new Developer("개발자 박씨");
		Lawyer choi = new Lawyer("변호사 최씨");

		Friend[] friends = { kim, lee, park, choi };

		for (Friend f : friends) {
			f.dearFriend();
		}
	}

}

interface Friend{
	public abstract void dearFriend();
}

class Artist implements Friend{
	private String name;
	public Artist(String name) {
		this.name = name;
	}
	@Override
	public void dearFriend() {
		System.out.println(name + " -> 칭구 아이가!");
	}
	
}
class Architect implements Friend{
	private String name;
	public Architect(String name) {
		this.name = name;
	}
	@Override
	public void dearFriend() {
		System.out.println(name + " -> 칭구 아이가!");
	}
	
}
class Developer implements Friend{
	private String name;
	public Developer(String name) {
		this.name = name;
	}
	@Override
	public void dearFriend() {
		System.out.println(name + " -> 칭구 아이가!");
	}
	
}
class Lawyer implements Friend{
	private String name;
	public Lawyer(String name) {
		this.name = name;
	}
	@Override
	public void dearFriend() {
		System.out.println(name + " -> 칭구 아이가!");
	}
	
}



