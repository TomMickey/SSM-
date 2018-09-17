package cn.com.bonc.entity;

/**  
 *ClassName: UserInfo 
 *Description: 
 *公司:东方国信 
 *@author lzy  
 *@date 2018年9月14日
*/
public class UserInfo {

	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserInfo [username=" + username + ", password=" + password + "]";
	}
	
}
