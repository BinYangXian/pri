package day20.moniList;

/**
 * List接口：
 * 规范了list的容器具有的功能（添加，获取，删除....）
 * 功能具体的实现-》需要它的实现类来提供
 */

public interface MyList1{
	 //添加
	 boolean add(Object e);
	 //获取
	 Object get(int index);
 	 //修改
	 Object set(int index, Object element);
	 //删除
	 Object remove(int index);
	 //插入
	 void add(int index, Object element);
	 //元素数量
	 int size() ;
	 
}
