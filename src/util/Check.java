package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Check {
	
	public static void main(String[] args) throws ParseException {
		Integer start=20170717;
		Integer end=20170720;
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
		Calendar calendar = Calendar.getInstance();

        ArrayList<Integer> dateList = new ArrayList<Integer>();
        while(start <= end) {
            dateList.add(start);

            calendar.setTime(sf.parse(start+""));
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            start = Integer.parseInt(sf.format(calendar.getTime()));
        }
        dateList.toArray(new Integer[]{});
        
        for (Integer integer : dateList) {
			System.out.println(integer);
		}
	}
}
