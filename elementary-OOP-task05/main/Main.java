package by.htp.task5.main;

import by.htp.task5.entity.Count;
import by.htp.task5.logic.CountLogic;
import by.htp.task5.view.CountView;

public class Main {

	public static void main(String[] args) {
		
		Count count = new Count(0);
		CountLogic logic = new CountLogic();
		CountView view = new CountView();
		
		view.ViewCount(count.getCount());
		count.setCount(logic.countRandom(count));
		view.ViewCount(count.getCount());
		String plusMinus = view.EnterPlusMinus();
		count.setCount(logic.countChange(count, plusMinus));
		int userNumber = view.countEnterUser();
		count.setCount(userNumber);
		view.ViewCount(count.getCount());

	}

}
