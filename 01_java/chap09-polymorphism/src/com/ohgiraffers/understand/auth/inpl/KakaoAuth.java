package com.ohgiraffers.understand.auth.inpl;

import com.ohgiraffers.understand.dto.MemberDTO;

public class KakaoAuth implements SnsAuth {

    @Override
    public boolean login(MemberDTO member) {
        System.out.println("카카오로그인됨");
        return true;
    }
}
