package day10.innerClass.test4;
//找135的类
public class Find135String2 implements FindString2{
	
	public boolean checkChar(char ch){
		if(ch=='1'||ch=='3'||ch=='5'){
			return true;
		}
		return false;
	}
}