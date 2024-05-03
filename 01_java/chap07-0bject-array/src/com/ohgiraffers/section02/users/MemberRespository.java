package com.ohgiraffers.section02.users;


public class MemberRespository {

    private final static Member[] members;
    private static int count;

    static {

        members = new Member[10];

    }

    public static boolean store(Member[] newMembers) {
        for(int i = 0; i < newMembers.length; i++) {
            members[count++]=newMembers[i];
        }
        return true;
    }

    public static Member[] findAllMembers (){
        return members;
    }

}
