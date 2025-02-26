package br.com.emersonmendes.study.solid._1singleresponsibility.bad;

public class UserRepository {

    public void save(User user) {
        System.out.println("Salvando o usuário " + user.getName() + " no banco de dados.");
    }

}
