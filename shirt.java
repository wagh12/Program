//constustor overlloding

class shirt 
{
	String size;
	String color;
	int prise;
	
	shirt(){
		this.size="XL";
		this.color="black";
		this.prise=3333;
	}
	shirt(String s){
		size=s;
		this.color="Black";
		prise=2222;
	}
	shirt(String s,String c,int p){
		size=s;
		color=c;
		prise=p;
	}
	void display(){
				System.out.println("A "+" size is:"+size+" color is:"+color+" prise is:"+prise);
	}
		void display(String c ,String s,int p){
			color=c;
			size=s;
			prise=p;
				System.out.println("A "+" size is:"+size+" color is:"+color+" prise is:"+prise);
	}
	public static void main(String[] args) 
	{
       shirt s1=new shirt();
	   shirt s2=new shirt("XLL");
	   shirt s3=new shirt("XLLL"+"Black"+888);
	   
	   s1.display();
	   s2.display();
	   s3.display("Red","XLLLLLL",666666);
	}
}
