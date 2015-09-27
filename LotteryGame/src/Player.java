import java.util.ArrayList;
import java.util.HashMap;

public class Player {
	public long ID;
	public byte num1;
	public byte num2;
	public byte num3;
	public byte num4;
	public byte num5;


	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(long iD, byte num1, byte num2, byte num3, byte num4, byte num5) {
		super();
		ID = iD;
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
		this.num5 = num5;
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public byte getNum1() {
		return num1;
	}

	public void setNum1(byte num1) {
		this.num1 = num1;
	}

	public byte getNum2() {
		return num2;
	}

	public void setNum2(byte num2) {
		this.num2 = num2;
	}

	public byte getNum3() {
		return num3;
	}

	public void setNum3(byte num3) {
		this.num3 = num3;
	}

	public byte getNum4() {
		return num4;
	}

	public void setNum4(byte num4) {
		this.num4 = num4;
	}

	public byte getNum5() {
		return num5;
	}

	public void setNum5(byte num5) {
		this.num5 = num5;
	}

}
