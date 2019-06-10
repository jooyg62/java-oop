package object.test;

import java.util.HashSet;
import java.util.Set;

public class ObjectTest03 {

	public static void main(String[] args) {
		Set<Point> set = new HashSet<Point>();
		
		Point p1 = new Point(10, 20);
		set.add(p1);
		
		Point p2 = new Point(100, 100);
		set.add(p2);
		
		Point p3 = new Point(10, 20);
		set.add(p3);
		
		// HashCode 메소드를 오버라이드 했기 때문에 같은건 중복 출력 x
		for(Point p : set) {
			System.out.println(p);
		}
	}
}
