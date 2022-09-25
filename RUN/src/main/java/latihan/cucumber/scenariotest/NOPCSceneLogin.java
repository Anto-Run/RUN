package latihan.cucumber.scenariotest;

public enum NOPCSceneLogin {
	
	
	T1("User invalid login"),
	T2("User valid login");
	
	private String testName;
	
	private NOPCSceneLogin(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}

