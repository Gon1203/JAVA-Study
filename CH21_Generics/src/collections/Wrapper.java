package collections;

// 제네릭 타입 클래스 Wrapper
// 타입을 런타임에 지정
public class Wrapper<E> {
	private E object;

	public E getObject() {
		return object;
	}

	public void setObject(E object) {
		this.object = object;
	}
	
}
