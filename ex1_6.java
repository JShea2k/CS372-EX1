public class Date {
	private int day;
	private int month;
	private int year;
	
	/** 
	* Initialize the Employee object given a station 
	* @param: _Day sets the day number
	* _Month sets the month number
	* _Year sets the year number
	*/
	public Date(int _Day, int _Month, int _Year) {
		if((_Day >= 1) || (_Day <= 31))
			day = _Day;
		else 
			day = 0;
		
		if((_Month >=1) || (_Month <= 12))
			month = _Month;
		else 	
			month = 0;
		
		year = _Year;
	}
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setDay(int _Day) {
		day = _Day;
	}
	
	public void setMonth(int _Month) {
		month = _Month;
	}
	
	public void setYear(int _Year) {
		year = _Year;
	}
	
	public Date dayDifference(Date d) {
		int difference = d.getDay() - day;
		return new Date(difference, month, year);
	}
}