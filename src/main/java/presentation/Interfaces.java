package presentation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import presentation.Controller.chef;

public class Interfaces extends JFrame implements Observer{

	private JFrame frame = new JFrame();
	private JFrame framew =new JFrame();
	private JFrame framea=new JFrame();
	private JFrame frametab=new JFrame();
	private JFrame frametabo;//=new JFrame();
	private JFrame framechef = new JFrame();
	
	private JButton adm = new JButton("ADMINISTRATOR");
	private JButton wa = new JButton("WAITER");
	private JButton ch = new JButton("CHEF");
	private JLabel rest = new JLabel("RESTAURANT");
	
	private JButton delete = new JButton("DELETE");
	private JButton viz = new JButton("TABLE VIEW");
	private JButton add = new JButton("ADD");
	private JButton edit = new JButton("EDIT");
	private JTextField num;
	private JTextField pri =  new JTextField();
	private JTextField b=  new JTextField();
	private JTextField a=  new JTextField();
	private JButton newo = new JButton("PLACE ORDER");
	private JButton comp = new JButton("COMPUTE PRICE");
	private JButton gen = new JButton("GENERATE BILL");
	private JLabel waitt = new JLabel("WAITER");
	private JTextField idt ;
	private JTextField datat;
	private JTextField tablet;
	private  JButton tableview = new JButton("TABLE VIEW");
	private JTextField prie = new JTextField();
	private JTable table = new JTable();
	private JTable tableo= new JTable();
	private final JLabel base = new JLabel("BASE PRODUCT");
	private final JLabel compo = new JLabel("COMPOSITE PRODUCT");
	private final JLabel idc = new JLabel("ID: ");
	private final JTextField id2 = new JTextField();
	private final JTextField num2 = new JTextField();
	private final JTextField pri2 = new JTextField();
	private final JLabel name2 = new JLabel("NAME:");
	private final JLabel price2 = new JLabel("PRICE:");
	private JTextField message = new JTextField();
	private JButton done = new JButton("DONE");
	private JButton addd = new JButton("ADD PRODUCT");
	private JLabel id ;
	private JLabel tab ;
	private JTextArea textArea = new JTextArea();

	public JTextArea getTextArea() {
		return textArea;
	}


	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}



	private JLabel dat;
	private final JButton end = new JButton("END PROGRAM");



	public Interfaces() {
		
		frame.setResizable(false);
		frame.setBounds(100,100,715,566);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(222, 184, 135));
		panel.setForeground(new Color(230, 230, 250));
		panel.setLayout(null);
		
		
		rest.setForeground(new Color(218, 165, 32));
		rest.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		rest.setBounds(218, 13, 300, 74);
		panel.add(rest);
		adm.setForeground(new Color(255, 140, 0));
		
		adm.setFont(new Font("Times New Roman", Font.BOLD, 25));
		adm.setBounds(28, 116, 300, 90);
		panel.add(adm);
		wa.setForeground(new Color(210, 105, 30));
		
		wa.setFont(new Font("Times New Roman", Font.BOLD, 25));
		wa.setBounds(162, 221, 300, 90);
		panel.add(wa);
		ch.setForeground(new Color(165, 42, 42));
		
		ch.setFont(new Font("Times New Roman", Font.BOLD, 25));
		ch.setBounds(291, 331, 300, 90);
		panel.add(ch);
		

		frame.getContentPane().add(panel);
		end.setForeground(new Color(139, 0, 0));
		end.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		end.setBounds(465, 434, 202, 74);
		
		panel.add(end);
		frame.setVisible(true);
		

	}
	
	
		public void framew() {	
		


			framew.setResizable(true);
			framew.setBounds(100,100,624,618);
			
			JPanel panel = new JPanel();
			panel.setBackground(new Color(245, 245, 220));
			panel.setForeground(new Color(230, 230, 250));
			panel.setLayout(null);
			
			waitt.setForeground(new Color(210, 180, 140));
			waitt.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 45));
			waitt.setBounds(195, 31, 230, 74);
			panel.add(waitt);
			
			newo.setFont(new Font("Times New Roman", Font.BOLD, 25));
			newo.setBounds(315, 145, 248, 55);
			panel.add(newo);
			
			comp.setFont(new Font("Times New Roman", Font.BOLD, 25));
			comp.setBounds(315, 235, 248, 55);
			panel.add(comp);
			
			gen.setFont(new Font("Times New Roman", Font.BOLD, 25));
			gen.setBounds(315, 320, 248, 48);
			panel.add(gen);
			
			idt= new JTextField();
			idt.setBounds(32, 152, 181, 48);
			panel.add(idt);
			
			id = new JLabel("ID PRODUCTS:");
			id.setFont(new Font("Tahoma", Font.PLAIN, 18));
			id.setBounds(33, 110, 139, 29);
			panel.add(id);
			
			dat = new JLabel("DATA: (zzllaaaa)");
			dat.setFont(new Font("Tahoma", Font.PLAIN, 18));
			dat.setBounds(32, 224, 140, 29);
			panel.add(dat);
			
			datat = new JTextField();
			datat.setColumns(10);
			datat.setBounds(32, 275, 181, 48);
			panel.add(datat);
			
			tab = new JLabel("No. TABLE:");
			tab.setFont(new Font("Tahoma", Font.PLAIN, 18));
			tab.setBounds(33, 356, 108, 29);
			panel.add(tab);
			
			tablet = new JTextField();
			tablet.setColumns(10);
			tablet.setBounds(32, 398, 181, 48);
			panel.add(tablet);
			tableview.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
			tableview.setBounds(188, 486, 237, 55);
			
			panel.add(tableview);
			
			
			addd.setFont(new Font("Times New Roman", Font.BOLD, 25));
			addd.setBounds(315, 398, 248, 48);
			panel.add(addd);
			
			framew.getContentPane().add(panel);

			framew.setVisible(true);
			
	
	}
	
	
		public void frameadm () {
			framea.setResizable(true);
			framea.setBounds(100,100,965,624);
				
				JPanel panel = new JPanel();
				panel.setBackground(Color.LIGHT_GRAY);
				panel.setLayout(null);
				
				
				
				JLabel cl = new JLabel("ADMINISTRATOR");
				cl.setHorizontalAlignment(SwingConstants.CENTER);
				cl.setForeground(new Color(0, 0, 128));
				cl.setFont(new Font("Times New Roman", Font.BOLD, 45));
				cl.setBounds(127, 34, 500, 80);
				panel.add(cl);
				
				JLabel id = new JLabel("ID: ");
				id.setFont(new Font("Times New Roman", Font.PLAIN, 20));
				id.setBounds(109, 206, 90, 25);
				panel.add(id);
				
				JLabel name = new JLabel("NAME:");
				name.setFont(new Font("Times New Roman", Font.PLAIN, 20));
				name.setBounds(109, 297, 90, 25);
				panel.add(name);
				
				num =  new JTextField();
				num.setBounds(72, 335, 215, 40);
				panel.add(num);
				
			
				
				b = new JTextField();
				b.setBounds(72, 244, 215, 40);
				panel.add(b);
				prie.setBounds(72, 416, 215, 40);
				
				panel.add(prie);
				
				JLabel price = new JLabel("PRICE:");
				price.setFont(new Font("Times New Roman", Font.PLAIN, 20));
				price.setBounds(109, 388, 90, 25);
				panel.add(price);
			
				add.setForeground(new Color(0, 0, 128));
				add.setFont(new Font("Times New Roman", Font.BOLD, 20));
				add.setBounds(700, 80, 170, 80);
				panel.add(add);
			
				edit.setForeground(new Color(0, 0, 128));
				edit.setFont(new Font("Times New Roman", Font.BOLD, 20));
				edit.setBounds(700, 187, 170, 80);
				panel.add(edit);
				
				delete.setForeground(new Color(0, 0, 128));
				delete.setFont(new Font("Times New Roman", Font.BOLD, 20));
				delete.setBounds(700, 294, 170, 80);
				panel.add(delete);
				
				viz.setForeground(new Color(0, 0, 128));
				viz.setFont(new Font("Times New Roman", Font.BOLD, 25));
				viz.setBounds(648, 487, 265, 70);
				panel.add(viz);
				base.setFont(new Font("Tahoma", Font.BOLD, 20));
				base.setBounds(84, 145, 177, 33);
				
				panel.add(base);
				
				compo.setFont(new Font("Tahoma", Font.BOLD, 20));
				compo.setBounds(366, 145, 240, 33);
				
				panel.add(compo);
				idc.setFont(new Font("Times New Roman", Font.PLAIN, 20));
				idc.setBounds(420, 206, 90, 25);
				
				panel.add(idc);
				id2.setBounds(384, 244, 215, 40);
				
				panel.add(id2);
				num2.setBounds(384, 335, 215, 40);
				
				panel.add(num2);
				pri2.setBounds(384, 416, 215, 40);
				
				panel.add(pri2);
				name2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
				name2.setBounds(420, 297, 90, 25);
				
				panel.add(name2);
				price2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
				price2.setBounds(420, 388, 90, 25);
				
				panel.add(price2);
				
				message = new JTextField();
				message.setBounds(72, 511, 530, 46);
				panel.add(message);
				message.setColumns(10);
				
				done.setForeground(new Color(0, 0, 128));
				done.setFont(new Font("Times New Roman", Font.BOLD, 20));
				done.setBounds(700, 394, 170, 80);
				panel.add(done);
				framea.getContentPane().add(panel);

				framea.setVisible(true);
		
			
	}
		
		public void frametaba() {

			   frametab = new JFrame();
			   	frametab.setResizable(true);
				frametab.setBounds(100,100,1200,670);

				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(49, 155, 886, 370);
				
				scrollPane.setViewportView(table);
				
				frametab.setVisible(true);
			
		}
		

		public void frametabo() {

			    frametabo = new JFrame();
			   	frametabo.setResizable(false);
				frametabo.setBounds(100,100,970,670);

				
				
				
				tableo.setBounds(40, 87, 886, 486);
				
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(40, 87, 886, 486);
				

				frametabo.setVisible(true);

		}
		
		public void framechef() {
			
			framechef = new JFrame();
			framechef.setResizable(false);
			framechef.setBounds(100,100,600,400);
				
			JPanel panel = new JPanel();
			panel.setLayout(null);
			
			textArea.setBounds(12, 55, 550, 250);
			panel.add(textArea);
			
			JLabel c11 = new JLabel("CHEF");
			c11.setHorizontalAlignment(SwingConstants.CENTER);
			c11.setForeground(new Color(100, 0, 0));
			c11.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
			c11.setBounds(110, 13, 358, 44);
			panel.add(c11);
			
			framechef.getContentPane().add(panel);

			framechef.setVisible(true);

		}
		
		public void addListenerButon1(ActionListener adm2) {
			// TODO Auto-generated method stub
			adm.addActionListener(adm2);
			
		}


		public void addListenerButon2(ActionListener wa2) {
			// TODO Auto-generated method stub
			wa.addActionListener(wa2);

		}
		


		public void addListenerButon3(ActionListener ch2) {
			// TODO Auto-generated method stub
			ch.addActionListener(ch2);

		}


		public void addListenerButon4(ActionListener delete2) {
			// TODO Auto-generated method stub
			delete.addActionListener(delete2);

		} 
		
		public void addListenerButon5(ActionListener viz2) {
			// TODO Auto-generated method stub
			viz.addActionListener(viz2);

		}

		public void addListenerButon6(ActionListener add2) {
			// TODO Auto-generated method stub
			add.addActionListener(add2);

		}


		public void addListenerButon7(ActionListener edit2) {
			// TODO Auto-generated method stub
			edit.addActionListener(edit2);

		}


		public void addListenerButon8(ActionListener newo2) {
			// TODO Auto-generated method stub
			newo.addActionListener(newo2);

		}


		public void addListenerButon9(ActionListener comp2) {
			// TODO Auto-generated method stub
			comp.addActionListener(comp2);

		}

		public void addListenerButon10(ActionListener gen2) {
			// TODO Auto-generated method stub
			gen.addActionListener(gen2);

		}

		public void addListenerButon11(ActionListener t2) {
			// TODO Auto-generated method stub
			tableview.addActionListener(t2);

		}

		public void addListenerButon12(ActionListener done2) {
			// TODO Auto-generated method stub
			done.addActionListener(done2);
		}

		
		
		public void addListenerButon13(ActionListener ad) {
			addd.addActionListener(ad);
		}
		

		public void addListenerButon14(ActionListener end2) {
			// TODO Auto-generated method stub
			end.addActionListener(end2);
		}

		public void addListenerButon15(ActionListener chef) {
			// TODO Auto-generated method stub
			ch.addActionListener(chef);
		}
		
		public JFrame getFrame() {
			return frame;
		}


		public void setFrame(JFrame frame) {
			this.frame = frame;
		}


		public JFrame getFramew() {
			return framew;
		}


		public void setFramew(JFrame framew) {
			this.framew = framew;
		}


		public JButton getAdm() {
			return adm;
		}


		public void setAdm(JButton adm) {
			this.adm = adm;
		}


		public JButton getWa() {
			return wa;
		}


		public void setWa(JButton wa) {
			this.wa = wa;
		}


		public JButton getCh() {
			return ch;
		}


		public void setCh(JButton ch) {
			this.ch = ch;
		}


		public JLabel getRest() {
			return rest;
		}


		public void setRest(JLabel rest) {
			this.rest = rest;
		}


		public JButton getDelete() {
			return delete;
		}


		public void setDelete(JButton delete) {
			this.delete = delete;
		}


		public JButton getViz() {
			return viz;
		}


		public void setViz(JButton viz) {
			this.viz = viz;
		}


		public JButton getAdd() {
			return add;
		}


		public void setAdd(JButton add) {
			this.add = add;
		}


		public JButton getEdit() {
			return edit;
		}


		public void setEdit(JButton edit) {
			this.edit = edit;
		}


		public String getNum() {
			return num.getText();
		}


		public void setNum(JTextField num) {
			this.num = num;
		}


		public int getPrice() {
			return Integer.parseInt(pri.getText());
		}


		public void setPrice(JTextField price) {
			this.pri = price;
		}


		public int getid1() {
			return Integer.parseInt(b.getText());
		}


		public void setB(JTextField b1) {
			this.b = b1;
		}


		public JTextField getA() {
			return a;
		}


		public void setA(JTextField A) {
			this.a = A;
		}


		public JButton getNewo() {
			return newo;
		}


		public void setNewo(JButton newo) {
			this.newo = newo;
		}


		public JButton getComp() {
			return comp;
		}


		public void setComp(JButton comp) {
			this.comp = comp;
		}


		public JButton getGen() {
			return gen;
		}


		public void setGen(JButton gen) {
			this.gen = gen;
		}


		public JLabel getWait() {
			return waitt;
		}


		public void setWait(JLabel wait) {
			this.waitt = wait;
		}


		public JFrame getFramea() {
			return framea;
		}


		public void setFramea(JFrame framea) {
			this.framea = framea;
		}


		public JFrame getFrametab() {
			return frametab;
		}


		public void setFrametab(JFrame frametab) {
			this.frametab = frametab;
		}


		public JFrame getFrametabo() {
			return frametabo;
		}


		public void setFrametabo(JFrame frametabo) {
			this.frametabo = frametabo;
		}


		public JTextField getPri() {
			return pri;
		}


		public void setPri(JTextField pri) {
			this.pri = pri;
		}


		public JLabel getWaitt() {
			return waitt;
		}


		public void setWaitt(JLabel waitt) {
			this.waitt = waitt;
		}


		public String getIdt() {
			return idt.getText();
		}


		public void setIdt(JTextField idt) {
			this.idt = idt;
		}


		public String getDatat() {
			return datat.getText();
		}


		public void setDatat(JTextField datat) {
			this.datat = datat;
		}


		public String getTablet() {
			return tablet.getText();
		}


		public void setTablet(String tablet) {
			this.tablet.setText(tablet);
		}


		public JButton getTableview() {
			return tableview;
		}


		public void setTableview(JButton tableview) {
			this.tableview = tableview;
		}


		public String getPrie() {
			return prie.getText();
			}


		public void setPrie(JTextField prie) {
			this.prie = prie;
		}


		public JTable getTable() {
			return table;
		}


		public void setTable(JTable table) {
			this.table = table;
		}


		public JTable getTableo() {
			return tableo;
		}


		public void setTableo(JTable tableo) {
			this.tableo = tableo;
		}


		public String getB() {
			return b.getText();
			}


		public JLabel getBase() {
			return base;
		}


		public JLabel getCompo() {
			return compo;
		}


		public JLabel getIdc() {
			return idc;
		}


		public String getId2() {
			return id2.getText();
			}


		public String getNum2() {
			return num2.getText();
		}


		public String getPri2() {
			return pri2.getText();
		}


		public JLabel getName2() {
			return name2;
		}


		public JLabel getPrice2() {
			return price2;
		}


		public String getMessage() {
			return message.getText();
		}


		public void setMessage(String message) {
			this.message.setText(message); 
		}
		
		
		public JFrame getFramechef() {
			return framechef;
		}


		public void setFramechef(JFrame framechef) {
			this.framechef = framechef;
		}


		public JButton getDone() {
			return done;
		}


		public void setDone(JButton done) {
			this.done = done;
		}


		public JButton getAddd() {
			return addd;
		}


		public void setAddd(JButton addd) {
			this.addd = addd;
		}


		public JLabel getIdd() {
			return id;
		}


		public void setId(JLabel id) {
			this.id = id;
		}


		public JLabel getTab() {
			return tab;
		}


		public void setTab(JLabel tab) {
			this.tab = tab;
		}


		public JLabel getDat() {
			return dat;
		}


		public void setDat(JLabel dat) {
			this.dat = dat;
		}


		public JButton getEnd() {
			return end;
		}


		public void setTablet(JTextField tablet) {
			this.tablet = tablet;
		}


		public void setMessage(JTextField message) {
			this.message = message;
		}

		

		public void update(Observable arg0, Object arg1) {
			// TODO Auto-generated method stub
			textArea.append("Bucatarul a fost notificat!\n"+"A fost receptionata o noua comanda!\n");
		}


		



		

		

		
}

