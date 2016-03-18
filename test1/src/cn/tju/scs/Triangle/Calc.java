package cn.tju.scs.Triangle;

public class Calc {
	public String judge(int input1,int input2,int input3){
		if(input1+input2<=input3||input1+input3<=input2||input2+input3<=input1)
		{
			return "not a triangle";
		}
		if(input1==input2&&input1==input3){
			return "equilateral";
		}
		else if(input1==input2||input1==input3||input2==input3)
		{
			return "isosceles";
		}
		return "scalene";
	}

}
