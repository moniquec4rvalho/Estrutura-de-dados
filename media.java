import javax.swing.*;

class Media{
public static void main(String[] args) {
    int i = 0;
    double num [50];
    double media, soma = 0;


    for(i=0 ; i<= 49 ; i++ ){
        num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
        soma = soma + num[i];
    }
    media = soma/50;
    System.out.println("A média das 50 notas digitadas é: ", media);
}
}
