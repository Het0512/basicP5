package com.example.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/member")
public class MemberController {
    @Autowired
    MemberServiceImpl memberService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String boardlist(Model model) {
        model.addAttribute("list", memberService.getMemberList());
        return "list";
    }

    @RequestMapping(value="/add", method = RequestMethod.GET)
    public String addPost() {
        return "addpostform";
    }

    @RequestMapping(value="/addok", method = RequestMethod.POST)
    public String addPostOK(MemberVO vo) {
        if(memberService.insertMember(vo) == 0)
            System.out.println("데이터 추가 실패 ");
        else
            System.out.println("데이터 추가 성공 ");
        return "redirect:list";
    }

    @RequestMapping(value="/editform/{id}", method = RequestMethod.GET)
    public String editPost(@PathVariable("id") int id, Model model) {
        MemberVO memberVO = memberService.getMember(id);
        model.addAttribute("u", memberVO);
        return "editform";
    }

    @RequestMapping(value="/postform/{id}", method = RequestMethod.GET)
    public String postPost(@PathVariable("id") int id, Model model) {
        MemberVO memberVO = memberService.getMember(id);
        model.addAttribute("u", memberVO);
        return "postform";
    }

    @RequestMapping(value="/editok", method = RequestMethod.POST)
    public String editPostOk(MemberVO vo) {
        if(memberService.updateMember(vo) == 0)
            System.out.println("데이터 수정 실패 ");
        else
            System.out.println("데이터 수정 성공 ");
        return "redirect:list";
    }

    @RequestMapping(value="/deleteok/{id}", method = RequestMethod.GET)
    public String deletePostOK(@PathVariable("id") int id) {
        if(memberService.deleteMember(id) == 0)
            System.out.println("데이터 삭제 실패 ");
        else
            System.out.println("데이터 삭제 성공 ");
        return "redirect:../list";
    }
}