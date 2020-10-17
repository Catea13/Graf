package com.company;

import java.util.ArrayList;

public class gGraph {
    ArrayList<XYpoint> xyPoints = new ArrayList<XYpoint>();
    public void addTriangle(int x, int y, int x2, int y2, int x3, int y3) {
        xyPoints.add(new XYpoint(x, y));
        xyPoints.add(new XYpoint(x2, y2));
        xyPoints.add(new XYpoint(x3, y3));
    }
}
