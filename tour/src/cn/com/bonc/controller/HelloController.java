package cn.com.bonc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.bonc.entity.UserInfo;
import cn.com.bonc.service.UserService;

/**  
 *ClassName: HelloController 
 *Description: 
 *公司:东方国信 
 *@author lzy  
 *@date 2018年9月14日
*/
@Controller
public class HelloController {
	@Autowired
	private UserService userService;
	@RequestMapping("/hello.do")
	public String hello(Integer id) {
		System.out.println(id);
		UserInfo userInfo=userService.findById(id);
		System.out.println(userInfo);
		return "hello";
	}
	@RequestMapping("/hi.do")
	public String hi(UserInfo userInfo) {
		userService.insert(userInfo);
		System.out.println(userInfo);
		return "hello";
	}
}
