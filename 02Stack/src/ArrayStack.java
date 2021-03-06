/**
 * 栈是先进后出
 * 只能访问栈顶的数据
 * @author dream
 *
 */

/**
 * 基于数组来实现栈的基本操作
 * 数据项入栈和出栈的时间复杂度均为O(1)
 * @author dream
 *
 */
public class ArrayStack {

	private long[] a;
	private int size;   //栈数组的大小
	private int top;   //栈顶
	
	public ArrayStack(int maxSize){
		this.size = maxSize;
		this.a = new long[size];
		this.top = -1;   //表示空栈
	}
	
	public void push(long value){   //入栈
		if(isFull()){
			System.out.println("栈已满!");
			return;
		}
		a[++top] = value;
	}
	
	public long peek(){   //返回栈顶内容，但不删除
		if(isEmpty()){
			System.out.println("栈中没有数据");
			return 0;
		}
		return a[top];
	}
	
	
	public long pop(){   //弹出栈顶内容
		if(isEmpty()){
			System.out.println("栈中没有数据!");
			return 0;
		}
		return a[top--];
	}
	
	public int size(){
		return top + 1;
	}
	
	/**
	 * 判断是否满了
	 * @return
	 */
	public boolean isFull(){
		return (top == size - 1);
	}
	
	/**
	 * 是否为空
	 * @return
	 */
	public boolean isEmpty(){
		return (top == -1);
	}
	
	
	public void display(){
		for (int i = top; i >= 0; i--) {
			System.out.println(a[i] + " ");
		}
		System.out.println("");
	}
	
}
