package dependencyInjection;

public class MainClass {
	public static void main(String[] args) {
		
		AppConfig appConfig = new AppConfig();
		MemberService memberService = appConfig.memberService();
		
		MemberRepository memberRepository = appConfig.memberRepository();
	}
}
