package programmers.level2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// https://programmers.co.kr/learn/courses/30/lessons/92341
	
class CarInfo implements Comparable<CarInfo> {
	private String carNum;	// 차량번호
	private String state;	// IN or OUT
	private String lastTime;// 마지막 출입 시간
	private int parkingTime;// 총 주차시간

	public CarInfo() {}

	public CarInfo(String carNum, String state, String lastTime, int parkingTime) {
		this.carNum = carNum;
		this.state = state;
		this.lastTime = lastTime;
		this.parkingTime = parkingTime;
	}

	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getLastTime() {
		return lastTime;
	}

	public void setLastTime(String lastTime) {
		this.lastTime = lastTime;
	}
	
	public int getParkingTime() {
		return parkingTime;
	}

	public void setParkingTime(int parkingTime) {
		this.parkingTime = parkingTime;
	}

	@Override
	public int compareTo(CarInfo c) { // Comparator 비교 조건
		if(Integer.parseInt(this.carNum) > Integer.parseInt(c.carNum))
			return 1;
		else  if(Integer.parseInt(this.carNum) < Integer.parseInt(c.carNum))
			return -1;
		else
			return 0;
	}
	
}

public class ParkingFee {

	public static int convertMin(String time) { // "xx:xx" 시간을 분으로 변환
		return Integer.parseInt(time.substring(0, 2))*60 + Integer.parseInt(time.substring(3));
	}
	
	public static int[] solution(int[] fees, String[] records) {
		List<CarInfo> carList = new ArrayList<>();
		
		/* 출입 정보 리스트 */
		for(String r : records) {
			String lastTime = r.split(" ")[0];
			String carNum = r.split(" ")[1];
			
			if( carList.stream().noneMatch( o -> o.getCarNum().equals(carNum)) ) { // 리스트에 차량번호가 없으면
				carList.add( new CarInfo(carNum, "IN", lastTime ,0) );
			}
			else {
				CarInfo c = carList.stream()
						.filter( o -> o.getCarNum().equals(carNum))
						.findAny()
						.orElseThrow(() -> new IllegalArgumentException());
				
				if(c.getState().equals("IN")) {
					int parkingTime = convertMin(lastTime)-convertMin(c.getLastTime());
					c.setParkingTime( c.getParkingTime()+parkingTime);
					c.setState("OUT");
				}
				else {
					c.setState("IN");
				}
				c.setLastTime(lastTime);
			}
		}
		
		/* 출차(OUT) 없는 차량 처리 */
		for(CarInfo c : carList) {
			if(c.getState().equals("IN")) {
				int parkingTime = convertMin("23:59")-convertMin(c.getLastTime());
				c.setParkingTime( c.getParkingTime()+parkingTime);
			}
		}
		
		
		carList.sort(Comparator.naturalOrder());
	    int[] answer = new int[carList.size()];

	    /* 주차 요금 계산 */
	    for(int i=0; i<answer.length;i++) {
	    	int parkingTime = carList.get(i).getParkingTime();
	    	int fee;
	    	if(parkingTime <= fees[0]) // 기본 시간 이하
	    		fee = fees[1];
	    	else
	    		fee = fees[1] + (int)Math.ceil((parkingTime-fees[0])/(double)fees[2]) * fees[3];
	    	answer[i] = fee;
	    }
	    
	    return answer;
	    
	}

}
