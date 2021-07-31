package com.day6assign.stopwatch;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class StopWatch {
	private static Instant start = null;
	private static Instant stop = null;
	public static Instant currentTime() {
		Instant st = Instant.now();
		return st;
	}
public static void main(String[] args) {
	Scanner SC = new Scanner(System.in);
	System.out.println("1.start time\n2.stop time\nselect from option");
	int x1 = SC.nextInt();
	if (x1 == 1) {
		start = currentTime();
	}
	int x2 = SC.nextInt();
	if (x2 == 2) {
		stop = currentTime();
	}
	Duration interval = Duration.between(start, stop);
	System.out.println("Elapsed time in seconds: " + interval.getSeconds());
	SC.close();
	}
}
