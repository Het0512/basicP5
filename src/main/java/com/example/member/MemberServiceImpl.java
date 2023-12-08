package com.example.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberDAO memberDAO;

    @Override
    public int insertMember(MemberVO vo) {
        return memberDAO.insertMember(vo);
    }

    @Override
    public int deleteMember(int seq) {
        return memberDAO.deleteMember(seq);
    }

    @Override
    public int updateMember(MemberVO vo) {
        return memberDAO.updateMember(vo);
    }

    @Override
    public MemberVO getMember(int seq) {
        return memberDAO.getMember(seq);
    }

    @Override
    public List<MemberVO> getMemberList(){
        return memberDAO.getMemberList();
    }

}