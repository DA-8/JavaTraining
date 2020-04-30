
public class Q19 {
	public static void main(String[] args) {
		int time=11;
		int day=6;
		String dinner= (time > 10) ? (day>5 ? "Takeout" : "Salad") :"Leftovers";
		System.out.println(dinner);
	}
}
//condition1 ? truevalue1(condition2 ? truevalue2 : falsevalue2):falsevalue1
//in the question , conditioan2 is the int value. It has to be boolean.