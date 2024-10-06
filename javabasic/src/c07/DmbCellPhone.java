package c07;

public class DmbCellPhone extends CellPhone {
	
	private int channel;
	
	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public static void main(String[] args) {
		DmbCellPhone dcp=new DmbCellPhone();
		dcp.setModel("자바폰");
		dcp.setColor("검정");
		dcp.powerOn();
	}
	
}







