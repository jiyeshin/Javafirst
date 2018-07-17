package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemWindow extends Frame {
	public ItemWindow() {
		setBounds(1500, 600, 800, 800);
		setTitle("Event Handling");

		Panel panel = new Panel();
		Font font = new Font("돋움", 20, 30);

		Checkbox cbboolean = new Checkbox("boolean");
		Checkbox cbbyte = new Checkbox("byte");
		Checkbox cbshort = new Checkbox("short");
		Checkbox cbchar = new Checkbox("char");
		Checkbox cbint = new Checkbox("int");
		Checkbox cblong = new Checkbox("long");
		Checkbox cbfloat = new Checkbox("float");
		Checkbox cbdouble = new Checkbox("double");

		panel.add(cbboolean);
		panel.add(cbbyte);
		panel.add(cbshort);
		panel.add(cbchar);
		panel.add(cbint);
		panel.add(cblong);
		panel.add(cbfloat);
		panel.add(cbdouble);

		TextArea ta = new TextArea(10, 70);
		add("Center", ta);
		add("North", panel);

		String[] category = { "Programming", "Database", "IDE", "Framework" };

		String[][] content = { { "Java", "JavaScript", "Swift" }, { "Oracle", "MySQL", "MongoDB" },
				{ "Eclipse", "Android Studio", "XCode" }, { "Spring", "MyBatis", "Hibernate" } };

		Choice cbcategory = new Choice();
		for (String imsi : category) {
			cbcategory.add(imsi);
		}
		Choice cbcontent = new Choice();
		for (String imsi : content[0]) {
			cbcontent.add(imsi);
		}

		Panel southPanel = new Panel();


		ItemListener ItemHanler1 = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// 체크박스로 변환
				// 이벤트 처리 메소드에서 e.getSource()는 이벤트가 발생한 인스턴스의 주소를 리턴함.
				Checkbox cb = (Checkbox) (e.getSource());
				String label = cb.getLabel(); // 체크 박스에 입력된 텍스트 가져오기
				boolean b = cb.getState(); // 체크박스 선택 여부 가져오기
				ta.append(label + " " + b + "로 변경\n");
				// append는 계속 붙여나감
				// setText는 덮어쓰기
			}
		};
		// 체크박스를 눌렀을 때 호출될 인스턴스 설정
		cbboolean.addItemListener(ItemHanler1);
		cbbyte.addItemListener(ItemHanler1);
		cbshort.addItemListener(ItemHanler1);
		cbchar.addItemListener(ItemHanler1);
		cbint.addItemListener(ItemHanler1);
		cblong.addItemListener(ItemHanler1);
		cbfloat.addItemListener(ItemHanler1);
		cbdouble.addItemListener(ItemHanler1);

		// 카테고리 콤보박스의 선택이 변경되었을 때 호출될 메소드를 가진 리스너.
		// ItemListener가 처리
		ItemListener itemHandler2 = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// cbcaegory의 선택된 행 번호 가져오기
				int row = cbcategory.getSelectedIndex();

				// cbcontent의 내용을 전부 삭제.
				cbcontent.removeAll();

				// 행번호에 해당하는 세부 내용을 cbcontent에 추가
				for (String temp : content[row]) {
					cbcontent.add(temp);
				}
			}

		};
		cbcategory.addItemListener(itemHandler2);

		

			Button buttonExit = new Button("Exit");
			Button buttonSelect = new Button("Select");

			ActionListener action1 = new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			};
			ActionListener action2 = new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				int caNum = cbcategory.getSelectedIndex();
				int coNum = cbcontent.getSelectedIndex();
				String categoryText = category[caNum];
				String contentText = content[caNum][coNum];
				ta.setText(categoryText + ": " + contentText);

			}
		};

		buttonExit.addActionListener(action1);
		buttonSelect.addActionListener(action2);
		
		
		southPanel.add(cbcategory);
		southPanel.add(cbcontent);
		southPanel.add(buttonSelect);
		southPanel.add(buttonExit);
		add("South", southPanel);
		setVisible(true);
	}
}
