package day10.innerClass.test4;
//找小写的类
public class FindXxString2 implements FindString2{
	
	public boolean checkChar(char ch){
		if(ch>='a'&&ch<='z'){
			return true;
		}
		return false;
	}
}