/**
 * Here are some useful Geometry formulas to demonstrate how functions can return values.
 * Also look at the Java Docs.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Geometry 
{
    /**
     * Calculates the area of a parallelogram.
     *
     * @param b  length of base of parallelogram
     * @param h  height of the parallelogram
     * @return   area of the parallelogram
     */
    public static double parallelogramArea(double length, double width) 
    {
        return length * width;
    }
    
    /**
     * Calculates the area of a triange.
     *
     * @param b  length of base of triangle
     * @param h  height of the triangle
     * @return   area of the triangle
     */
    public static double righttriangleArea(double base, double height) 
    {
        return base * height / 2.0;
    }
    
    /**
     * calculates the volume of a sphere.
     * 
     * param r radius of sphere
     */
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    /**
     * Calculates the area of a trapezoid.
     *
     * @param a  length of base a of trapezoid
     * @param b  length of base b of trapezoid
     * @param h  legnth of height of trapezoid
     * @return   area of the trapezoid
     */
    public static double trapezoidArea(double base_a, double base_b, double height) 
    {
        return ((base_a * base_b)/ 2.0) * height;
    }
    
    /**
     * Calculates the volume of a rectangular prism.
     *
     * @param w  length of width of trapezoid
     * @param l  length of length of trapezoid
     * @param h  legnth of height of trapezoid
     * @return   volume of rectangular prism
     */
    public static double rectangularprismVolume(double width, double length, double height) 
    {
        return width * length * height;
    }
    
    /**
     * Calculates the volume of a cone.
     *
     * @param r  length of radius of cone.
     * @param h  legnth of height of cone.
     * @return   volume of cone
     */
    public static double coneVolume(double radius, double height) 
    {
        return (height * Math.pow(radius, 2) * Math.PI * ( 1.0 / 3.0 ) );
    }
    
    /**
     * Calculates the surface area of a rectangular prism.
     *
     * @param w  length of width of trapezoid
     * @param l  length of length of trapezoid
     * @param h  legnth of height of trapezoid
     * @return   surface area of rectangular prism
     */
    public static double rectangularprismSurfacearea(double width, double length, double height) 
    {
        return (2.0 * ((width * length) + (height * length) + (width * height)));
    }
    
     /**
     * calculates the surface area of a sphere.
     * 
     * param r radius of sphere
     */
    public static double sphereSurfacearea(double radius) 
    {
        return 4.0  * Math.PI * Math.pow(radius, 2);
    }
    
    /**
     * Calculates the hypotenuse of a triangle when given the legnths of two legs.
     *
     * @param a  length of leg a of triangle.
     * @param b  length of leg a of triangle.
     * 
     * @return   hypotenuse of a triangle
     */
    public static double hypotenuseLength(double length_a, double length_b) 
    {
        return Math.hypot(length_a, length_b);
    }
    
    /**
     * Calculates the triangle area given three side's legnths.
     *
     * @param a  side_a.
     * @param b  side_b.
     * @param c  side_c.
     * 
     * 
     * @return   triangle area
     */
    public static double triangleArea(double side_a, double side_b, double side_c) 
    {   double s = ((side_a + side_b + side_c) / 2.0);
        return  Math.pow((s * (s - side_a) * (s - side_b) * (s - side_c)), (0.5));
    }
    
    /**
     * Calculates the slope of line between two points (x1, y1) and (x2, y2).
     *
     * @param x1  point x1.
     * @param x2  point x2.
     * @param y1  point y1.
     * @param y2  point y2.
     * 
     * @return    slope of line between two points
     */
    public static double pointSlope(double x1, double x2, double y1, double y2) 
    {   return  (y2 - y1) / (x2 - x1);
    }
    
    /**
     * Calculates the slope of line between two points (x1, y1) and (x2, y2).
     *
     * @param x1  point x1.
     * @param x2  point x2.
     * @param y1  point y1.
     * @param y2  point y2.
     * 
     * @return    slope of line between two points
     */
    public static double pointDistance(double x1, double x2, double y1, double y2) 
    {   double x_length = (x2 - x1);
        double y_length = (y2 - y1);
        return  Math.hypot(x_length, y_length);
    }
    
    public static void main(String[] args) 
    {
        double rta1 = righttriangleArea(4.2, 8.1);
        double rta2 = righttriangleArea(3.0, 123.157);
        
        System.out.println(rta1);
        System.out.println(rta2);
        
        double ra1 = parallelogramArea(5.2, 9.3);
        System.out.println(ra1);
        
        double sp1 = sphereVolume(1.0);
        System.out.println(sp1);
        
        double tp1 = trapezoidArea(2.0, 3.0, 5.0);
        System.out.println(tp1);
        
        double rp1 = rectangularprismVolume(2.0, 3.0, 5.0);
        System.out.println(rp1);
        
        double cn1 = coneVolume(2.0, 3.0);
        System.out.println(cn1);
        
        double rps1 = rectangularprismSurfacearea(2.0, 3.0, 4.0);
        System.out.println(rps1);
        
        double sps1 = sphereSurfacearea(2.0);
        System.out.println(sps1);
        
        double hp1 = hypotenuseLength(3.0, 4.0);
        System.out.println(hp1);
        
        double pd1 = pointDistance(1.0, 5.0, 1.0, 5.0);
        System.out.println(pd1);
        
        double ta1 = triangleArea(5.0, 4.0, 8.0);
        System.out.println(ta1);
        
    }
}
