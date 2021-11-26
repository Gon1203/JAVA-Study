package ex4;

public class Cube {
	private int length;

	public Cube(int i) {
		length = i;
	}

	public int volume() {
		return length * length * length;
	}

	public int area() {
		return 6 * length * length;
	}
}
