/**
 * 普通数组的Java代码
 * @author dream
 *
 */
public class GeneralArray {

	private int[] a;
	private int size;   //数组的大小
	private int nElem;   //数组中有多少项
	
	public GeneralArray(int max){
		this.a = new int[max];
		this.size = max;
		this.nElem = 0;
	}
	
	public boolean find(int searchNum){   //查找某个值
		int j;
		for(j = 0; j < nElem; j++){
			if(a[j] == searchNum){
				break;
			}
		}
		if(j == nElem){
			return false;
		}else {
			return true;
		}
	}
	
	
	public boolean insert(int value){   //插入某个值
		if(nElem == size){
			System.out.println("数组已满");
			return false;
		}
		a[nElem] = value;
		nElem++;
		return true;
	}
	
	public boolean delete(int value){   //删除某个值
		int j;
		for(j = 0; j < nElem; j++){
			if(a[j] == value){
				break;
			}
		}
		if(j == nElem){
			return false;
		}
		if(nElem == size){
			for(int k = j; k < nElem - 1; k++){
				a[k] = a[k+1];
			}
		}else {
			for(int k = j; k < nElem; k++){
				a[k] = a[k+1];
			}
		}
		nElem--;
		return true;
	}
	
	public void display(){   //打印整个数组
		for(int i = 0; i < nElem; i++){
			System.out.println(a[i] + " ");
		}
		System.out.println("");
	}
}
