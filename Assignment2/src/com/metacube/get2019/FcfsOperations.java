package com.metacube.get2019;


/**
 * This is a class which is used to calculate completionTime, waitingTime, turnAroundTime, AverageWaitingTime,
 * MaximumWaitingTime for processes.
 * @author admin
 *
 */
class FcfsOperations {

	/**
	 * This is a method which is used to calculate completion time of processes.
	 * @param arrivalTime It is an array indicates the arrival time of process. 
	 * @param burstTime It is an array indicates the time for which process runs.
	 * @param waitingTime It is an array indicates the waiting time of process before which it get processed
	 * @param completionTime it is an array indicates the time at which process comletes its execution.
	 * @param numberOfProcess It indicates the number of processes present.
	 */
	public void completionTime(int[] arrivalTime, int[] burstTime,
			int[] waitingTime, int[] completionTime, int numberOfProcess) {
		for (int i = 0; i < numberOfProcess; i++) {
			int completeTime = arrivalTime[i] + burstTime[i] + waitingTime[i];
			completionTime[i] = completeTime;
		}
	}
	
	/**
	 * It is a method which is used to calculate the turnAroundTime of processes.
	 * @param turnAroundTime It is an array which indicates the time taken after an arrival for processes
	 * @param burstTime It is an array indicates the time for which process runs.
	 * @param waitingTime It is an array indicates the waiting time of process before which it get processed.
	 * @param numberOfProcess It indicates the number of processes present.
	 */
	public void turnAroundTime(int[] turnAroundTime, int[] burstTime,
			int[] waitingTime, int numberOfProcess) {
		for (int i = 0; i < numberOfProcess; i++) {
			int time = burstTime[i] + waitingTime[i];
			turnAroundTime[i] = time;
		}
	}

	/**
	 * It is a method which is used to calculate the time before which a process begin's its execution.
	 * @param arrivalTime It is an array indicates the arrival time of process.
	 * @param burstTime It is an array indicates the time for which process runs.
	 * @param waitingTime It is an array indicates the waiting time of process before which it get processed.
	 * @param numberOfProcess It indicates the number of processes present.
	 */
	public void waitingTime(int[] arrivalTime, int[] burstTime,
			int[] waitingTime, int numberOfProcess) {
		int[] serviceTime = new int[numberOfProcess];
		serviceTime[0] = 0;
		waitingTime[0] = 0;
		for (int i = 1; i < numberOfProcess; i++) {
			int time = serviceTime[i - 1] + burstTime[i - 1];
			serviceTime[i] = time;
			int waitTime = serviceTime[i] - arrivalTime[i];
			waitingTime[i] = waitTime;
			if (waitingTime[i] < 0) {
				waitingTime[i] = 0;
			}
			serviceTime[i] = time;
		}

	}

	/**
	 * 
	 * @param waitingTime It is an array indicates the waiting time of process before which it get processed.
	 * @param numberOfProcess It indicates the number of processes present.
	 * @return AverageWaitingtime 
	 */
	public double avgWaitingTime(int[] waitingTime, int numberOfProcess) {
		double averageTime = 0;
		for (int i = 0; i < numberOfProcess; i++) {
			averageTime += waitingTime[i];
		}
		averageTime /= numberOfProcess;
		return averageTime;
	}

	/**
	 * It is a method which is used to calculate maximum waiting time of process.
	 * @param waitingTime It is an array indicates the waiting time of process before which it get processed.
	 * @param numberOfProcess It indicates the number of processes present.
	 * @return MaximumWaitingTime
	 */
	public int maxWaitingTime(int[] waitingTime, int numberOfProcess) {
		int maxWaitingTime = waitingTime[0];
		for (int i = 0; i < maxWaitingTime; i++) {
			if (maxWaitingTime < waitingTime[i])
				maxWaitingTime = waitingTime[i];
		}
		return maxWaitingTime;
	}
}
