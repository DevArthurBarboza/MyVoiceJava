import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcaoFora = 0;
        Scanner entry = new Scanner(System.in);
        String cpf, senha, email, nome;
        Usuario usuario;
        ArrayList<Usuario> listaUsuario = new ArrayList<>();
        System.out.println("Iniciando sistema...");
        while (opcaoFora != 3) {
            System.out.println("1-Criar Conta");
            System.out.println("2-Logar em Conta Existente");
            System.out.println("3-Finalizar sistema");
            opcaoFora = entry.nextInt();
            entry.nextLine();

            switch (opcaoFora) {
                case 1:
                    System.out.println("Informe seu cpf");
                    cpf = entry.nextLine();
                    System.out.println("Informe seu email");
                    email = entry.nextLine();
                    System.out.println("Informe seu nome de usuario");
                    nome = entry.nextLine();
                    System.out.println("Crie sua senha");
                    senha = entry.nextLine();
                    usuario = new Usuario(cpf, email, senha, nome);
                    listaUsuario.add(usuario);
                    System.out.println("Conta Criada!");
                    break;

                case 2:
                    System.out.println("Informe o cpf referente a sua conta");
                    cpf = entry.nextLine();
                    System.out.println("Senha:");
                    senha = entry.nextLine();
                    for (int i = 0; i < listaUsuario.size(); i++) {

                         if ((listaUsuario.get(i).getCpf().equals(cpf)) && (senha.equals(listaUsuario.get(i).getSenha()))) {
                            System.out.println("Usuario encontrado!");
                            int opcaoDentro = 0;
                            for (int k = 0; opcaoDentro != 9; k++) {

                                System.out.println("1-Publicar");
                                System.out.println("2-Ver Publicações");
                                System.out.println("3-Configurações do Perfil");
                                System.out.println("9-Voltar para tela de login");
                                opcaoDentro = entry.nextInt();
                                entry.nextLine();

                                switch (opcaoDentro) {
                                    case 1:
                                        int index = 0;
                                        listaUsuario.get(i).setTextoPub();
                                        listaUsuario.get(i).setArray(index);
                                        String aux = listaUsuario.get(i).getTextoPub();
                                        index += 1;
                                        break;
                                    case 2:
                                        for (int j = 0; j < listaUsuario.get(i).getArray().size(); j++) {
                                            System.out.println(listaUsuario.get(i).getIArray(j));
                                        }
                                        break;

                                    case 3:
                                        int op = 0;
                                        while (op != 9) {
                                            System.out.println("1-Mudar nome");
                                            System.out.println("2-Mudar email");
                                            System.out.println("3-Mudar senha");
                                            System.out.println("4-Consultar dados");
                                            System.out.println("9-Voltar para o feed");
                                            op = entry.nextInt();

                                            if (op == 1) {
                                                listaUsuario.get(i).setNome();
                                            }
                                            if (op == 2) {
                                                listaUsuario.get(i).setEmail();
                                            }
                                            if (op == 3) {
                                                listaUsuario.get(i).setSenha();
                                            }
                                            if (op == 4) {
                                                listaUsuario.get(i).consultaDados();
                                            }
                                        }
                                        break;
                                    }
                            }
                            break;
                        }


                    }
                    break;

                case 3:
                    System.out.println("Encerrando sistema...");
                    break;

            }

        }

    }
}
