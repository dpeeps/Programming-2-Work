// David Pieper 9/10/2018 Period 3B Lab 4 100 Point version
// Finished and Submittted 9/14/2018 
// Version 1.0 9/14/2108
// GraphicsLab01st.java
// The AWT Graphics Program
// This is the student, starting version of Graphics Lab 01.


import java.awt.*;
import java.applet.*;


public class GraphicsLab01v100 extends Applet
{

	public void paint(Graphics g)
	{
		// DRAW CUBE
      g.drawRect(50,50,200,200);
      g.drawRect(100,100,200,200);
      g.drawLine(50,50,100,100);
      g.drawLine(250,50,300,100);
      g.drawLine(50,250,100,300);
      g.drawLine(250,250,300,300);

		// DRAW SPHERE
      g.drawOval(400,50,350,350);
      g.drawArc(400,175,350,90,0,180);
      g.drawArc(400,175,350,90,180,180);
      g.drawArc(402,150,345,100,0,180);
      g.drawArc(402,200,345,100,180,180);
      g.drawArc(408,125,335,100,0,180);
      g.drawArc(408,225,335,100,180,180);
      g.drawArc(418,100,314,100,0,180);
      g.drawArc(418,250,314,100,180,180);
      g.drawArc(530,50,100,350,90,180);
      g.drawArc(530,50,100,350,270,180);
      g.drawArc(505,52,100,346,90,180);
      g.drawArc(555,52,100,346,270,180);
      g.drawArc(480,55,100,340,90,180);
      g.drawArc(580,59,100,332,270,180);
      g.drawArc(455,65,100,320,90,180);
      g.drawArc(605,70,100,310,270,180);

		// DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
      g.drawOval(600,500,300,300);
      g.drawLine(600,650,862,550);
      g.drawLine(600,650,750,800);
      g.drawLine(750,800,862,550);
      g.drawOval(657,607,142,142);



		// DRAW APCS
      g.fillRect(50, 400, 15, 150);
      g.fillRect(100,400,15,150);
      g.fillRect(50, 400, 50, 15);
      g.fillRect(50, 475, 50, 15);
      g.fillRect(150, 400, 15, 150);
      g.fillRect(150, 400, 75, 15);
      g.fillRect(210, 400, 15, 80);
      g.fillRect(150, 465, 75, 15);
      g.fillRect(260, 400, 15, 150);
      g.fillRect(260, 400, 75, 15);
      g.fillRect(260, 535, 75, 15);
      g.fillRect(375, 400, 75, 15);
      g.fillRect(375, 400, 15, 88);
      g.fillRect(375, 473, 75, 15);
      g.fillRect(435, 473, 15, 80);
      g.fillRect(375, 553, 75, 15);


		// DRAW PACMEN FLOWER
      g.fillArc(60,700,75,75,315,270);
      g.fillArc(60,610,75,75,135,270);
      g.fillArc(110,655,75,75,45,270);
      g.fillArc(15,655,75,75,225,270);


	}

}


