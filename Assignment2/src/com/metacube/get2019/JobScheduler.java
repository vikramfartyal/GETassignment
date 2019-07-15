package com.metacube.get2019;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * It is a class with main method using FcfsOperations class.
 * @author Khushi
 *
 */

public class JobScheduler {

	/**
	 * It is using FcfsOperations class and taking input from user.
	 * @param args Unused
	 * @throws IOException
	 */
	public static void main(String args[]) throws IOException {

		JobSchedulerService fo_obj = new JobSchedulerService();
		Scanner sc = new Scanner(System.in);
		int numberOfProcess;
		try {
			System.out.print("Enter the number of processes = ");
			numberOfProcess = sc.nextInt();
			System.out.println("-----------------------------------");

	
			int arv_burst_time_arr[][] = new int[numberOfProcess][2];
			int[] processId_arr = new int[numberOfProcess];
			int[] waitingTime_arr = new int[numberOfProcess];
			int[] completionTime_arr = new int[numberOfProcess];
			int[] processTurnAroundTime_arr = new int[numberOfProcess];
	
			System.out.println("Enter process id's, arrivalTime and burstTime for processes");
			for (int i = 0; i < numberOfProcess; i++) {
				int k = 0, l = 1;
				System.out.print("Process ID = ");
				processId_arr[i] = sc.nextInt();
				System.out.print("Arrival time = ");
				arv_burst_time_arr[i][k] = sc.nextInt();
				System.out.print("Burst time = ");
				arv_burst_time_arr[i][l] = sc.nextInt();
				System.out.println();
			}
			
			// Sorting
			for (int i = 0; i < numberOfProcess; i++) {
				for (int j = i + 1; j < numberOfProcess; j++) {
					int k = 0;
					if (arv_burst_time_arr[i][k] > arv_burst_time_arr[j][k]) {
						int temp = arv_burst_time_arr[i][k];
						arv_burst_time_arr[i][k] = arv_burst_time_arr[j][k];
						arv_burst_time_arr[j][k] = temp;
	
						k++;
						int temp1 = arv_burst_time_arr[i][k];
						arv_burst_time_arr[i][k] = arv_burst_time_arr[j][k];
						arv_burst_time_arr[j][k] = temp1;
	
						int temp2 = processId_arr[i];
						processId_arr[i] = processId_arr[j];
						processId_arr[j] = temp2;
					}
				}
			}
	
			fo_obj.waitingTime(arv_burst_time_arr, waitingTime_arr, numberOfProcess);
			fo_obj.completionTime(arv_burst_time_arr, waitingTime_arr,
					completionTime_arr, numberOfProcess);
			fo_obj.turnAroundTime(processTurnAroundTime_arr, arv_burst_time_arr,
					waitingTime_arr, numberOfProcess);
			double avg = fo_obj.avgWaitingTime(waitingTime_arr, numberOfProcess);
			int maxWaitTime = fo_obj.maxWaitingTime(waitingTime_arr,
					numberOfProcess);
			
			System.out.println("----------------------------------------------------");
			System.out.println("ProcessId  BurstTime ArrivalTime WaitingTime TurnAroundTime CompletionTime");
			for (int i = 0; i < numberOfProcess; i++) {
				int k = 0, l = 1;
				System.out.print(processId_arr[i] + "\t" + arv_burst_time_arr[i][l]
						+ "\t" + arv_burst_time_arr[i][k] + "\t"
						+ waitingTime_arr[i] + "\t" + processTurnAroundTime_arr[i]
						+ "\t" + completionTime_arr[i]);
				System.out.println();
			}
	
			System.out.println("-----------------------------------");
			System.out.println("Average Waiting time is :  " + avg);
			System.out.println("-----------------------------------");
			System.out.println("Maximum waiting time is : " + maxWaitTime);
			System.out.println("-----------------------------------");
		}catch (InputMismatchException e) {
			System.out.println(e.getStackTrace());
		}
		finally {
			sc.close();
		}
	}
}
