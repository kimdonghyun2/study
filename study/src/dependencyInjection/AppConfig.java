package dependencyInjection;

public class AppConfig {
	
	public MemberService memberService() {
		return new MemberServiceImpl(new MemoryMemberRepository());
	}
	
	public MemberRepository memberRepository() {
		return new MemoryMemberRepository();
	}
	
}
