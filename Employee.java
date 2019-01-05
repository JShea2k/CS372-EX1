public class Employee {
	private int ID;
	private String name;
	private int hireDate;
	private String currentPosition;
	private String reportTo;
	
	/** 
	* Initialize the Employee object given a station 
	* @param: _ID sets the ID number
	* _Name sets the name
	*_HireDate sets the date they were hired
	* _CurrentPosition sets their current position
	* _ReportTo sets who they have to report to
	*/
	public Employee(int _ID, String _Name, int _HireDate, String _CurrentPosition, String _ReportTo) {
		ID = _ID;
		name = _Name;
		hireDate = _HireDate;
		currentPosition = _CurrentPosition;
		reportTo = _ReportTo;
	}
}