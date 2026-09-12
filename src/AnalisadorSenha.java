import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AnalisadorSenha {

    static String senha;
    static int pontos = 0;
    static Boolean temNumero;
    static Boolean temMaiusculo;
    static Boolean temEspecial;

    public static void main(String[] args) throws IOException{

        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Digite sua senha...");
        senha = leitor.readLine();

        PontuadorSenha(senha);
        ClassificarSenha(pontos);
        TotalPontuacao();

    }

    public static void PontuadorSenha(String senha){
        temNumero = false;
        temMaiusculo = false;
        temEspecial = false;


        if(senha.length() >= 8){
            pontos = pontos + 2;
        }
        for(int i = 0; i < senha.length(); i++){
            if(Character.isDigit(senha.charAt(i)) == true){
                temNumero = true;
            }if(Character.isUpperCase(senha.charAt(i)) == true){
                temMaiusculo = true;
            }if(Character.isLetter(senha.charAt(i)) == false && Character.isDigit(senha.charAt(i)) == false){
                temEspecial = true;
            }
        }
        if(temEspecial == true){
            pontos = pontos + 3;
        }if (temMaiusculo == true){
            pontos = pontos + 2;
        }if(temNumero == true){
            pontos = pontos + 2;
        }

    }

    public static void ClassificarSenha (int pontos){
        if(pontos >= 8){
            System.out.println("\nSENHA FORTE");
        } else if(pontos >= 5){
            System.out.println("\nSENHA MÉDIA");
        } else if(pontos >= 3){
            System.out.println("\nSENHA FRACA");
        } else{
            System.out.println("\nSENHA EXTREMAMENTE FRACA");
        }
    }

    public static void TotalPontuacao(){
        System.out.println("\nTotal de pontuação: "+pontos);
        if(temEspecial == true){
            System.out.println("Caracter especial +3 pontos");
        } if(temMaiusculo == true){
            System.out.println("Caracter maiusculo +2 pontos");
        } if(temNumero == true){
            System.out.println("Numero +2 pontos");
        } if(senha.length() > 8){
            System.out.println("Mais de 8 Caracteres +2 pontos");
        }


    }


}

