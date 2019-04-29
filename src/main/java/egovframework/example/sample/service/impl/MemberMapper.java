package egovframework.example.sample.service.impl;

import egovframework.example.sample.service.MemberVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("memberMapper")
public interface MemberMapper {
	void insert(MemberVO memberVO) throws Exception;
	
}
