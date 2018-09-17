package cn.com.bonc.service;

import cn.com.bonc.entity.UserInfo;

/**  
 *ClassName: UserService 
 *Description: 
 *公司:东方国信 
 *@author lzy  
 *@date 2018年9月14日
*/
public interface UserService {

	void insert(UserInfo userInfo);
	
	UserInfo findById(Integer id);
}
