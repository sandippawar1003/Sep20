package Logical_programs;

public class Reverse_number_without_string_function {
	public static void main(String[] args) {
		
	
int num=12345;
int revNum=0;

while(num>0)
{
int rem=num%10;      //123%10=3
revNum=revNum*10+rem;    //54*10+rem=54321
num=num/10;            //12345/10=1234/10=123/10=12
}

System.out.println(revNum);
}}
