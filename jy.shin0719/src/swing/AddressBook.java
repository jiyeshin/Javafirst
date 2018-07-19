package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import javax.swing.table.DefaultTableModel;

public class AddressBook extends JFrame {
	String[] columns = { "name", "phone", "address" };

	String[][] data = { { "Jiye", "8909261234", "Yongin" }, { "Kenta", "9501101234", "Gunma" },
			{ "Sanggyun", "9505231234", "Gwangju" }, { "Donghan", "9807031234", "Daegu" } };

	public AddressBook() {
		setBounds(1000, 800, 1000, 1000);
		setTitle("Address Book");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		DefaultTableModel model = new DefaultTableModel(data, columns); // 테이블 모델 만들기
		JTable table = new JTable(model); // 테이블 모델을 이용해서 테이블 만들기
		// table.setModel(model)
		JScrollPane scrollPane = new JScrollPane(table); // 출력 영역의 크기보다 table이 커지더라고 스크롤 바를 이용할 수 있도록 생성
		add(scrollPane); // 스크롤페인을 프레임에 부착

		/*
		 * //JOptionPane.showMessageDialog(null,"Message Dialog",
		 * "message",JOptionPane.YES_NO_OPTION); int
		 * r=JOptionPane.showConfirmDialog(null, "Message",
		 * "Dialog",JOptionPane.YES_NO_OPTION); System.out.println(r);
		 * 
		 * String sr=JOptionPane.showInputDialog(null,"Message","Dialog",JOptionPane.
		 * YES_NO_OPTION); System.out.println(sr);
		 * 
		 */

		JMenuBar menuBar = new JMenuBar(); // 메뉴 바를 생성

		JMenu file = new JMenu("file(a)");
		file.setMnemonic('a'); // 단축키 설정

		JMenuItem item1 = new JMenuItem("open");
		file.add(item1);

		JCheckBoxMenuItem item2 = new JCheckBoxMenuItem("save");
		file.add(item2);

		JRadioButtonMenuItem item3 = new JRadioButtonMenuItem("edit");
		file.add(item3);

		menuBar.add(file);
		setJMenuBar(menuBar); // 메뉴 바를 윈도우에 부착

		JLabel lbName = new JLabel("name");
		JTextField tfName = new JTextField(10);
		JLabel lbPhone = new JLabel("phone");
		JTextField tfPhone = new JTextField(10);
		JLabel lbAddress = new JLabel("address");
		JTextField tfAddress = new JTextField(30);

		JButton btnInsert = new JButton("insert");
		JButton btnDelete = new JButton("delete");

		JPanel southPanel = new JPanel();
		southPanel.add(lbName);
		southPanel.add(tfName);
		southPanel.add(lbAddress);
		southPanel.add(tfAddress);
		southPanel.add(lbPhone);
		southPanel.add(tfPhone);
		southPanel.add(btnInsert);
		southPanel.add(btnDelete);

		add("South", southPanel);

		ActionListener actionInserlt = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = tfName.getText();
				String phone = tfPhone.getText();
				String address = tfAddress.getText();

				// 좌우 공백 제거
				name = name.trim();
				phone = phone.trim();
				address = address.trim();

				// name의 필수 입력
				//이름이 입력되지 않은 경우 길이가 0임. null이 아님.
				if (name.length() == 0) {
					JOptionPane.showMessageDialog(null, "please write your name properly.", "name", JOptionPane.WARNING_MESSAGE);
					return; //아래쪽을 더이상 수행하지 않도록 리턴
				}
				
				if(phone.length()==0) {
					JOptionPane.showMessageDialog(null, "Please write your phone number properly.","phone",JOptionPane.WARNING_MESSAGE);
				return;
				}
				if(address.length()==0) {
					JOptionPane.showMessageDialog(null, "Please write your address properly.","address",JOptionPane.WARNING_MESSAGE);
				return;
				}

				// 테이블의 데이터를 편집하기 위해서
				// 테이블의 데이터 모델을 가져옴
				DefaultTableModel model = (DefaultTableModel) table.getModel();

				// 데이터를 추가하기 위해서 추가할 데이터 배열을 생성
				String[] row = { name, phone, address };
				model.addRow(row); // 모델에 추가
				table.updateUI(); // 테이블 갱신
				
				tfName.setText("");
				tfPhone.setText("");
				tfAddress.setText("");
				
				JOptionPane.showMessageDialog(null, "completed","insert", JOptionPane.PLAIN_MESSAGE);

			}

		};
		btnInsert.addActionListener(actionInserlt);
		
		
		ActionListener actionDelete=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int idx=table.getSelectedRow(); //선택한 행 번호 찾기
				
				//테이블에서 행을 선택하지 않았다면
				if(!(idx>=0&& idx<table.getRowCount())) {
					JOptionPane.showMessageDialog(null, "Please choose any item.", "failed", JOptionPane.WARNING_MESSAGE);
				return;
				}
				
				DefaultTableModel model=(DefaultTableModel)table.getModel(); //테이블의 모델 가져오기
				model.removeRow(idx);
				table.updateUI();
				JOptionPane.showMessageDialog(null, "removed", "remove", JOptionPane.WARNING_MESSAGE);
				
			}
			
		};
		
		btnDelete.addActionListener(actionDelete);
		

		setVisible(true);
	}
}
