import javax.swing.*;

class Media{
public static void main(String[] args) {
    int i = 0;
    int tamanhoVetor = 50;
    float[] num = new float[tamanhoVetor];
    float media, soma = 0;


    for(i=0 ; i < tamanhoVetor ; i++ ){
        num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
        soma = soma + num[i];
    }
    media = soma/tamanhoVetor;
    System.out.printf("A média das " + tamanhoVetor + " notas digitadas é: %.2f", media);
}
}
