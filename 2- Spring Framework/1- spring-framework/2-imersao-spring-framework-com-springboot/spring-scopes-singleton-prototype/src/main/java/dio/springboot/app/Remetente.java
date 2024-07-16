package dio.springboot.app;

public class Remetente {
    private String nome;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        String s =  "";
               s+=  "\nRemetente" + "\n" +
                       "{" + "\n" +
                            "Nome: " + this.nome + "\n" +
                            "Email: " + this.email + "\n" +
                       '}';
        return s;
    }
}
