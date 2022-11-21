package dependencyInjection;

public interface MemberRepository {
	void save();
	
	Member findById();
}
