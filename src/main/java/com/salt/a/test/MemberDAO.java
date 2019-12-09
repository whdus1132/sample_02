package com.salt.a.test;

import java.util.List;
 
public interface MemberDAO {
    
    public List<MemberVO> selectMember() throws Exception;
}