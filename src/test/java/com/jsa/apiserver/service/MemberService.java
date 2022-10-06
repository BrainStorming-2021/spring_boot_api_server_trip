package com.jsa.apiserver.service;

import com.jsa.apiserver.model.dao.MemberDao;
import com.jsa.apiserver.model.dto.MemberDto;
import com.jsa.apiserver.model.dto.RequestMemberDto;

import java.util.List;

public interface MemberService {
    public List<MemberDao> selectMember(RequestMemberDto _requestData);
    public boolean updateMember(RequestMemberDto _requestData);
    public boolean insertMember(RequestMemberDto _requestData);
}
