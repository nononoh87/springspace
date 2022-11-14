package ex1_xml2_ref;

public class MemberDAO {

	private MemberBean member;

	
	public MemberDAO() {}
	
	//constructor
	public MemberDAO(MemberBean member) {
		
		this.member = member;
	}

	// setter
	public void setMember(MemberBean member) {
		this.member = member;
	}
	public void insert() {
		member.output();
		System.out.println("저장하였습니다.");
	}
	
	
}
