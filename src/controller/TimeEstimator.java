package controller;
/**
 * Estimate the time required to construct a complexity graph
 * 
 * @author CS3151 Spring 2019
 *
 */
public class TimeEstimator {

	private static final double TIME_UNIT = 5495738/1.0E9; 
	private static final int STOP = 100;
	private static final int STEP = 1;
	private static final int REPEAT = 20;
	private static final int SECS_IN_HOUR = 3600;
	
	private static double complexity(int n) {
		return 1.0*n*n;
	//	return n*Math.log(n);
	}
	
	private static double accumulate() {
		double acc = 0.0;
		for(int i = 1; i <= STOP; i += STEP) {
			acc += complexity(i);
		}
		return acc*REPEAT*TIME_UNIT/SECS_IN_HOUR;
	}
	
	public static void main(String[] arg) {
		double total = accumulate();
		int hours = (int) total;
		int min = (int) (60*(total - hours));
		
		System.out.println("Estimated time to complete job: " + hours + " hour" +
				   (hours==1? " ": "s ") + min + " minute"+(min==1? "":"s"));
	}
}
