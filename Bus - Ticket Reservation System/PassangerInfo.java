package lab11;

public class PassangerInfo {
String PassName;
String Des;
int PassNo;
int PassDis;
int FarePrice;

public PassangerInfo(String PassName,String Des,int Passno,int PDis,int fp){
	this.PassName=PassName;
	this.Des=Des;
	this.PassNo=Passno;
	this.PassDis=PDis;
	this.FarePrice=fp;
}

void SetPname(String PassName){
	this.PassName=PassName;
	
}
String GetPname(){
	return PassName;
}

void SetDes(String Des){
	this.Des=Des;
}
String GetDes(){
	return Des;
}

void Setfprice(int FarePrice){
	this.FarePrice=FarePrice;
}
int GetFprice(){
	return FarePrice;
}
void SetPassNo(int PassNo){
	this.PassNo=PassNo;
}
int GetPassNo(){
	return PassNo;
}
int GetPassDis(){
	return PassDis;
	}
void SetPassDis(int PassDis){
	this.PassDis=PassDis;
}	
}
