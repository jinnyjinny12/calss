package com.ohgiraffers.understand.auth.inpl;

import com.ohgiraffers.understand.dto.MemberDTO;

public interface SnsAuth {

    boolean login(MemberDTO member);
}
