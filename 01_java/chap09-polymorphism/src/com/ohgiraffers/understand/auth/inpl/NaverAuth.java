package com.ohgiraffers.understand.auth.inpl;

import com.ohgiraffers.understand.dto.MemberDTO;

public class NaverAuth implements SnsAuth {

    @Override
    public boolean login(MemberDTO member) {
        System.out.println("네이버로그인됨");
        return true;
    }
}
