package com.omerfarukcavas.webservice;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.omerfarukcavas.pojo.Member;

@RestController
public class postExampleClass {

	@RequestMapping(value="/loadData",method=RequestMethod.POST)
	public ResponseEntity<List<Member>> loadMembers(@RequestBody List<Member> member){
		
		System.out.println(member);
		getExampleClass.memberList=member;
		return new ResponseEntity<List<Member>>(member,HttpStatus.OK);
	}
	
}




