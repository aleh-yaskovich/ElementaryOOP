package by.htp.task6.view;

import java.util.Scanner;

import by.htp.task6.entity.Time;

public class ViewTime {
	
	public void viewTimeStart(Time time) {
		System.out.println("Первоначальное время: "+time.getHour()+" : "+time.getMinute()+" : "+time.getSecund());
	}
	
	public void viewTime(int[] newTime) {
		System.out.println("Измененное время: "+newTime[0]+" : "+newTime[1]+" : "+newTime[2]);
	}
	
	public int[] enterNum() {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество часов: ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("Введите количество часов:  ");
        }
        int userHour = sc.nextInt();
        
        System.out.print("Введите количество минут: ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("Введите количество минут:  ");
        }
        int userMinute = sc.nextInt();
        
        System.out.print("Введите количество секунд: ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("Введите количество секунд:  ");
        }
        int userSecund = sc.nextInt();
        
        int[] userTime = {userHour, userMinute, userSecund};        
        return userTime;
	}
	
}
