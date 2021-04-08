package linkedListCollection;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Dat {

	public static void main(String[] args) {

		Date date = new Date();
		date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("kk:mm, MMMM dd, yyyy aa ");

		String strDate = dateFormat.format(date);
		System.out.println("Converted String: " + strDate);

	}

}
