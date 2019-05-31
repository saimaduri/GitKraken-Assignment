public class RunnerPartnerB implements PerfectSquare{
	public RunnerPartnerB(){
		System.out.println(perfectSquare(64));
	}
	public boolean perfectSquare(int perfectSquare){
		for(int x=0;x<perfectSquare;x++){
	    	if(x*x==perfectSquare)
	    	    return true;
	        }
	    return false;
	}
	public static void main(String[] args){
		RunnerPartnerB app=new RunnerPartnerB();
	}
}