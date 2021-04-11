package convex_hall;

import java.util.Stack;

public class GiftWrapping {
	public int direction(Coordinate p, Coordinate q, Coordinate r) {
		int area = (q.x - p.x) * (r.y - q.y) - (q.y - p.y) * (r.x - q.x);
		return area;
	}

	public void convexHall(Coordinate point[], int n) {

		Stack<Coordinate> stack = new Stack<Coordinate>();

		int left = 0;
		int p, q;

		// finding left most element
		for (int i = 1; i < n; i++) {
			if (point[i].x < point[left].x) {
				left = i;
			}
		}

		p = left;

		// finding convex hall
		do {
			stack.add(point[p]);
			q = (p + 1) % n;
			for (int r = 0; r < n; r++) {
				if (direction(point[p], point[q], point[r]) > 0) {
					q = r;
				}
			}
			p = q;
		} while (p != left);

		stack.add(point[p]);

		// display
		System.out.println("___ Coordinates in Convex Hall ___");
		for (Coordinate i : stack) {
			System.out.println("Coordinates [" + i.x + ", " + i.y + "]");
		}
	}
}
