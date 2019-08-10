package com.text.User;//∂®“ÂVO¿‡

public class User {
	
	private String userid;
	private String name;
	private String password;
	private String title;
	private String tips;
	private String lostdescr;
	private String infor;
	
	public String getUserid(){
		return userid;
	}
	
	public void setUserid(String userid){
		this.userid=userid;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password=password;
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String title){
		this.title=title;
	}
	
	public String getTips(){
		return tips;
	}
	
	public void setTips(String tips){
		this.tips=tips;
	}
	
	public String getLostdescr(){
		return lostdescr;
	}
	
	public void setLostdescr(String lostdescr){
		this.lostdescr=lostdescr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", name=" + name + ", password=" + password + "]";
	}

	public String getInfor(){
		return infor;
	}
	
	public void setInfor(String infor) {
		this.infor=infor;		
	}

}
