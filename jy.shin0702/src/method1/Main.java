package method1;

public class Main {

	public static void main(String[] args) {
	Job.display();

	int x=10;
	//메소드에 value형의 데이터를 넘겨주었다.
	//절대로 넘겨준 데이터에 변화가 일어나지 않는다
	Job.incValue(x);
	System.out.println(x); //value형은 변경 없이 10이 나옴.
	
	int[]ar= {100,200};
	//메소드에 reference형의 데이터를 넘겨주었다.
	//넘겨준 데이터에 변화가 일어날 수도 있다.
	//이러한 경우는 document를 읽어보거나 데이터를 찍어봐서 확인해야한다. 
	Job.incReference(ar);
	System.out.println(ar[0]); 
	
	
	Job blahblah=new Job();
	System.out.println(blahblah.sum(100));
	
	System.out.println(blahblah.pivotRecursion(100));
	System.out.println(blahblah.pivotNoRecursion(100));
	
	}

}
