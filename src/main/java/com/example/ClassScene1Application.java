package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClassScene1Application {
	
	  Scanner in=new Scanner(System.in);
	  int count=0;
	  List<Integer>signedList=new ArrayList<>();

	@Test
	public  void test1() {
		SpringApplication.run(ClassScene1Application.class);
		while(true) {
			System.out.println("请选择\n1、签到\n2、查询\n3、统计");
			switch(in.nextInt()){
			case 1:
				sign();
				break;
			case 2: 
				inquire();
				break;
			case 3:
				count();
				break;
			default:
				System.out.println("请选择正确的选项(1、2或3)");
				break;
			}
		}
	}
	
	private   void sign() {
		List<Integer>IdList=new ArrayList<Integer>();
		IdList.add(2017001);
		IdList.add(2017002);
		IdList.add(2017003);
		System.out.println("请输入您的工号");
		int nextInt = in.nextInt();
		for (Integer id : IdList) {
			if(nextInt==id) {
				System.out.println("签到成功");
				count++;
				signedList.add(id);	
				break;
			}else {
				System.out.println("该工号不存在");
			}
			}
		}
	
	private  void inquire() {
		System.out.println("请输入需要查询的工号");
		int nextInt = in.nextInt();
		for (Integer signedId : signedList) {
			if(nextInt==signedId) {
				System.out.println("已签到");
				break;
			}else {
				System.out.println("未签到");
			}
		}
	}

	private  void count() {
		System.out.println("共有"+signedList.size()+"人已签到");
	}
	
}
