/** Draws ths Sierpinski Triangle fractal. */
public class Sierpinski {
	
	public static void main(String[] args) {
		sierpinski(Integer.parseInt(args[0]));
	}
	
	// Draws a Sierpinski triangle of depth n on the standard canvass.
	public static void sierpinski (int n) {
                StdDraw.setXscale(0, 1);
                StdDraw.setYscale(0, 1);
                StdDraw.setPenColor(StdDraw.BLACK);

                double x1 = 0.0;
                double y1 = 0.0;

                double x2 = 1.0;
                double y2 = 0.0;

                double x3 = 0.5;
                double y3 = 0.866;

                StdDraw.line(x1, y1, x2, y2);
                StdDraw.line(x1, y1, x3, y3);
                StdDraw.line(x2, y2, x3, y3);

		sierpinski(n, x1, x2, x3, y1, y2, y3);
	}
	
	// Does the actual drawing, recursively.
	private static void sierpinski(int n, double x1, double x2, double x3,
		                                 double y1, double y2, double y3) {
		if (n == 1) return;

                double x12 = (x1 + x2) / 2;
                double y12 = (y1 + y2) / 2;

                double x13 = (x1 + x3) / 2;
                double y13 = (y1 + y3) / 2;

                double x23 = (x2 +x3) / 2;
                double y23 = (y2 +y3) / 2;

                StdDraw.setPenColor(StdDraw.RED);
                StdDraw.line(x13, y13, x23, y23);
                //StdDraw.pause(2000);
                StdDraw.line(x13, y13, x12, y12);
                //StdDraw.pause(2000);
                StdDraw.line(x12, y12, x23, y23);
                //StdDraw.pause(2000);

                sierpinski(n - 1, x1, x12, x13, y1, y12, y13);
                sierpinski(n - 1, x12, x2, x23, y12, y2, y23);
                sierpinski(n - 1, x23, x3, x13, y23, y3, y13);


	}
}