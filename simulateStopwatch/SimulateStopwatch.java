package simulateStopwatch;

public class SimulateStopwatch {
	final long startTime=0;
	public static void main(String[] args) {
		long startTime = SimulateStopwatch.startTimer();
        for (int i = 0; i < 1000; i++)
        {
            System.out.println(i);    
        }
        long endTime = SimulateStopwatch.endTimer();
        double elapsedTime = (endTime - startTime) / 1000.0;
        System.out.println("Time difference between start and end is " + elapsedTime + " seconds.");
    }

    public static long startTimer(){
        long startTime = System.currentTimeMillis();
        return startTime;
    }

    public static long endTimer()
    {
        long endTime = System.currentTimeMillis();
        return endTime;
    }

}
