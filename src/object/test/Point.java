package object.test;

public class Point {
	protected int x;
	protected int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * equals의 성능 향상을 위해 hashCode 내용이 
	 * 주소 기반에서 내부값 기반으로 바뀌게 된다.
	 * -> 값이 바뀔 경우 결과 값도 달라짐.
	 * 내용 비교하기전에 hashCode값을 비교함.
	 * 값이 같으면 그 다음 한글자씩 내용 비교를 하게됨.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
}
