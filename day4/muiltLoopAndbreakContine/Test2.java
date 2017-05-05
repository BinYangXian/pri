
public class Test2{
	
	public static void main(String args[]){
		/**
		 break和continue关键字
		 作用——》动态的在循环内部里结束循环
		 
		 break：默认结束包裹break的循环结构剩余的所有次循环。
		 -》执行break之后，后面的所有的次循环都不会执行，直接离开循环结构。
		 continue：默认结束包裹continue的循环结构1次循环。
		 -》执行continue之后，当前次数剩余循环内容不执行，直接进入下一次循环执行。
		
		*/
		dome3();
	}
	/**
1    12345
3    12345       
4    12345
6    12345
	*/
	public static void dome3(){
		System.out.println("方式1：在打印的时候，排除2和5行不打印");
		for(int num=1;num<=6;num++){
			
			//第2行和第5行-不能打印
			if(num!=2&&num!=5){
				//打印一行内容 
				System.out.println(num+"\t12345");
			}
		}
		System.out.println("方式2：在打印之前，排除2和5行不打印");
		for(int num=1;num<=6;num++){
			
			//第2行或第5行-提前结束（跳过当次的打印）
			if(num==2||num==5){
				continue;
			}
			//打印一行内容 
			System.out.println(num+"\t12345");
			
		}
	}
	/**
break结束当前包裹的循环

1    12345
2    12345
3    12345 --提前结束
4    12345
5    12345
6    12345
	*/
	public static void dome2(){
		/**
			方式1：改变循环条件
		*/
		System.out.println("----------方式1：改变循环条件-------------");
		for(int num=1;num<=3;num++){
			//打印一行内容 
			System.out.println(num+"\t12345");
		}
		/**
			方式2：（不考虑循环条件次数）执行到要求的循环次数-利用break提前结束循环
		*/
		System.out.println("----------方式2：利用break提前结束循环-------------");
		for(int num=1;true;num++){
			//打印一行内容 
			System.out.println(num+"\t12345");
			//第3行打印完成-结束循环 
			if(num==3){
				break;
			}
		}
		
	}
	/**
	打印如下图形
	
1    12345
2    12345
3    12345
4    12345
5    12345
6    12345
	*/
	public static void dome1(){
		
		for(int num=1;num<=6;num++){
			//打印一行内容 
			System.out.println(num+"\t12345");
		}
		
	}
}
