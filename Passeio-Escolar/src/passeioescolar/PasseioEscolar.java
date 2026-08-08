
package passeioescolar;

import javax.swing.JOptionPane;


public class PasseioEscolar {

    public static void main(String[] args) {

 int alunos, inspetores, totalPassageiros, onibusLotado, onibusParaPasseio, continuar;
  String dado;
  
  do {
  dado = JOptionPane.showInputDialog("Digite a quantidade de alunos ");
  alunos = Integer.parseInt(dado);
  
  dado = JOptionPane.showInputDialog("Digite a quantidade de inspetores ");
  inspetores = Integer.parseInt(dado);
  
  totalPassageiros = alunos + inspetores;
  
  onibusLotado = totalPassageiros / 10;
  
  if (onibusLotado < inspetores) {
      onibusParaPasseio = onibusLotado;
  } else {
      onibusParaPasseio = inspetores;
  }
  
  String mensagem = "Alunos: "  + alunos + "\n" + "Inspetores: " + inspetores + "\n" +  "Ônibus para o passeio = " +  onibusParaPasseio ;
  
  JOptionPane.showMessageDialog(null, mensagem);
  
  dado = JOptionPane.showInputDialog("Deseja continuar? \n 1 - Sim \n 0 - Sair");
  continuar = Integer.parseInt(dado);
  
    } while (continuar == 1);
}
    
  }
  