/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luong_7_methodsmadness;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
 
public class Luong_7_methodsmadness extends Application {
 
    public static void main(String[] args) {
        launch(args);
    }
 
     @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawBackground(canvas,gc,0,0,300,250);
        drawmorebackground(gc);
        drawRectangles(gc,155,180,60,70);       
        drawCircle(gc);
        drawTriangle(gc);
        drawmoreRectangles(gc,280,180,60,70);
        drawmoreCircles(gc);
        drawSmile(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
      private void drawmorebackground(GraphicsContext gc) {
          gc.setFill(Color.BLUE);
          gc.fillRect( 140,160,225,225);
      }  
    private void drawBackground(Canvas canvas,GraphicsContext gc, double x, double y, int w, int h) {
       // gc.setFill(Color.BLUE);
       // gc.fillRect( x , y, w, h);
          for (int sx = 0; sx < canvas.getWidth(); sx++) {
            for (int sy = 0; sy < canvas.getHeight(); sy++) {
                double dx = sx - x;
                double dy = sy - y;
              //  double r = Math.sqrt(dx*dx + dy*dy);
                double r =Math.sqrt(dx*dx+dy*dy)+sx;
                double angle = Math.PI / 256 * (3.5*r);
        
             int tx = (int) (+dx * Math.cos(angle) - dy * Math.sin(angle) + x / 10)+250;
                int ty = (int) (+dx * Math.sin(angle) + dy * Math.cos(angle) + y/10)+250;
            drawlittleCircle(gc, tx,ty);
        } 
    }
           
    }
    private void drawRectangles(GraphicsContext gc, int x, int y, int w, int h) {
        gc.setFill(Color.ORANGE);
        gc.fillRect(x, y, w, h);
        gc.setStroke(Color.BLACK);
    }
    private void drawCircle(GraphicsContext gc) {
        gc.setFill(Color.YELLOW);
        gc.setStroke(Color.RED);
        gc.fillOval(165,200,30,30);
        
    }
   private void drawTriangle(GraphicsContext gc) {
     double [] myX = {270,220,240};
     double [] myY = {285,275,305};
     gc.fillPolygon(myX, myY,3);
     gc.setFill(Color.RED);
     gc.setStroke(Color.PURPLE);
    }
   private void drawmoreRectangles(GraphicsContext gc,int x, int y, int w, int h) {
       gc.setFill(Color.ORANGE);
       gc.setStroke(Color.PURPLE);
       gc.fillRect(x,y,w,h);
   }
     private void drawmoreCircles(GraphicsContext gc) {
       gc.setFill(Color.YELLOW);
       gc.setStroke(Color.RED);
       gc.fillOval(296,200,30,30);
   }
     private void drawlittleCircle(GraphicsContext gc, double x, double y) {
           gc.setFill(Color.YELLOWGREEN);
      gc.setStroke(Color.AQUA);
      gc.fillOval(x, y, 2, 2);
     }
     private void drawCircle(GraphicsContext gc, double x, double y) {
           gc.setFill(Color.DEEPPINK);
      gc.setStroke(Color.AQUA);
      gc.fillOval(x, y, 20, 20);
     }
   private void drawSmile(GraphicsContext gc) {
     
       double [] Xs = {170,180,190,205,215,225,235,245,255,265,275,285,295};
       double [] Ys = {330,335,335,335,335,335,335,335,335,335,335,330};
       for (int i = 0; i < 12; i++) {
           drawCircle(gc, (int) Xs[i],(int)Ys[i]);
                   }
      
       
       
   }
}


       
   
   
       /*
        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(5);
        gc.strokeLine(40, 10, 10, 40);
        gc.fillOval(10, 60, 30, 30);
        gc.strokeOval(60, 60, 30, 30);
        gc.fillRoundRect(110, 60, 30, 30, 10, 10);
        gc.strokeRoundRect(160, 60, 30, 30, 10, 10);
        gc.fillArc(10, 110, 30, 30, 45, 240, ArcType.OPEN);
        gc.fillArc(60, 110, 30, 30, 45, 240, ArcType.CHORD);
        gc.fillArc(110, 110, 30, 30, 45, 240, ArcType.ROUND);
        gc.strokeArc(10, 160, 30, 30, 45, 240, ArcType.OPEN);
        gc.strokeArc(60, 160, 30, 30, 45, 240, ArcType.CHORD);
        gc.strokeArc(110, 160, 30, 30, 45, 240, ArcType.ROUND);
        gc.fillPolygon(new double[]{10, 40, 10, 40},
                       new double[]{210, 210, 240, 240}, 4);
        gc.strokePolygon(new double[]{60, 90, 60, 90},
                         new double[]{210, 210, 240, 240}, 4);
        gc.strokePolyline(new double[]{110, 140, 110, 140},
                          new double[]{210, 210, 240, 240}, 4);
     
*/





