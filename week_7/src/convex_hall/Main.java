package convex_hall;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
//		Coordinate point[] = new Coordinate[8];
//		point[0] = new Coordinate(0, 0);
//		point[1] = new Coordinate(0, 3);
//		point[2] = new Coordinate(2, 3);
//		point[3] = new Coordinate(2, 2);
//		point[4] = new Coordinate(2, 4);
//		point[5] = new Coordinate(4, 0);
//		point[6] = new Coordinate(4, 3);
//		point[7] = new Coordinate(4, 5);

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Number of Co-ordinates");
		int length = sc.nextInt();
		sc.close();
		
		Coordinate point[] = new Coordinate[length];
		
		for(int i=0; i<length; i++) {
			double randomx = Math.random();
			randomx = randomx * 100;
			int randomIntx = (int)randomx;
			double randomy = Math.random();
			randomy = randomy * 100;
			int randomInty = (int)randomy;
			point[i] = new Coordinate(randomIntx, randomInty);
		}
		
		int n = point.length;
		GiftWrapping gfw = new GiftWrapping();
		gfw.convexHall(point, n);
		
	}

}
