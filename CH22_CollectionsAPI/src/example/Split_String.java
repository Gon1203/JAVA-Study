package example;

public class Split_String {

	public static void main(String[] args) {
		// split() 문자열 쪼개서 배열로 리턴
		String text1 = "As the world learns more about the Omicron coronavirus variant and Delta continues to cause Covid-19 cases to rise around much of the United States, the need for booster shots becomes clearer than ever -- even beyond the growing data about waning vaccine immunity.";
		String text2 = "그 결과 오징어 게임은 국내외 종합 검색어 순위에서 모두 10위권 안에 포함됐다. 세부적으로 보면 국내 종합 검색어 순위에서는 3위를, 세계 종합 검색어 순위에서는 9위를 각각 차지했다.\n"
				+ "오징어 게임은 참가자들이 456억원의 상금을 차지하고자 목숨을 걸고 생존 게임을 벌이는 내용이다. 올해 전 세계적으로 커다란 인기를 끌며 오징어 게임 신드롬을 불러일으켰다. 여러 쟁쟁한 후보를 제치고 전 세계에서 가장 많은 주목을 받은 TV 프로그램 1위에 오르기도 했다.";

		String[] words = text1.split("[^a-zA-Z]+"); // 영문철자를 제외한 특수문자 스페이스 점 슬래시 같은 것들을 제외하고 단어만 리턴
		String[] words2 = text2.split("[^가-힣]+"); // 정규 표현식
		for (String w : words) {
			if (w.length() < 3) {
				continue;
			}
			System.out.println(w.toLowerCase()); // 소문자로 변환해서 출력
		}
		System.out.println();
		for (String w : words2) {
			System.out.println(w);
		}
	}

}
