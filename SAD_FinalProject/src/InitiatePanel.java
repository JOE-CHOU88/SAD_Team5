import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;

public class InitiatePanel extends JPanel{
	
	public InitiatePanel() {
		setBackground(SystemColor.inactiveCaptionBorder);
		setLayout(null);
		
		JLabel initialLabel = new JLabel("建立團購");
		initialLabel.setLocation(177, 10);
		initialLabel.setSize(96, 35);
		initialLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 24));
		add(initialLabel);
		
		JLabel titleLabel = new JLabel("標題：");
		titleLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		titleLabel.setBounds(63, 69, 54, 25);
		add(titleLabel);
		
		JTextField titleTextField = new JTextField();
		titleTextField.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		titleTextField.setBounds(198, 71, 187, 21);
		add(titleTextField);
		titleTextField.setColumns(10);
		
		JLabel initiatorLabel = new JLabel("發起人：");
		initiatorLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		initiatorLabel.setBounds(63, 104, 72, 25);
		add(initiatorLabel);
		
		JTextField initiatorTextField = new JTextField();
		initiatorTextField.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		initiatorTextField.setColumns(10);
		initiatorTextField.setBounds(198, 106, 187, 21);
		add(initiatorTextField);
		
		JLabel startLabel = new JLabel("開始時間：");
		startLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		startLabel.setBounds(63, 139, 96, 25);
		add(startLabel);
		
		JTextField startTextField = new JTextField();
		startTextField.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		startTextField.setColumns(10);
		startTextField.setBounds(198, 141, 187, 21);
		add(startTextField);

		JLabel endLabel = new JLabel("結束時間：");
		endLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		endLabel.setBounds(63, 174, 96, 25);
		add(endLabel);
		
		JTextField endTextField = new JTextField();
		endTextField.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		endTextField.setColumns(10);
		endTextField.setBounds(198, 176, 187, 21);
		add(endTextField);
		
		JLabel priceLabel = new JLabel("單價：");
		priceLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		priceLabel.setBounds(63, 209, 54, 25);
		add(priceLabel);
		
		JTextField priceTextField = new JTextField();
		priceTextField.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		priceTextField.setColumns(10);
		priceTextField.setBounds(198, 211, 187, 21);
		add(priceTextField);
		
		JLabel quantityLabel = new JLabel("數量門檻：");
		quantityLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		quantityLabel.setBounds(63, 244, 96, 25);
		add(quantityLabel);
		
		JTextField quantityTextField = new JTextField();
		quantityTextField.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		quantityTextField.setColumns(10);
		quantityTextField.setBounds(198, 246, 187, 21);
		add(quantityTextField);
		
		JLabel pickTimeLabel = new JLabel("取貨時間：");
		pickTimeLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		pickTimeLabel.setBounds(63, 279, 96, 25);
		add(pickTimeLabel);
		
		JTextField pickTimeTextField = new JTextField();
		pickTimeTextField.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		pickTimeTextField.setColumns(10);
		pickTimeTextField.setBounds(198, 281, 187, 21);
		add(pickTimeTextField);
		
		JLabel pickPlaceLabel = new JLabel("取貨地點：");
		pickPlaceLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		pickPlaceLabel.setBounds(63, 313, 96, 25);
		add(pickPlaceLabel);
		
		JTextField pickPlaceTextField = new JTextField();
		pickPlaceTextField.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		pickPlaceTextField.setColumns(10);
		pickPlaceTextField.setBounds(198, 315, 187, 21);
		add(pickPlaceTextField);
		
		JLabel contactLabel = new JLabel("聯絡資訊：");
		contactLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		contactLabel.setBounds(63, 350, 96, 25);
		add(contactLabel);
		
		JTextField contactTextField = new JTextField();
		contactTextField.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		contactTextField.setColumns(10);
		contactTextField.setBounds(198, 352, 187, 21);
		add(contactTextField);
		
		JLabel discripLabel = new JLabel("商品描述：");
		discripLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		discripLabel.setBounds(63, 385, 96, 25);
		add(discripLabel);
		
		JTextArea discripTextArea = new JTextArea();
		discripTextArea.setLineWrap(true);
		discripTextArea.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		discripTextArea.setWrapStyleWord(true);
		discripTextArea.setBounds(198, 385, 187, 56);
		Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
		discripTextArea.setBorder(BorderFactory.createCompoundBorder(border,
	            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		add(discripTextArea);
		
		JLabel uploadLabel = new JLabel("上傳商品圖片：");
		uploadLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		uploadLabel.setBounds(63, 448, 136, 25);
		add(uploadLabel);
		
		JButton chooseFileButton = new JButton("Choose File");
		chooseFileButton.setBackground(Color.WHITE);
		chooseFileButton.setFont(new Font("Arial", Font.PLAIN, 12));
		chooseFileButton.setBounds(198, 451, 107, 23);
		add(chooseFileButton);
		
		JLabel chooseLabel = new JLabel("No File Chosen");
		chooseLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		chooseLabel.setBounds(206, 475, 90, 15);
		add(chooseLabel);
		
		JButton createButton = new JButton("建立團購");
		createButton.setForeground(SystemColor.WHITE);
		createButton.setBackground(SystemColor.textHighlight);
		createButton.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		createButton.setBounds(172, 500, 107, 38);
		add(createButton);
	}
}
