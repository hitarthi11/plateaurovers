package com.cloudpassage.plateaurovers;

import static com.cloudpassage.plateaurovers.DirectionConstants.E;
import static com.cloudpassage.plateaurovers.DirectionConstants.N;

/**
 * 
 * @author Hitarthi Patel
 *
 */
public class PlateauRovers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommandProcessor processor = new CommandProcessor();
		processor.setInitialPosition(1, 2, N);
		processor.process("LMLMLMLMM");
		processor.printResult();  
		processor.setInitialPosition(3, 3, E);
		processor.process("MMRMMRMRRM");
		processor.printResult(); 

	}

}
