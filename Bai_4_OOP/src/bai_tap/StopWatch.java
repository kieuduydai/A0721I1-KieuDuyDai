package bai_tap;

import java.util.Arrays;

public class StopWatch {
	private long starTime,endTime;
    
	public StopWatch() {
    }
	
    public void start() {
         starTime = System.currentTimeMillis();
    }
    
    public void stop() {
         endTime = System.currentTimeMillis();
    }
    
    public long getElapsedTime() {
        return endTime-starTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        
        int[] array = new int[1000000];
        
        for(int i = 0; i < array.length ; i++)
            array[i] = (int) (Math.random()*100000);
        
       
        stopWatch.start();
        
        Arrays.sort(array);
        
        for(int i = 0; i < array.length ; i++)
        	System.out.println(array[i]+" ");
        
        stopWatch.stop();	
        
        System.out.println("Thoi gian thuc thi cua thuat toan sap xep "
        		+ "la "+stopWatch.getElapsedTime()+" ms");
    }
}
