package for文;

public class for文応用 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

for(int i=1;i<=10;i++){
	if(i%2==0){
		System.out.println(i);
	}
}
	
for(int a=0;a<3;a++){
	for(int b=1;b<4;b++){
		System.out.println(b);
	}
}

int c=10;
String d =c>=0?"プラス":"マイナス";
System.out.println(d);

int e=2;
String f=e%2==0?"偶数":"奇数";
System.out.println(f);

for(int i1=0;i1<=5;i1++){
	String g=i1%2==0?"☆":"★";
	System.out.println(g);
}




	}

}
