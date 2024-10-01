package c06;

public class CalAvg {
	int[] points;
	
	CalAvg(int ...points){
		this.points=points;
	}
	
	//총합
	int getSum() {
		int sum=0;
		for(int point:points) {
			sum+=point;
		}
		return sum;
	}
	//평균
	double getAvg() {
		int sum=getSum();
		return (double)sum/points.length;
	}
	
	public static void main(String[] args) {
		CalAvg ca=new CalAvg(new int[] {80,70,60,99});
		System.out.println("평균점수: "+ca.getAvg());
	}

}