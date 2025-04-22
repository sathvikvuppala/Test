public class TestClass {
	//int[] arr= {3,5,2,1};
	public static void main(String[] args) {
		int[] arr= {3,4,3,5,3,6};
		Map<Integer,Long> countMap=
				Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),
						Collectors.counting()));
		System.out.println(countMap);
	}
}
