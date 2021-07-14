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
        System.out.println("Iniciando sistema...");
        while (opcaoFora != 3) {
            System.out.println("1-Criar Conta");
            System.out.println("2-Logar em Conta Existente");
            System.out.println("3-Finalizar sistema");
            opcaoFora = entry.nextInt(); entry.nextLine();

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
                    System.out.println("Conta Criada!");
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
                                String[] listaPost = new String[10];

                                for (int k = 0; opcaoDentro != 9; k++){
                                    String publi;
                                    System.out.println("1-Publicar");
                                    System.out.println("2-Ver Publicações");
                                    System.out.println("3-Configurações do Perfil");
                                    System.out.println("9-Encerrar sistema");
                                    opcaoDentro = entry.nextInt(); entry.nextLine();

                                    switch (opcaoDentro){
                                        case 1 :
                                            publi = entry.nextLine();
                                            usuario.setTextoPub(publi);
                                            listaPost[k] = usuario.getTextoPub();
                                            break;
                                        case 2 :
                                            for (int j = 0; j < listaPost.length ;j++){
                                                if (!(listaPost[j] == null)) {
                                                    System.out.println(listaPost[j]);
                                                }
                                            }
                                            break;

                                        case 3 :
                                            int op = 0;
                                            while ( op != 9){
                                                System.out.println("1-Mudar nome");
                                                System.out.println("2-Mudar email");
                                                System.out.println("3-Mudar senha");
                                                System.out.println("9-Sair das configurações");
                                                op = entry.nextInt();
                                            }


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
