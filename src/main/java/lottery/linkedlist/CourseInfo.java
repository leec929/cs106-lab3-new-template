package lottery.linkedlist;

public class CourseInfo {
	private String courseName;
	private int enrollCapacity;
	private int waitlistCapacity;
	private int[] yearPreference;
	private int[] majorPreference;
	private int[] minorPreference;
	private int biCoPreference;
	private int previousLotteryPreference;
	
	// constructor
	public CourseInfo(String[] weightInfo) {
		String[] basicInfo = weightInfo[0].split("/");
		courseName = basicInfo[0];
		enrollCapacity = Integer.parseInt(basicInfo[1]);
		waitlistCapacity = Integer.parseInt(basicInfo[2]);
		
		yearPreference = parseYearPrefs(weightInfo[1]);

		majorPreference = parseStudyPreference(weightInfo[2]);
		minorPreference = parseStudyPreference(weightInfo[3]);
		
		biCoPreference = Integer.parseInt(weightInfo[4]);
		previousLotteryPreference = Integer.parseInt(weightInfo[5]);
	}
	
	// getters
	public String getCourseName() { return courseName; }
	public int getEnrollCapacity() { return enrollCapacity; }
	public int getWaitlistCapacity() { return waitlistCapacity; }

	// maybe not all necessary... but keeping for Main's test
	public int[] getYearPreference() { return yearPreference; }
	public int[] getMajorPreference() { return majorPreference; }
	public int[] getMinorPreference() { return minorPreference; }
	public int getBiCoPreference() { return biCoPreference; }
	public int getPreviousPreference() { return previousLotteryPreference; }
	
	public int[] parseYearPrefs(String yearPref) {
		int[] yearPrefs = new int[4];
		String[] yearPoints = yearPref.split("/");
		
		for(int index = 0; index < yearPoints.length; index++)
			yearPrefs[index] = Integer.parseInt(yearPoints[index]);
		
		return yearPrefs;
	}
	
	// helper function for constructor
	public int[] parseStudyPreference(String studyPref) {
		int[] preferences = new int[3];
		String[] fieldPrefs = studyPref.split("/");
		for(String fieldPref : fieldPrefs) {
			if(fieldPref.equals(""))
				continue;
			String[] pair = fieldPref.split(":");
			if(pair[0].equals("H"))
				preferences[0] = Integer.parseInt(pair[1]);
			else if(pair[0].equals("N"))
				preferences[1] = Integer.parseInt(pair[1]);
			else //if(pair[0].equals("S"))
				preferences[2] = Integer.parseInt(pair[1]);
		}
		return preferences;
	}
}
