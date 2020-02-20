public class SimpleInterest {
	double principal,rate,time;
	public SimpleInterest(double principal, double rate,double time) {
		this.principal=principal;
		this.rate=rate;
		this.time=time;
	}
    public double getSimpleInterest(){
    	return (principal*time*rate)/100;
    }
}
