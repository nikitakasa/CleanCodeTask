public class CompoundInterest {
  double amount,principal,irate,time,n;
  public CompoundInterest(double principal,double irate,double time,double n) {
	  this.principal=principal;
	  this.irate=irate;
	  this.time=time;
	  this.n=n;
  }
  double getCompoundInterest() {
	  amount = principal * Math.pow(1 + (irate / (n*100)), n * time);
	  return amount - principal;
  }
  
}
