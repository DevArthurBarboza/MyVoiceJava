import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int opcaoFora = 0, opcaoDentro = 0;
        Scanner entry = new Scanner(System.in);
        String cpf, senha, email,nome;
        Usuario usuario;
        ArrayList <Usuario> lista = new ArrayList<>();
        while (opcaoFora != 3) {
            System.out.println("Iniciando sistema...");
            System.out.println("1-Criar Conta");
            System.out.println("2-Logar em Conta Existente");
            System.out.println("3-Finalizar sistema");
            opcaoFora = entry.nextInt();

            switch (opcaoFora){
                case 1 :
                    System.out.println("Informe seu cpf");
                    cpf = entry.nextLine();
                    System.out.println("Informe seu email");
                    email = entry.nextLine();
                    System.out.println("Informe seu nome de usuario");
                    nome = entry.nextLine();
                    System.out.println("Crie sua senha");
                    senha = entry.nextLine();
                    usuario = new Usuario (cpf,email,senha,nome);
                    lista.add(usuario);
                    break;

                case 2 :
                    System.out.println("Informe o cpf referente a sua conta");
                    cpf = entry.nextLine();
                    for (int i = 0; i < lista.size();i++){
                        usuario = lista.get(i);
                        if (usuario.getCpf().equals(cpf) ){
                            System.out.println("Usuario encontrado!");
                            System.out.println("Senha:");
                            senha = entry.nextLine();
                            if (senha.equals(usuario.getSenha())){
                                while (opcaoDentro != 9){
                                    String publi;
                                    System.out.println("1-Publicar");
                                    System.out.println("2-Ver Publicações");
                                    System.out.println("3-Configurações do Perfil");
                                    opcaoDentro = entry.nextInt();

                                    switch (opcaoDentro){
                                        case 1 :
                                            publi = entry.nextLine();
                                            usuario.setTextoPub(publi);


                                    }
                                }
                            }


                            break;
                        }
                    }
                    break;

                case 3 :
                    System.out.println("Encerrando sistema...");
                    break;

            }

        }

    }
}
