package dependencyInjection;

public class Settings {
	
	private Settings() {}
	
	private static class SettingHolder{
		private static final Settings SETTINGS = new Settings();
	}
	
	public static Settings getInstance() {
		return SettingHolder.SETTINGS;
	}
}
