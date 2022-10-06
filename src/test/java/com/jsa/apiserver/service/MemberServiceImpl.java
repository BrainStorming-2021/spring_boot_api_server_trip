package com.jsa.apiserver.service;

import com.jsa.apiserver.model.dao.MemberDao;
import com.jsa.apiserver.model.dto.RequestMemberDto;

import java.util.List;

public class MemberServiceImpl implements MemberService {
    @Override
    public List<MemberDao> selectMember(RequestMemberDto _requestData) {
        return null;
    }

    @Override
    public boolean updateMember(RequestMemberDto _requestData) {
        return false;
    }

    @Override
    public boolean insertMember(RequestMemberDto _requestData) {
        return false;
    }
}
