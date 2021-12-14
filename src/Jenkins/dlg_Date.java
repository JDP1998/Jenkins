package Jenkins;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dlg_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat format2 = new SimpleDateFormat("dd.MM.YYYY");
		System.out.println("Guten Morgen es ist der "+format2.format(d)+" und es ist "+format.format(d)+" Uhr.");

	}

}
