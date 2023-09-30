package utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class Utils {
	
	static NumberFormat  NumberFormat = 
			new DecimalFormat(" R$ #,## 0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));
	
	public static String doublString(Double value) {
		return NumberFormat.format(value);
	}

}
