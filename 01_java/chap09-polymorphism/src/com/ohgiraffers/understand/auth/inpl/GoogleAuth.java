package com.ohgiraffers.understand.auth.inpl;

import com.ohgiraffers.understand.dto.MemberDTO;

public class GoogleAuth implements SnsAuth {

    @Override
    public boolean login(MemberDTO member) {

        System.out.println("구글로그인 성공됨");
        return true;
    }
}
