package switch文;

public class Switch文 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
int a =1;
switch(a){
case 0:
System.out.println("aは0に等しい");
break;

case 1:
	System.out.println("aは1に等しい");
break;
}
		
int b =5;
switch(b){
case 0:
System.out.println("bは0に等しい");
break;
case 1:
System.out.println("bは1に等しい");
break;
default:
	System.out.println("bは0でも1でもない");
}

String c="赤";

switch(c){
case"赤":
System.out.println("赤組です");
break;

case"白":
	System.out.println("白組です");
break;
}

String d="青";
switch(d){
case"赤":
System.out.println("赤組です");
break;
case"白":
System.out.println("白組です");
break;
default:
System.out.println("エラーです");
}


		
	}

}
