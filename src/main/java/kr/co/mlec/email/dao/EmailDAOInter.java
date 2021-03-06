package kr.co.mlec.email.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.mlec.member.vo.MemberVO;

@Repository
public class EmailDAOInter implements EmailDAO{
	
	@Autowired
	private SqlSessionTemplate session;
	
	@Override
	public MemberVO searchId(MemberVO vo) {
		System.out.println("SearchDAO 데이터베이스 이전");
		MemberVO result = session.selectOne("eamil.dao.eamilDAO.searchId",vo);
		System.out.println("SearchDAO 데이터베이스 이후");

		return result;
	}

	@Override
	public MemberVO searchPwd(MemberVO vo) {
		System.out.println("비밀번호 찾기"+ vo);
		MemberVO result = session.selectOne("eamil.dao.eamilDAO.searchPwd",vo);
		System.out.println("비밀번호 찾기"+ result);
		return result;
	}

	@Override
	public MemberVO changePwd(MemberVO vo) {
		session.update("eamil.dao.eamilDAO.changePwd",vo);
		return null;
	}

	
	
}
