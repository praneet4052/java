package org.phone;

public class PhoneInfo {
	private void phoneName() {
		System.out.println("samsung");
	}
	private void phoneMieiNum() {
		System.out.println("35498411681016");
	}
	private void Camera() {
		System.out.println("sensor");
	}
	private void storage() {
		System.out.println("64GB");
	}
	private void osName() {
		System.out.println("linux");
	}
	public static void main(String[] args) {
		PhoneInfo p=new PhoneInfo();
		p.phoneName();
		p.phoneMieiNum();
		p.Camera();
		p.storage();
		p.osName();
	}

}
