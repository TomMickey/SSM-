package cn.com.bonc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.com.bonc.entity.UserInfo;

/**  
 *ClassName: UserDao 
 *Description: 
 *公司:东方国信 
 *@author lzy  
 *@date 2018年9月14日
*/
@Repository
public interface UserDao {
	
	UserInfo findUserById(Integer id);
	
	void insert(UserInfo userInfo);
}
