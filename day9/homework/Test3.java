package day9.homework;

public class Test3 {
	public static void main(String[] args) {
		/**
		 * 练习：
定义如下类
User类

属性：
名字String
地址String
是否结婚boolean

重写toString    把对象的  名字和地址的信息
重写hashcode  以（名字加是否结婚）来判断内容相同
重写equals    以（名字加是否结婚）来判断内容相同
		 */
	}
}
class User{
	String name;
	String addr;
	boolean isMarryed;
	
	/**
	 * 
重写toString    
把对象的  名字和地址的信息
	 */
	@Override
	public String toString() {
		return "User [name=" + name + ", addr=" + addr + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isMarryed ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (isMarryed != other.isMarryed)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}