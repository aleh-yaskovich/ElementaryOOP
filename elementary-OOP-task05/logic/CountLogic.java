package by.htp.task5.logic;

import java.util.Scanner;
import by.htp.task5.entity.Count;
import by.htp.task5.view.CountView;

public class CountLogic {
	
	public int countChange(Count count, String str) {
		int countChange = count.getCount();
		CountView view = new CountView();
		if (str.equals("+")) {
			int check = countChange + 1;
			if (check > 9) {
				view.NegativeResult(check);
			} else {
				countChange++;
				view.ViewCount(countChange);
			}
		} else if (str.equals("-")) {
			int check = countChange - 1;
			if (check < 0) {
				view.NegativeResult(check);
			} else {
				countChange--;
				view.ViewCount(countChange);
			}
		}		
		return countChange;
	}
	
	public int countRandom(Count count) {
		int countRandom = (int)(Math.random()*10);
		count.setCount(countRandom);
		return countRandom;
	}
	
}
