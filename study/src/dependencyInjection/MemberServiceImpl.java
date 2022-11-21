package dependencyInjection;

public class MemberServiceImpl implements MemberService{
	
	private final MemberRepository memberRepository;
	
	public MemberServiceImpl(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}

	@Override
	public void join() {
		memberRepository.save();
		// TODO Auto-generated method stub
		
	}

	@Override
	public Member findMember() {
		// TODO Auto-generated method stub
		return memberRepository.findById();
	}

}
