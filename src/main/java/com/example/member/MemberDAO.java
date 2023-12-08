package com.example.member;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

//class BoardRowMapper implements RowMapper<BoardVO> {
//    @Override
//    public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
//        BoardVO vo = new BoardVO();
//        vo.setSeq(rs.getInt("seq"));
//        vo.setTitle(rs.getString("title"));
//        vo.setContent(rs.getString("content"));
//        vo.setWriter(rs.getString("writer"));
//        vo.setCategory(rs.getString("category"));
//        vo.setRegdate(rs.getDate("regdate"));
//        return vo;
//    }
//}

@Repository
public class MemberDAO {

    @Autowired
    SqlSession sqlSession;
    public int insertMember(MemberVO vo) {
        int result = sqlSession.insert("Member.insertMember", vo);
        return result;
    }

    public int deleteMember(int seq) {
        int count = sqlSession.insert("Member.deleteMember", seq);
        return count;
    }

    public int updateMember(MemberVO vo) {
        int result = sqlSession.insert("Member.updateMember", vo);
        return result;
    }

    public MemberVO getMember(int seq) {
        MemberVO one = sqlSession.selectOne("Member.getMember", seq);
        return one;
    }

    public List<MemberVO> getMemberList() {
        List<MemberVO> list = sqlSession.selectList("Member.getMemberList");
        return list;
    }
}