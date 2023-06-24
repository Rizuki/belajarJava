package sample.questions;

import javax.swing.JOptionPane;
public class soalNo1 {
    public static void main(String[] args) {

        int nilaiA , nilaiB , nilaiTerbesar;

        JOptionPane.showMessageDialog(null, "Nilai terbesar");

        nilaiA = Integer.parseInt(JOptionPane.showInputDialog("Input Bilangan Pertama"));
        nilaiB = Integer.parseInt(JOptionPane.showInputDialog("Input Bilangan Kedua"));


        if (nilaiA > nilaiB){
            nilaiTerbesar = nilaiA;
        }else if (nilaiA < nilaiB){
            nilaiTerbesar = nilaiB;
        }else  {
            nilaiTerbesar = nilaiA;
            JOptionPane.showMessageDialog(null, "Nilai A Sama besar dengan Nilai B");
        }
        JOptionPane.showMessageDialog(null, "Bilangan Terbesar dari " +nilaiA+ " dan " +nilaiB+
                " Adalah : " +nilaiTerbesar);
        JOptionPane.showMessageDialog(null, "Terima kasih");

    }
}
