package com.metacube.get2019;


/**
 * This is a class which is used to calculate completionTime, waitingTime, turnAroundTime, AverageWaitingTime,
 * MaximumWaitingTime for processes.
 * @author Khushi
 *
 */
class FcfsOperations {

	/**
	 * This is a method which is used to calculate completion time of processes.
	 * @param arv_burst_time_arr It is an array indicates the arrival time and burst time of process. 
	 * @param waitingTime It is an array indicates the waiting time of process before which it get processed
	 * @param completionTime it is an array indicates the time at which process completes its execution.
	 * @param numberOfProcess It indicates the number of processes present.
	 */
	public void completionTime(int arv_burst_time_arr[][],
			int[] waitingTime_arr, int[] completionTime_arr, int numberOfProcess) {
		int k = 1, l = 0;
		for (int i = 0; i < numberOfProcess; i++) {
			int completeTime = arv_burst_time_arr[i][k] + arv_burst_time_arr[i][l] + waitingTime_arr[i];
			completionTime_arr[i] = completeTime;
		}
	}
	
	/**
	 * It is a method which is used to calculate the turnAroundTime of processes.
	 * @param turnAroundTime_arr It is an array which indicates the time taken after an arrival for processes
	 * @param arv_burst_time_arr It is an 2-D array indicates the time for which process runs and arrival time of process.
	 * @param waitingTime_arr It is an array indicates the waiting time of process before which it get processed.
	 * @param numberOfProcess It indicates the number of processes present.
	 */
	public void turnAroundTime(int[] turnAroundTime_arr, int arv_burst_time_arr[][],
			int[] waitingTime_arr, int numberOfProcess) {
		int k=1;
		for (int i = 0; i < numberOfProcess; i++) {
			int time = arv_burst_time_arr[i][k] + waitingTime_arr[i];
			turnAroundTime_arr[i] = time;
		}
	}

	/**
	 * It is a method which is used to calculate the time before which a process begin's its execution.
	 * @param arv_burst_time_arr It is an 2-D array indicates the arrival time and burst time of process.
	 * @param waitingTime_arr It is an array indicates the waiting time of process before which it get processed.
	 * @param numberOfProcess It indicates the number of processes present.
	 */
	public void waitingTime(int arv_burst_time_arr[][],
			int[] waitingTime_arr, int numberOfProcess) {
		int[] serviceTime_arr = new int[numberOfProcess];
		serviceTime_arr[0] = 0;
		waitingTime_arr[0] = 0;
		int k=1, l=0;
		for (int i = 1; i < numberOfProcess; i++) {
			int time = serviceTime_arr[i - 1] + arv_burst_time_arr[i - 1][k];
			serviceTime_arr[i] = time;
			int waitTime = serviceTime_arr[i] - arv_burst_time_arr[i][l];
			waitingTime_arr[i] = waitTime;
			if (waitingTime_arr[i] < 0) {
				waitingTime_arr[i] = 0;
			}
			serviceTime_arr[i] = time;
		}

	}

	/**
	 * 
	 * @param waitingTime_arr It is an array indicates the waiting time of process before which it get processed.
	 * @param numberOfProcess It indicates the number of processes present.
	 * @return AverageWaitingtime 
	 */
	public double avgWaitingTime(int[] waitingTime_arr, int numberOfProcess) {
		double averageTime = 0;
		for (int i = 0; i < numberOfProcess; i++) {
			averageTime += waitingTime_arr[i];
		}
		averageTime /= numberOfProcess;
		return averageTime;
	}

	/**
	 * It is a method which is used to calculate maximum waiting time of process.
	 * @param waitingTime_arr It is an array indicates the waiting time of process before which it get processed.
	 * @param numberOfProcess It indicates the number of processes present.
	 * @return MaximumWaitingTime
	 */
	public int maxWaitingTime(int[] waitingTime_arr, int numberOfProcess) {
		int maxWaitingTime = waitingTime_arr[0];
		for (int i = 0; i < numberOfProcess; i++) {
			if (maxWaitingTime < waitingTime_arr[i])
				maxWaitingTime = waitingTime_arr[i];
		}
		return maxWaitingTime;
	}
}
