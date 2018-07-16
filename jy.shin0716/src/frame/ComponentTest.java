package frame;

import java.awt.*;

import javafx.scene.control.CheckBox;

public class ComponentTest extends Frame {
	public ComponentTest() {
		setTitle("Checkbox Test");
		setLocation(300, 300);
		setSize(800, 800);
		
		Panel p=new Panel();
		Checkbox cb1=new Checkbox("Kenta");
		Checkbox cb2=new Checkbox("JBJ");
		Checkbox cb3=new Checkbox("Strawberry");
		Checkbox cb4=new Checkbox("Star");
		
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);
		p.add(cb4);
		
		CheckboxGroup group=new CheckboxGroup();
		Checkbox man=new Checkbox("man", group, true);
		Checkbox woman=new Checkbox("woman", group, false);
		
		Choice ch=new Choice();
		ch.add("Spring");
		ch.add("Summer");
		ch.add("Fall");
		ch.add("Winter");
		p.add(ch);
		
		p.add(man);
		p.add(woman);
		
		List list=new List(5,true); //5개를 보여주고 여러 개를 선택할 수 있도록 해주는 List
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		list.add("G");
		list.add("H");
		list.add("I");
		list.add("J");
		list.add("K");
		list.add("L");
		list.add("M");
		list.add("N");
		list.add("O");
		list.add("P");
		list.add("Q");
		list.add("R");
		list.add("S");
		list.add("T");
		list.add("U");
		list.add("V");
		list.add("W");
		list.add("X");
		list.add("Y");
		list.add("Z");
		p.add(list);
		
		//1번째 25번째 지움. 
		//이렇게 지우면 앞이 먼저 지워지면서 한개씩 당겨짐. 그래서 뒤에서부터 지워야 함
		/*list.remove(1); 
		list.remove(25); */
		
		list.remove(25); 
		list.remove(1); 
		
		
		
		
		add(p);
		setVisible(true);
	}
}
