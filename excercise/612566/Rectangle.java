/**
 * This program Rectangle will calculate width and height 
 * to double values of the current width and height  
 * 
 * auther : Wissanu Rayayoi
 * student-id : 653040460-3
 */
class Rectangle {
  double width;
  double height;
  void doubleWidthHeight() {
    width = width * 2;
    height = height * 2;
  }
  public static void main(String[] args) {
    Rectangle angle = new Rectangle();
    angle.width = 5;
    angle.height = 8;
    System.out.println("Rectangle width = " + angle.width + " high = " + angle.height );
    angle.doubleWidthHeight();
    System.out.println("After calling method doubleWidthHeight()" );
    System.out.println("Rectangle width = " + angle.width + " high = " + angle.height );
  }
}