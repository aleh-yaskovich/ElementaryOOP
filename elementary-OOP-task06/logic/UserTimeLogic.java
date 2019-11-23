package by.htp.task6.logic;

import java.util.Scanner;

public class UserTimeLogic {
	
	public int[] enterNum() {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество часов: ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("Введите количество часов:  ");
        }
        int userHour = sc.nextInt();
        while (userHour < 0) {
        	System.out.print("Введите количество часов: ");
            while(!sc.hasNextInt()) {
            	sc.next();
            	System.out.print("Введите количество часов: ");
            }
            userHour = sc.nextInt();
        }
        
        System.out.print("Введите количество минут: ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("Введите количество минут:  ");
        }
        int userMinute = sc.nextInt();
        while (userMinute < 0) {
        	System.out.print("Введите количество минут: ");
            while(!sc.hasNextInt()) {
            	sc.next();
            	System.out.print("Введите количество минут: ");
            }
            userMinute = sc.nextInt();
        }
        
        System.out.print("Введите количество секунд: ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("Введите количество секунд:  ");
        }
        int userSecund = sc.nextInt();
        while (userSecund < 0) {
        	System.out.print("Введите количество секунд: ");
            while(!sc.hasNextInt()) {
            	sc.next();
            	System.out.print("Введите количество секунд: ");
            }
            userSecund = sc.nextInt();
        }
        int[] userTime = {userHour, userMinute, userSecund};        
        return userTime;
	}
	
	
}
