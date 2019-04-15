package com.cloudpassage.plateaurovers;

import static com.cloudpassage.plateaurovers.DirectionConstants.*;

/**
 * 
 * @author Hitarthi Patel
 * 
 * 
 * This class has all the logic about parsing the command String and moving according to command. 
 * This class also has method to print the result in console.
 *
 */
public class CommandProcessor {

	int x = 0;
	int y = 0;
	int facing = N;
	
	/**
	 *  This is a default constructor.
	 */
	public CommandProcessor() {

	}
	
	/**
	 *  This method will set the initial co-ordinates and direction.
	 *  
	 * @param x
	 * @param y
	 * @param facing
	 */
	public void setInitialPosition(int x, int y, int facing) {
		this.x = x;
		this.y = y;
		this.facing = facing;
	}
	
	/**
	 * 	This method will parse the input command String.
	 * 
	 * @param commands
	 */
	public void process(String commands) {
		for (int idx = 0; idx < commands.length(); idx ++ ) {
			process(commands.charAt(idx));
		}
	}
	
	/**
	 * This method will process the command .
	 * 
	 * @param command
	 */
	private void process(char command) {
		switch(command) {
			case 'L':
				//turn left
				turnLeft();
				break;
			case 'R' :
				//turn right
				turnRight();
				break;
			case 'M' :
				//Moveonestep
				move();
				break;
			default :
				throw new IllegalArgumentException("Please enter valid comamnd!");
			
		}
	}

	/**
	 *  This method will move the rover one grid in same direction.
	 */
	private void move() {
		if (facing == N) {
			this.y += 1  ;
		} else if (facing == E) {
			this.x += 1  ;
		} else if (facing == S) {
			this.y -= 1;
		} else if (facing == W) {
			this.x -= 1;
		}
	}
	
	/**
	 *  This method will move the rover in left.
	 */
	private void turnLeft() {
		facing = (facing - 90) < N ? W : facing - 90;
	}
	
	/**
	 *  This method will move the rover in right.
	 */
	
	private void turnRight() {
		facing = (facing +  90) > W ? N : facing + 90;
	}
	
	
	/**
	 *  This method will print rover's X and Y coordinates and heading direction.
	 */
	public void printResult() {
		char dir = 'N';
		
		switch(facing){
			case  0:
				dir = 'N';
				break;
			case  90:
				dir = 'E';
				break;
			case  180:
				dir = 'S';
				break;
			case  270:
				dir = 'W';
				break;
				
		}
		System.out.println(""+ x + " "+ y + " " +  dir);
	}
}
