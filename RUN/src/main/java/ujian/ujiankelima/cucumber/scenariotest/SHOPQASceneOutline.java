package ujian.ujiankelima.cucumber.scenariotest;

public enum SHOPQASceneOutline {
	
	
	T1("User login invalid"),
	T2("Search data product web");
	private String testName;
	
	private SHOPQASceneOutline(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	
		}

}
