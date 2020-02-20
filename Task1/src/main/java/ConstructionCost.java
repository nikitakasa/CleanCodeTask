public class ConstructionCost {
    final static int StandardCost=1200;
    final static int aboveStandardCost=1500;
    final static int  highStandardCost=1500;
    final static int highStdAndAutomatedCost=1500;
    int standard,totalarea;
    ConstructionCost(int std,int totalarea){
    	standard=std;
    	this.totalarea=totalarea;
    	}
    int getConstructionCost(){
    	switch(standard){
    	case 1 : return StandardCost*totalarea;
    	case 2:return aboveStandardCost*totalarea;
    	case 3:return highStandardCost*totalarea;
    	case 4:return highStdAndAutomatedCost*totalarea;
    	default:return -1;
    	}
    }
}
