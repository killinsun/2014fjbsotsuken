package jp.ac.fjb.onsen.bean;

import java.util.ArrayList;
import java.util.Calendar;

public class OnsenYoyakuBean {

	private int ninzu = 1;		//�\��l��
	private int heyasuu = 1;	//�\�񕔉���
	private ArrayList<String> yoyakuDay;	//�\�����

	//�R���X�g���N�^
	public OnsenYoyakuBean() {
	}

	//getter, setter
	public int getNinzu() {
		return ninzu;
	}

	public void setNinzu(int ninzu) {
		this.ninzu = ninzu;
	}

	public int getHeyasuu() {
		return heyasuu;
	}

	public void setHeyasuu(int heyasuu) {
		this.heyasuu = heyasuu;
	}

	public ArrayList<String> getYoyakuDay() {
		return yoyakuDay;
	}

	public void setYoyakuDay(ArrayList<String> yoyakuDay) {
		this.yoyakuDay = yoyakuDay;
	}

}