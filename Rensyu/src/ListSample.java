import java.util.ArrayList;
import java.util.List;


public class ListSample {


 public static void main(String[]args){
 List<String>list=new ArrayList<String>();
 
 //�l�̋L���� add ���\�b�h�𗘗p
  list.add("1");
  list.add("2");
  list.add("3");
  list.add("4");
  list.add("5");
 
 
 //�l�̎擾
  for (int i =0;i<list.size();i++){
	//�l�̎擾��get���\�b�h�𗘗p
	 System.out.println(list.get(i));
  }
 
 
 
 
 
  //�g�� for ���𗘗p����Ƃ����ƊȒP
  for (String s :list){
	System.out.println(s);
 }
  
 }
}
