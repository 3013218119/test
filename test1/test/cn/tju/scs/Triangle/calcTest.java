package cn.tju.scs.Triangle;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class calcTest{
	private int input1;
	private int input2;
	private int input3;
	private String expected;
	private Calc cal=null;
	
	public calcTest(int input1,int input2,int input3,String expected){
		this.input1=input1;
		this.input2=input2;
		this.input3=input3;
		this.expected=expected;
	}

@Before 
public void setUp(){
	cal=new Calc();
}

@Parameters
public static Collection<Object[]>getData(){
	return Arrays.asList(new Object[][]{
		{1,2,3,"not a triangle"},
		{5,5,5,"equilateral"},
		{5,5,4,"isosceles"},
		{3,5,3,"isosceles"},
		{5,6,6,"isosceles"},
		{4,6,5,"scalene"},
		{2,3,4,"scalene"},
		{7,6,5,"scalene"}
	});
}
@Test
public void testsides()
{
	assertEquals(this.expected,cal.judge(input1,input2,input3));
}
}
