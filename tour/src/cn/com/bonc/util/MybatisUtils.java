package cn.com.bonc.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.catalina.Session;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**  
 *ClassName: MybatisUtils 
 *Description: 
 *公司:东方国信 
 *@author lzy  
 *@date 2018年9月14日
*/
public class MybatisUtils {

	private static SqlSessionFactory sqlSessionFactory=null;
	
	static {
		try {
			InputStream inputStream=Resources.getResourceAsStream("config/mybatis-config.xml");
			sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public MybatisUtils() {}
	
	public static SqlSession getSession() {
		return sqlSessionFactory.openSession();
	}
}
