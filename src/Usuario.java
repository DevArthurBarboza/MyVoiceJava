public class Usuario {
    private int id;
    private String cpf, email, senha,nome;
    private String textoPub;

    public Usuario (String cpf, String email, String senha, String nome){
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.nome = nome;

    }

    public void setTextoPub (String texto){
        this.textoPub = texto;
    }


    public void setSenha(String novaSenha){
    }

    public void setNome (String novoNome){
    }

    public void setEmail (String novoEmail){
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
}

