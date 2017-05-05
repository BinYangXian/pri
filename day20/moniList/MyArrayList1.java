package day20.moniList;

import java.util.Arrays;


/**
 * MyArrayList类是mylist的实现类-》提供了（具体的-添加，删除...）的功能
 * 
 *MyArrayList对象要存储元素的数据
 *--》底层通过数组来存储数据
 *
 *
 *
 *list容器：元素绑定下标，通过下标找到元素
 *
 *下标范围：0到size-1
 */

public class MyArrayList1 implements MyList1 {
	
	//每一个MyArrayList1对象都需要一个数组存储数据
	//->成员变量->数组初始化10个长度-不够-可以扩容
	private Object[] elements=new Object[10];
	//定义记录MyArrayList1对象容器里元素数量的变量
	//每一个MyArrayList1对需要-》成员变量
	private int size=0;
	
	//添加-把数据添加到当前arrlist的数组里（添加到list的尾部）
	@Override
	public  boolean add(Object e) {
		//自动扩容-检查长度-不够-自动copy
		if(this.size==this.elements.length){
			//扩容
			//1)copy数据到新数组
			Object[] newElements= Arrays.copyOf(this.elements, this.elements.length*2);
			//2)arrayList关键的数组指向新数组
			this.elements=newElements;
		}
		
		//装数据
		this.elements[this.size]=e;
		
		//休息500毫秒
		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//元素数量+1
		this.size++;
		return true;
	}
	//获取
	@Override
	public Object get(int index) {
		//检查下标
		this.checkIdx(index);
		//取出数组的数据
		Object ele= this.elements[index];
		//返回数据
		return ele;
	}
	//检查下标的功能
	private void checkIdx(int index){
		//检查下标是否（0到size-1）-不是没有对应数据-抛异常
		if(index<0||index>this.size-1){
			//抛异常-下标越界的异常
			throw new IndexOutOfBoundsException("arrlist在get数据下标越界！！");
		}
	}
	//修改
	@Override
	public Object set(int index, Object element) {
		return null;
	}
	//删除
	@Override
	public Object remove(int index) {
		//检查越界
		this.checkIdx(index);
		/**
		 * 删除-利用copy:把删除位置后面的元素  copy  到删除的位置
		 */
		//取出删除的元素
		Object oldEle=this.elements[index];
		//删除
		System.arraycopy(this.elements, index+1, this.elements, index, this.size-1-index);
		//元素数量-1
		this.size--;
		return oldEle;
	}
	//插入
	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub

	}
	//元素数量
	@Override
	public int size() {
		return this.size;
	}
	@Override
	public String toString() {
		return "MyArrayList1 [elements=" + Arrays.toString(this.elements)
				+ ", size=" + this.size + "]";
	}
	
	//把当前arraylist所有的元素数据-拼接为字符串
	
	

}
