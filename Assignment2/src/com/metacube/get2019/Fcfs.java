package com.metacube.get2019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * It is a class with main method using FcfsOperations class.
 * @author admin
 *
 */
public class Fcfs {

	/**
	 * It is using FcfsOperations class and taking input from user.
	 * @param args Unused
	 * @throws IOException
	 */
	public static void main(String args[]) throws IOException {

		FcfsOperations obj = new FcfsOperations();
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numberOfProcess;
		System.out.println("Enter the number of processes ");
		numberOfProcess = sc.nextInt();

		int[] arrivalTime = new int[numberOfProcess];
		int[] burstTime = new int[numberOfProcess];
		int[] processId = new int[numberOfProcess];
		int[] waitingTime = new int[numberOfProcess];
		int[] completionTime = new int[numberOfProcess];
		int[] processTurnAroundTime = new int[numberOfProcess];

		String input;

		System.out
				.println("Enter process id's, arrivalTime and burstTime for processes");
		for (int i = 0; i < numberOfProcess; i++) {
			input = br.readLine();
			String inp[] = input.split(" ");
			processId[i] = Integer.parseInt(inp[0]);
			arrivalTime[i] = Integer.parseInt(inp[1]);
			burstTime[i] = Integer.parseInt(inp[2]);

		}

		for (int i = 0; i < numberOfProcess; i++) {
			for (int j = numberOfProcess - 1; j > i; j--) {
				if (arrivalTime[i] > arrivalTime[j]) {

					int tmp = arrivalTime[i];
					arrivalTime[i] = arrivalTime[j];
					arrivalTime[j] = tmp;
					int temp2 = burstTime[i];
					burstTime[i] = burstTime[j];
					burstTime[j] = temp2;
					int tmp3 = processId[i];
					processId[i] = processId[j];
					processId[j] = tmp3;
				}
			}
		}

		obj.waitingTime(arrivalTime, burstTime, waitingTime, numberOfProcess);
		obj.completionTime(arrivalTime, burstTime, waitingTime, completionTime,
				numberOfProcess);
		obj.turnAroundTime(processTurnAroundTime, burstTime, waitingTime,
				numberOfProcess);
		double avg = obj.avgWaitingTime(waitingTime, numberOfProcess);
		int maxWaitTime = obj.maxWaitingTime(waitingTime, numberOfProcess);

		System.out
				.println("Processes  BurstTime ArrivalTime WaitingTime TurnAroundTime CompletionTime");
		for (int i = 0; i < numberOfProcess; i++) {
			System.out.print(processId[i] + "\t" + burstTime[i] + "\t"
					+ arrivalTime[i] + "\t" + waitingTime[i] + "\t"
					+ processTurnAroundTime[i] + "\t" + completionTime[i]);
			System.out.println();
		}

		System.out.println("Average Waiting time is " + avg);
		System.out.println("Maximum waiting time is " + maxWaitTime);
	}
}
