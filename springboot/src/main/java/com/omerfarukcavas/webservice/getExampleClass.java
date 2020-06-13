package com.omerfarukcavas.webservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.omerfarukcavas.pojo.Member;

@RestController
public class getExampleClass {

	public static List<Member> memberList=new ArrayList();
	
	@RequestMapping(value="/memberList",method=RequestMethod.GET)
	public List<Member> getMemberList(@RequestParam(value="marka",defaultValue="") String marka,
									  @RequestParam(value="model",defaultValue="") String model,
									  @RequestParam(value="sinif",defaultValue="") String sinif,
									  @RequestParam(value="key",defaultValue="") String key){
		
		
		List<Member> returnedMemberList=new ArrayList();  // results 
		
		
		// listede marka/model/sinif ara
		if(key.equals("")) {
			
			for(Member m:memberList) {
				if( (marka.equals(m.getMarka()) || marka.equals(""))   && 
					 (model.equals(m.getModel())|| model.equals(""))   && 
					 (sinif.equals(m.getSinif())|| sinif.equals("")) ){
					returnedMemberList.add(m);
				}
			}
			
		}
		
		
		// key e gore ara
		if(!key.equals("")) {
			
			for(Member m:memberList) {
				if(m.getMarka().contains(key) || m.getModel().contains(key) || m.getSinif().contains(key)){
					returnedMemberList.add(m);
				}
			}
			
		}
		
		
		return returnedMemberList;
		
	}
	
	
}
