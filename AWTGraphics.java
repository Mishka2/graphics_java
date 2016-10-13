//  Michelle Loven  10.13.16

// Lab04
// The AWT Graphics Program
// This is the student, starting version of the AWT Graphics Program.

import java.awt.*;
import java.applet.*;
public class AWTGraphics extends Applet
{
	
	public void paint(Graphics g)
  { 
		// DRAW CUBE
	g.drawRect(200, 200, 200, 200);
	g.drawRect(250, 250, 200, 200);
	g.drawLine(200, 200, 250, 250);
	g.drawLine(400, 200, 450, 250);
	g.drawLine(200, 400, 250, 450);
	g.drawLine(400, 400, 450, 450);
  	
    // DRAW SPHERE
	g.drawOval(225, 225, 200, 200);
	g.drawOval(225, 250, 200, 150);
	g.drawOval(225, 275, 200, 100);
	g.drawOval(225, 300, 200, 50);
	g.drawOval(250, 225, 150, 200);
	g.drawOval(275, 225, 100, 200);
	g.drawOval(300, 225, 50, 200);
	
    // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
	g.drawOval(675, 400, 200, 200);
	g.drawLine(675, 498, 775, 600 );
	g.drawLine(775, 600, 852, 438 );
	g.drawLine(852, 438, 675, 498 );
	g.drawOval(715, 472, 93, 93);
	
    // DRAW MAMS (or your own block initials)
	
	g.fillRect(500, 100, 10, 40);
	g.fillRect(530, 100, 10, 40);
	g.fillRect(520, 110, 10, 10);
	g.fillRect(510, 110, 10, 10);
	g.fillRect(550, 100, 10, 40);
	g.fillRect(550, 100, 30, 10);
	g.fillRect(550, 115, 30, 10);
	g.fillRect(550, 130, 30, 10);
	g.fillRect(590, 100, 10, 40);
	g.fillRect(610, 100, 10, 40);
	g.fillRect(635, 100, 10, 40);
	g.fillRect(655, 100, 10, 40);
	g.fillRect(635, 100, 30, 10);
	g.fillRect(635, 130, 30, 10);
	
	g.fillRect(25,25,20,100);
	g.fillRect(45,45,20,20);
	g.fillRect(65,65,20,20);
	g.fillRect(85,45,20,20);
	g.fillRect(105,25,20,100);
	g.fillRect(145,25,20,100);
	g.fillRect(165,105,40,20);
	
    // DRAW PACMEN FLOWER
	g.fillArc(700, 200, 100, 100, 315, 270 );
	g.fillArc(770, 140, 100, 100, 45, 270 );
	g.fillArc(700, 80, 100, 100, 135, 270 );
	g.fillArc(630, 140, 100, 100, 225, 270 );
  }
 }

	