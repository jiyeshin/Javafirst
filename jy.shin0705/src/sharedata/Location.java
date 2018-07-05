package sharedata;

public class Location {
	public double latitude;
	public double longitude;

/*	//생성자를 이용한 데이터 전달
	public void getLocation() {
		Map map=new Map(latitude, longitude);
		map.showMap();
	}*/
	
	public void getLocation() {
		Map map=new Map();
		map.setLatitude(latitude);
		map.setLongitude(longitude);
		
		map.showMap();
	}
	
}
