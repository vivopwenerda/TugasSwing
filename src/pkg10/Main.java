package pkg10;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        form f =  new form();
    }
}

class form extends JFrame implements ActionListener{
    JFrame f;
    JLabel lnama = new JLabel("Nama Pembeli ");
    final JTextField fnama =  new JTextField(20);
    
    JLabel loperator = new JLabel ("Operator Telepon ");
    String[] operator = {"XL","Telkomsel","Smartfren","AXIS","Three","Indosat"};
    JComboBox cboperator = new JComboBox(operator);
    
    JLabel lnohp = new JLabel("Nomor Telepon ");
    final JTextField fnohp =  new JTextField(20);
    
    JLabel ljenis =  new JLabel("Jenis Kartu ");
    JRadioButton rbprabayar = new JRadioButton ("Prabayar");
    JRadioButton rbpascabayar = new JRadioButton ("Pascabayar");
    
    JLabel lpaket = new JLabel("Jumlah Pulsa ");
    final JTextField fpaket =  new JTextField(20);
    
    JLabel lbayar = new JLabel ("Metode Pembayaran ");
    String[] bayar = {"Transfer BCA 123456789","Transfer BRI 987654321","Transfer BNI 678912345","Transfer Mandiri 987612345","OVO 081234567890","GOPAY 081234567890"};
    JComboBox cbbayar = new JComboBox(bayar);
    
    JLabel lnominal = new JLabel("Masukkan Nominal ");
    final JTextField fnominal =  new JTextField(20);
    
    JButton  bsimpan = new JButton("Simpan");
    JButton  breset = new JButton("Reset");
    JButton  bkeluar = new JButton("Keluar");
    
    public form(){
    setTitle("VIVO JUAL PULSA");    
    setSize(600,300);
    
    ButtonGroup grup = new ButtonGroup();
    grup.add(rbprabayar);
    grup.add(rbpascabayar);
    
    setLayout(null);
    add(lnama);
    add(fnama);
    add(ljenis);
    add(rbprabayar);
    add(rbpascabayar);
    add(loperator);
    add(cboperator);
    add(lnohp);
    add(fnohp);
    add(lpaket);
    add(fpaket);
    add(lbayar);
    add(cbbayar);
    add(lnominal);
    add(fnominal);
    add(bsimpan);
    add(breset);
    add(bkeluar);
    
    lnama.setBounds(10,10,120,20);
    fnama.setBounds(170,10,150,20);
    loperator.setBounds(10,40,120,20);
    cboperator.setBounds(170,40,100,20);
    lnohp.setBounds(10,70,150,20);
    fnohp.setBounds(170,70,150,20);
    ljenis.setBounds(10,100,200,20);
    rbprabayar.setBounds(170,100,100,20);
    rbpascabayar.setBounds(270,100,100,20);
    lpaket.setBounds(10,130,120,20);
    fpaket.setBounds(170,130,150,20);
    lbayar.setBounds(10,160,250,20);
    cbbayar.setBounds(170,160,250,20);
    lnominal.setBounds(10,190,250,20);
    fnominal.setBounds(170,190,250,20);
    breset.setBounds(80,230,120,20);
    bsimpan.setBounds(240,230,120,20);
    bkeluar.setBounds(400,230,120,20);
    
    bsimpan.addActionListener(this);
    breset.addActionListener(this);
    bkeluar.addActionListener(this);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
   
    }
    
    public void cekData(){
        
        System.out.println("\nPULSA YANG ANDA BELI");
        System.out.print("Nama Lengkap\t\t: "+fnama.getText()+"\n");
        System.out.print("Jenis Kartu\t\t: ");
        if(rbprabayar.isSelected()){
            System.out.println("Prabayar");
        }
        if (rbpascabayar.isSelected()) {
            System.out.println("Pascabayar");
        }
        System.out.print("Operator Telepon\t: "+cboperator.getItemAt(cboperator.getSelectedIndex())+"\n");
        System.out.print("Nomor Telepon\t\t: "+fnohp.getText()+"\n");
        System.out.print("Jumlah Pulsa\t\t: "+fpaket.getText()+"\n");
        System.out.print("Metode Pembayaran\t: "+cbbayar.getItemAt(cbbayar.getSelectedIndex())+"\n");
        System.out.print("Nominal Uang\t\t: Rp."+fnominal.getText()+"\n");
    }   

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == bsimpan){
            cekData();
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Terimakasih! "+fnama.getText()+"\n" 
                    + "Pulsa Telah diProses. Silahkan cek Pesan Masuk Anda.\n\n");
        }
        if (event.getSource() == breset){
            fnama.setText("");
            fnominal.setText("");
        }
        if (event.getSource() == bkeluar) {
            int a=JOptionPane.showConfirmDialog(f,"Selesai?");  
            if(a==JOptionPane.YES_OPTION){  
                dispose();  
            }
            if(a==JOptionPane.NO_OPTION){  
                fnama.setText("");
                fnominal.setText("");
            }
        }
    }
}