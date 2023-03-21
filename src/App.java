import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        user.name = "Usuário Bonito";
        user.setCpf("123.456.789-10");
        user.setEmail("usuario@email.com");
       
        System.out.println("Write your college:");
        String college = sc.nextLine();
        sc.close();
        user.setCollege(college);

        user.address.city = "Rio de Janeiro";
        user.address.state = "RJ";
        user.address.street = "Rua do Dev Java";
        user.address.number = 10;


        System.out.println("Nome: " + user.name);
        System.out.println("Email: " + user.getEmail());
        System.out.println("CPF: " + user.getCpf());
        System.out.println("Faculdade: " + user.getCollege());
        System.out.println("Local: " + user.address.state + " - " + user.address.city);
    }
}