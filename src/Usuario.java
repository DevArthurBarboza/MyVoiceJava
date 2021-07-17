import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
    Scanner entry = new Scanner (System.in);
    private int id;
    private String cpf, email, senha,nome;
    private String textoPub;
    private ArrayList <String> lista;

    public Usuario (String cpf, String email, String senha, String nome){
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.lista = new ArrayList<>();
    }



    //
    public ArrayList<String> getArray(){
        return this.lista;
    }

    public String getIArray(int i){
        return this.lista.get(i);
    }

    public void setArray(int repet){
        this.lista.add(repet,getTextoPub());
    }

    //




    public void setTextoPub (){
        String texto = entry.nextLine();
        this.textoPub = texto;
    }


    public void setSenha(){
        System.out.println("Informe a nova senha");
        String novaSenha = entry.nextLine();
        this.senha = novaSenha;
    }

    public void setNome (){
        System.out.println("Informe o novo nome");
        String novoNome = entry.nextLine();
        this.nome = novoNome;
    }

    public void setEmail (){
        System.out.println("Informe o novo email");
        String novoEmail = entry.nextLine();
        this.email = novoEmail;
    }

    public String getTextoPub(){
        return this.textoPub;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getSenha() {
        return this.senha;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }

    public void consultaDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("Senha: " + this.senha);
        System.out.println("Cpf: " + this.cpf);

    }
}

