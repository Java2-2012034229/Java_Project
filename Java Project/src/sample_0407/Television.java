package sample_0407;

public class Television {
	int channel;
	int volume;
	boolean onOff;
	
	public Television(){
		this(10,20,false);
		//this.channel=10;
		//this.volume=10;
		//this.onOff=true;
	
	}
	
	public Television(int channel, int volume, boolean onOff){
		this.channel=channel;
		this.volume=volume;
		this.onOff=onOff;
	}
	
	void pr(){
		System.out.println(channel+" "+volume+" "+onOff);
		
		
	}

int changeChannel(int ch){
	channel = ch;
	return channel;
}
}