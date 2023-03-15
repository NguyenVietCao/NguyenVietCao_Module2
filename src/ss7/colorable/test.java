package ss7.colorable;

import Thuc_Hanh_ss6.Shape;
import ss7.resizeable.Rectangle;

public class test {
    public static void main(String[] args) {
        ShapeColor[] shapeColors = new ShapeColor[3];
        CircleColor circleColor = new CircleColor(2);
        RectangleColor rectangleColor = new RectangleColor(2,4);
        SquareColor squareColor = new SquareColor(4);
        shapeColors[0] = circleColor;
        shapeColors[1] = rectangleColor;
        shapeColors[2] = squareColor;


        for (ShapeColor s:shapeColors) {
                System.out.println(s.getArea());
                if(s instanceof IColorable){
                    ((IColorable) s).howToColor();
                }
        }
    }

}
