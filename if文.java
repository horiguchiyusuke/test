
public class if文 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	int a=10;
	if(a<20){
	System.out.println("A");
	}

	int a2=20;
	if(a2<30){
	System.out.println("B");
	}


String c ="山田";
if(c.equals("山田")){
System.out.println( c+"さん");
}

int a3=5;
if(a3<10&&3<a3){
System.out.println("A");
}


int d=5;
if(d>=5||d<=0){
	System.out.println("B");
}

int e=7;
if(e>8){
	System.out.println("A");
}else if(e<10){
	System.out.println("B");
}

int f=11;
if(f>8){
	System.out.println("A");
}else if(f<10){
	System.out.println("B");
}

int g=3;
if(g>5){
	System.out.println("A");
}else{
	System.out.println("Z");
}

int h=20;
if(h<8){
	System.out.println("A");
}
else if(h==8){
	System.out.println("B");
}
else{
	System.out.println("C");
}

int i=18;
if(i>=20){
	System.out.println("成人");
}else{
	System.out.println("未成年");
}

int age=35;
if(age<20){
	System.out.println("未成年");
}else if(age>80){
	System.out.println("高齢者");
}else{
	System.out.println("成人");
}

int age2=35;
if(age2<20){
	System.out.println("未成年");
}else if(age2>=20&&age2<=80){
	System.out.println("成人");
}else{
	System.out.println("高齢者");
}

int j=5;
if(j%2==0){
	System.out.println("偶数");
}else{
	System.out.println("奇数");
}
	}

}
