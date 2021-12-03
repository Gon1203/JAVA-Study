package game.objects;

public enum GameObject {
	// name, id
	가위,바위,보;
	private int[][] comparison = { 
					//가위, 바위, 	보 
/*가위*/			{ 0,	-1,		 1 }, 
/*바위*/			{ 1,	 0,	 	-1 }, 
/*보*/				{ -1,	 1,		 0 }
	};
	
	// 상대의 가위 바위 보와 비교해서 결과 리턴
	public int compare(GameObject ob) {
		return comparison[this.ordinal()][ob.ordinal()];
	}


}
