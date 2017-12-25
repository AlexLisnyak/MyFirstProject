package Lesson04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApp {

	public static void main(String[] args) {
		//String[] strArr = {"ab","abc","df","ag","ndf"};
		//List<String> list = new ArrayList<>(Arrays.asList(strArr));
		//System.out.println(list.stream().filter((s)->s.contains("a")).count());//показує скільки "a"
		//System.out.println(list.stream().filter((s)->s.contains("a")).collect(Collectors.toList()));//показує самі елементи з "a"
		//list.stream().forEach((p)->System.out.println(p));//виводить елементи
		//list.stream().forEach(System.out::println);
		
		
		/*
		Integer[] arr = {4, 2, 90, 73, 4, 5, 6, 9, 3, 6};
		//Stream<Integer> streamArr = Arrays.stream(arr);
		System.out.println(Arrays.stream(arr).skip(5).filter((e)->e.intValue()%2==0).count());
		System.out.println(Arrays.stream(arr).filter((e)->e.intValue()%3==0).findFirst().orElse(66613));
		*/
		Integer[] arr = new Integer[10000000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random()*100);
		}
		System.out.println("Old Method: ");
		Date date = new Date();
		int even = 0;
		for (int i = arr.length/2; i < arr.length; i++) {
			if(arr[i]%2==0) {
				even++;
			}
		}
		System.out.println("Event count: " + even + "; Time: " + (new Date().getTime()-date.getTime()));
		System.out.println("Stream Method: ");
		Stream<Integer> s = new ArrayList<Integer>(Arrays.asList(arr)).parallelStream();
		date = new Date();
		System.out.println("Even count: " + s.skip(arr.length/2).filter((e)->e.intValue()%2==0).count());
		System.out.println("time: " + (new Date().getTime()-date.getTime()));
		
	}

}
