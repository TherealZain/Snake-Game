package BreakerGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.JPanel;

public class Gameplay extends JPanel implements KeyListener, ActionListener{
	
	JPanel gamePlay;
	private boolean play = false;
	private int score = 0;
	private int totalBricks = 21;
	
	private Timer timer;
	private int delay = 8;
	
	private int playerX = 310;
	
	private int ballPosX = 120;
	private int ballPosY = 350;
	private int ballYdir = -2;
	
	
	public Gameplay() {
		addKeyListener(this);		
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		timer = new Timer(delay, this);
		timer.start();
		
		
		
	}
	
	public void paint(Graphics g) {
		// background
		g.setColor(Color.black);
		g.fillRect(1,  1,  692,  592);
		
		
		//borders
		g.setColor(Color.yellow);
		g.fillRect(0,  0,  3,  592);
		g.fillRect(0,  0,  692,  592);
		g.fillRect(691,  0,  3,  592);
		
		//the paddle
		g.setColor(Color.green);
		g.fillRect(playerX, 550, 100, 8);
		
		//the ball
		g.setColor(Color.yellow);
		g.fillRect(ballPosX, ballPosY, 20, 20);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(playerX < 10) {
			playerX = 10;
		} else {
			moveLeft();
		}
	}
	
	public void moveRight() {
		play = true;
		playerX += 20;
	}
	public void moveLeft() {
		play = true;
		playerX -= 20;
	}

	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			
		}
	}

}
