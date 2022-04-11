package Scheduler;

public class RoundRobin implements Scheduler {
	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("상담 전화 를 순서대로 대기열에서 가져옵니다");	
	}
	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("다음 순서 상담원에세 배분합니다.");
	}
}
