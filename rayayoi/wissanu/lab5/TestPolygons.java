 /**
 * Authur: Wissanu Rayayoi
 * ID : 653040460-3
 * Sec.1
 * Date : January 20, 2022
 * 
 */
package rayayoi.wissanu.lab5;

class Polygon {
    //Declare variable of class Polydgon
    PolygonType type;
    double width;
    double heigth;
    static int numPolygons = 0;
    static double sumPolygonsArea = 0;
    //Method that calculate Area
    double getArea() {
        double area = 0;
        if(type == PolygonType.RECTANGLE) {
            area = width * heigth;  
        } else {
            area = 0.5 * width * heigth;
        }
        return area;
    }
    //Calculate sum of polygon
    static void setNumPolygons(int numNewPolygons) {
        numPolygons = numPolygons + numNewPolygons;
    }
    //Calculate sum area of polygon
    static void setSumPolygonsArea(double newPolygonsArea) {
        sumPolygonsArea = sumPolygonsArea + newPolygonsArea;
    }
}
enum PolygonType {
    RECTANGLE,TRIANGLE
}
/**
 * The outpput of main method will display like below
 * The number of polygons is <numPolygons> or <numPolygons> or <numPolygons>
 * The width of polygon1 is <width of polygon 1> The width of polygon2 is <width of polygon 2>
 * The sum of polygons area is <sumPolygonsArea>
 */
public class TestPolygons {
    public static void main(String[] args) {
        //set first polygon
        Polygon polygon1 = new Polygon();
        polygon1.width = 2;
        polygon1.heigth = 3;
        polygon1.type = PolygonType.RECTANGLE;
        Polygon.setNumPolygons(1);
        Polygon.setSumPolygonsArea(polygon1.getArea());
        //set second polygon
        Polygon polygon2 = new Polygon();
        polygon2.width = 3;
        polygon2.heigth = 4;
        polygon2.type = PolygonType.TRIANGLE;
        Polygon.setNumPolygons(1);
        Polygon.setSumPolygonsArea(polygon2.getArea());
        //Display output
        System.out.println("The number of polygons is " + Polygon.numPolygons + " or " 
         + Polygon.numPolygons + " or " + Polygon.numPolygons);
        System.out.println("The width of polygon1 is " + polygon1.width + 
         " The width of polygon2 is " + polygon2.width);
        System.out.println("The sum of polygons area is " + Polygon.sumPolygonsArea);
    }    
}
