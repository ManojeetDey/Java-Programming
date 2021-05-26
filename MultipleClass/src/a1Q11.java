import java.util.*;

class point {
	int x, y;

	void set_point() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the co-ordinates of the point");
		x = sc.nextInt();
		y = sc.nextInt();
	}

	void find_distance(point p1, point p2) {
		double dist;
		dist = Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
		System.out.println("Distance between the point is " + dist);
	}

	void find_distance(point p) {
		double dist;
		dist = Math.sqrt(Math.pow((x - p.x), 2) + Math.pow((y - p.y), 2));
		System.out.println("Distance between the point is " + dist);
	}

	void display_point() {
		System.out.println("The co-ordinates of the point is (" + x + ", " + y + ")");
	}
}

public class a1Q11 {

	public static void main(String args[]) {
		point p1 = new point();
		p1.set_point();
		point p2 = new point();
		p2.set_point();
		p1.display_point();
		p2.display_point();
		p1.find_distance(p1, p2);
		p1.find_distance(p2);
	}
}
