package tetris;

import java.awt.*;

public class TetrisShapes {

    private Point[][][] pointArray;

    public TetrisShapes() {
        createShapes();
    }

    public Point[][][] getShapes() {
        return pointArray;
    }

    private void createShapes() {
        pointArray = new Point[][][]{//[x][y][r]
                {
                        //J-SHAPE
                        {new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(2, 0)},
                        {new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(2, 2)},
                        {new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(0, 2)},
                        {new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(0, 0)},
                },
                {
                        // 4 box LINE
                        {new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(3, 1)},
                        {new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(1, 3)},
                        {new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(3, 1)},
                        {new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(1, 3)},
                },
                {
                        // 3 box LINE
                        {new Point(0, 1), new Point(1, 1), new Point(2, 1)},
                        {new Point(1, 0), new Point(1, 1), new Point(1, 2)},
                        {new Point(0, 1), new Point(1, 1), new Point(2, 1)},
                        {new Point(1, 0), new Point(1, 1), new Point(1, 2)},
                },
                {
                        //DOT
                        {new Point(0, 0)},
                        {new Point(0, 0)},
                        {new Point(0, 0)},
                        {new Point(0, 0)},
                },
                {
                        //SQUARE
                        {new Point(0, 0), new Point(0, 1), new Point(1, 0), new Point(1, 1)},
                        {new Point(0, 0), new Point(0, 1), new Point(1, 0), new Point(1, 1)},
                        {new Point(0, 0), new Point(0, 1), new Point(1, 0), new Point(1, 1)},
                        {new Point(0, 0), new Point(0, 1), new Point(1, 0), new Point(1, 1)},
                },
                {
                        //BOOMERANG
                        {new Point(0, 1), new Point(1, 1), new Point(1, 0)},
                        {new Point(1, 0), new Point(1, 1), new Point(0, 0)},
                        {new Point(0, 1), new Point(0, 0), new Point(1, 0)},
                        {new Point(0, 0), new Point(0, 1), new Point(1, 1)},
                },
                {
                        //T-SHAPE
                        {new Point(0, 1), new Point(1, 1), new Point(1, 0), new Point(2, 1)},
                        {new Point(1, 0), new Point(1, 1), new Point(0, 1), new Point(1, 2)},
                        {new Point(0, 0), new Point(1, 1), new Point(1, 0), new Point(2, 0)},
                        {new Point(0, 0), new Point(0, 1), new Point(1, 1), new Point(0, 2)},
                },
                {
                        //S-SHAPE
                        {new Point(0, 0), new Point(1, 0), new Point(1, 1), new Point(2, 1)},
                        {new Point(0, 2), new Point(0, 1), new Point(1, 1), new Point(1, 0)},
                        {new Point(0, 0), new Point(1, 0), new Point(1, 1), new Point(2, 1)},
                        {new Point(0, 2), new Point(0, 1), new Point(1, 1), new Point(1, 0)},
                },
                {
                        //Z-SHAPE
                        {new Point(0, 1), new Point(1, 1), new Point(1, 0), new Point(2, 0)},
                        {new Point(1, 0), new Point(1, 1), new Point(0, 1), new Point(0, 0)},
                        {new Point(0, 1), new Point(1, 1), new Point(1, 0), new Point(2, 0)},
                        {new Point(1, 0), new Point(1, 1), new Point(0, 1), new Point(0, 0)},
                },
                {
                        //L-SHAPE
                        {new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(2, 2)},
                        {new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(0, 2)},
                        {new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(0, 0)},
                        {new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(2, 0)},
                }
        };

    }

}
