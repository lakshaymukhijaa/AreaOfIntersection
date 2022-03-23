/**
 * This Class provides code to return Area of Intersection of two rectangles
 * and returns 0 if the rectangles are not intersecting
 */
public class AreaofIntersection {
     static class Point {
        int x, y;
        public Point(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
    }

    /**
     * This Function Returns Area of two Intersecting rectangles
     * @param l1- Length of First Rectangle
     * @param r1- Breadth of First Rectangle
     * @param l2- Length of Second Rectangle
     * @param r2:Breadth of Second Rectangle
     * @return
     */
    static int intersectingArea(Point l1, Point r1, Point l2, Point r2)
    {
        // Area of 1st Rectangle
        int area1 = Math.abs(l1.x - r1.x)* Math.abs(l1.y - r1.y);

        // Area of 2nd Rectangle
        int area2 = Math.abs(l2.x - r2.x)* Math.abs(l2.y - r2.y);

        // Length of intersecting part i.e start from max(l1.x, l2.x) of
        // x-coordinate and end at min(r1.x,r2.x) x-coordinate by subtracting
        // start from end we get required lengths

        int x_dist = (Math.min(r1.x, r2.x) - Math.max(l1.x, l2.x));
        int y_dist = (Math.min(r1.y, r2.y) - Math.max(l1.y, l2.y));

        int areaI = 0;
        if( x_dist > 0 && y_dist > 0 )
        {
            areaI = x_dist * y_dist;
        }
        return (areaI);
    }

    /**
     *Main Block To run above Code
     * @param args
     */
    public static void main(String[] args)
    {
        int px=1,py=4;
        int width1=3;
        int height1=3;
        Point l1 = new Point(px, py);
        Point r1 = new Point(px+width1, py+height1);

        int px2=0;
        int py2=5;
        int height2=3;
        int width2=4;
        Point l2 = new Point(px2, py2);
        Point r2 = new Point(px2+width2, py2+height2);
        // Function Calling
        System.out.println(intersectingArea(l1, r1, l2, r2));
    }
}