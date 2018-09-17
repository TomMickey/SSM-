package cn.com.bonc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.bonc.dao.UserDao;
import cn.com.bonc.entity.UserInfo;

/**  
 *ClassName: UserServiceImpl 
 *Description: 
 *公司:东方国信 
 *@author lzy  
 *@date 2018年9月14日
*/
@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	@Override
	public void insert(UserInfo userInfo) {
		System.out.println(userDao+"123456");
		userDao.insert(userInfo);
	}
	@Override
	public UserInfo findById(Integer id) {
		return userDao.findUserById(id);
	}

}
