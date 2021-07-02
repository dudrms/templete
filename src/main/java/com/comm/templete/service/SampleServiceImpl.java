package com.comm.templete.service;

import java.util.List;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comm.templete.dao.UserMapper;
import com.comm.templete.vo.User;
@Service
public class SampleServiceImpl implements SampleService {

	@Autowired
	UserMapper um;
	
	@Override
	public List<User> func() {
		// TODO Auto-generated method stub
		
		//return data
		List<User> user = um.listUser();
		
		//get values
		System.out.println(user.get(0).id);
		System.out.println(user.get(0).order_id);
		
		//make a test file
		try {
            
			FileOutputStream fileOutputStream = new FileOutputStream("filename.txt");
			OutputStreamWriter OutputStreamWriter = new OutputStreamWriter(fileOutputStream, "EUC-KR");
			BufferedWriter bufferedWriter = new BufferedWriter(OutputStreamWriter);
			
            String text = "239r8hwf348hgrj안녕하세요";
            
            bufferedWriter.write(text);
            bufferedWriter.newLine();
            bufferedWriter.close();
            
		} catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}
		
		//return um.listUser();
		return user;
	}

}
