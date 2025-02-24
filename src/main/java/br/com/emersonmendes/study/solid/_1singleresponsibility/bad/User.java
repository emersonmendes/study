package br.com.emersonmendes.study.solid._1singleresponsibility.bad;

public class User {

    private String name;
    private String email;

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    // Método para salvar o usuário no banco de dados
    public void save() {
        // Lógica de persistência (por exemplo, conexão com o banco de dados)
        System.out.println("Salvando o usuário " + name + " no banco de dados.");
    }

}