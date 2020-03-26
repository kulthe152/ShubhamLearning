package Assignments;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JLabel;
import java.awt.Color;

public class JTable_Imges_List extends JFrame 
{
	public JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTable_Imges_List frame = new JTable_Imges_List();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public JTable table1;
	public JLabel label1;
	
	public void getImagesName() 
	{
		File f1 = new File(getClass().getResource("/Assignments/imgList/").getFile());
		Object [] files = f1.list();
		DefaultTableModel model = (DefaultTableModel) table1.getModel();
		model.setColumnIdentifiers(new String[] {"Images Name"});
		Object[] row = new Object[1];
		for(int i=0 ; i<files.length ; i++)
		{
		 	row[0] = files[i];
			model.addRow(row);
		}		
	}
		
	
	public JTable_Imges_List() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 744, 537);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table1 = new JTable();
		table1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int index = table1.getSelectedRow();
				TableModel model = table1.getModel();
				String imageName = model.getValueAt(index, 0).toString();
				label1.setVisible(true);				
				ImageIcon icon = new ImageIcon(getClass().getResource("/Assignments/imgList/"+imageName));
				Image img = icon.getImage().getScaledInstance(label1.getWidth(), label1.getHeight(), Image.SCALE_SMOOTH);
				label1.setIcon(new ImageIcon(img));
				
			}
		});
		
		table1.setBounds(48, 38, 278, 298);
		contentPane.add(table1);
		
		 label1 = new JLabel("");
		label1.setForeground(new Color(30, 144, 255));
		label1.setBackground(new Color(240, 240, 240));
		label1.setBounds(366, 38, 362, 401);
		contentPane.add(label1);
		getImagesName();
	}

}
