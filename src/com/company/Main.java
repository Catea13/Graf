package com.company;

import java.util.ArrayList;
import javax.swing.JFrame;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        ArrayList<XYpoint> xyPointList = new ArrayList<XYpoint>();
        // Draw points
        xyPointList.add(new XYpoint(125, 180));
        xyPointList.add(new XYpoint(80, 225));
        xyPointList.add(new XYpoint(190, 245));
        xyPointList.add(new XYpoint(280, 230));
        gGraph Ggraph = new gGraph();
        Ggraph.addTriangle(100, 100, 300, 80, 190, 150);
        Ggraph.addTriangle(125, 180, 80, 225, 190, 245);
        drawGui.drawGUI jPanel = new drawGui.drawGUI(Ggraph);
        frame.add(jPanel);
    }
}