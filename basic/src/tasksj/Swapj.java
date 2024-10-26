package tasksj;

public class Swapj {
	void wapValuesUsingThirdVariable(int x, int y)
	{
		int temp=x;
		x=y;
		y=temp;
	}
	
	
    public static void main(String[] args)
    {
        
    	Swapj s = new Swapj();
        int a = 10, b = 20;

 
       s.wapValuesUsingThirdVariable(a, b);
    }

}