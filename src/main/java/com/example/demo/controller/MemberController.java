package com.example.demo.controller;

import com.example.demo.model.Member;
import com.example.demo.repository.MemberRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/members")
public class MemberController {

    private final MemberRepository memberRepository;

    // 透過建構子注入 Repository
    public MemberController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    // GET /members/{id}
    @GetMapping("/{id}")
    public Optional<Member> getMemberById(@PathVariable Long id) {
        return memberRepository.findById(id);
    }
}
