package com.company;

import javax.swing.*;
import java.awt.*;

public class drawGui {
    public static class drawGUI extends JPanel {
        gGraph Ggraph;
        /**
         * Constructor
         *
         * @param Ggraph
         */
        public drawGUI(gGraph Ggraph) {
            super();
            this.Ggraph = Ggraph;
        }
        /**
         * This part draws dots on this JPanel for user to see
         */
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            // Draw each dot
            for (int i = 0; i < Ggraph.xyPoints.size(); i++) {
                int x = Ggraph.xyPoints.get(i).x;
                int y = Ggraph.xyPoints.get(i).y;
                g.drawLine(x, y, x, y);
                g.drawString("(" + x + "," + y + ")", x, y);
            }
            // Draw all connections
            for (int z = 0; z < Ggraph.xyPoints.size(); z++) {
                int x = Ggraph.xyPoints.get(z).x;
                int y = Ggraph.xyPoints.get(z).y;
                for (int i = 0; i < Ggraph.xyPoints.size(); i++) {
                    int x2 = Ggraph.xyPoints.get(i).x;
                    int y2 = Ggraph.xyPoints.get(i).y;
                    g.drawLine(x, y, x2, y2);
                }
            }
        }
    }
}
