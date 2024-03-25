package com.javaex.oop.tv.v1;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public TV(int channel, int volume, boolean power) {
		this.channel=channel;
		this.volume=volume;
		this.power=power;
	}
	
	public TV () {
		
	}
	
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}
	
	public void power(boolean power) {
		this.power=power;
	}
	public void channel(int channel) {
		if (channel<=255 && channel>=1) {
			this.channel=channel;
		}
	}
	
	public void channel(boolean up) {
		if (channel<=255 && channel>=1) {
			if (up==true) {
				channel+=1;
			}
			else {
				channel-=1;
			}
			
		}
	}
	public void volume(int volume) {
		if (volume>=0&&volume<=100) {
			this.volume=volume;
		}
	}
	public void volume(boolean up) {
		if (volume>=0&&volume<=100) {
		if (up==true) {
			volume+=1;
		}
		else {
			volume-=1;
		}
		}
	}
	public void status() {
		System.out.printf("현재 채널은 %d, 현재 볼륨은 %d, 전원은 %s%n",channel,volume,power);
	}
}
