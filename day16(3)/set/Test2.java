package day16.set;

import java.util.HashSet;
import java.util.Set;

public class Test2 {
	public static void main(String[] args) {
		
		/**
		 * list遍历元素-3种
		 * a）普通for
		 * b）增强for
		 * c）迭代器
		 * 
		 * 
		 * set遍历元素-2种（不能用普通for=没有下标）
		 * b）增强for
		 * c）迭代器
		 * 
		 */
		
		dome1();
	}

	/**
	 * 需求2-
把如下所有账号和密码装入容器中
用户名        密码
   
liuyan1              111
liuyan2           111
liudehua1           222
--->错误数据
liuyan1       333
liuyan1       222
	 */
	
	/**
	 * 
  a)增：add();  添加失败-》返回false，成功-》返回true
  b)删除：boolean remove(Object o)；删除失败-》返回false，成功-》返回true
    删除全部：clear()；
  c)获得总个数：size();   
  e)判断元素是否存在：contains(Object o) 
  
  
  注意点：list。set。map容器中，凡是用到比较元素的内容的地方-都是使用equals加hashcode来判断。
  
	 */
	private static void dome1() {
		//创建装user的hashset实现的set容器
		Set<User> userSet=new HashSet<User>();
		/**
		 * 添加 add
		 */
		System.out.println(userSet.add(new User("liuyan1", "111")));
		System.out.println(userSet.add(new User("liuyan2", "111")));
		System.out.println(userSet.add(new User("liudehua1", "222")));
		System.out.println(userSet.add(new User("liuyan1", "333")));
		System.out.println(userSet.add(new User("liuyan1", "222")));
		System.out.println("set的数据1："+userSet);
		System.out.println("set元素数量："+userSet.size());
		/**
		 * 删除 remove
		 */
		//删除- liuyan1 111
		userSet.remove(new User("liuyan1", "98213"));
		System.out.println("set的数据2："+userSet);
		System.out.println("set元素数量："+userSet.size());
		
		/**
		 * 是否包含指定元素
		 */
		//加入 liudehua1
		if(!userSet.contains(new User("liudehua1", "5555"))){//没有 liudehua1
			//加入
			userSet.add(new User("liudehua1", "5555"));
		}

		//加入 libingbing
		if(!userSet.contains(new User("libingbing", "5555"))){//没有 liudehua1
			//加入
			userSet.add(new User("libingbing", "5555"));
		}
		

		System.out.println("set的数据3："+userSet);
		System.out.println("set元素数量："+userSet.size());
	}
}
/**
用户类
*/
class User{
	String userName;
	String userPwd;
	public User(String userName, String userPwd) {
		this.userName = userName;
		this.userPwd = userPwd;
	}
	@Override
	public String toString() {
		return "\nUser [userName=" + userName + ", userPwd=" + userPwd + "]";
	}
	/**
	 * 判断元素内容相同：通过【名字】
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
	
	
}
