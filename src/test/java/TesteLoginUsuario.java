import com.mycompany.petshop.Sistema;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteLoginUsuario {

    @Test
    public void testLoginUsuario() {
        // Criação do objeto de teste
        Sistema sistema = new Sistema();

        // Definição do nome de usuário e senha
        String nomeUsuario = "usuario";
        String senha = "senha123";

        // Realização do login
        boolean loginSucesso = sistema.realizarLogin(nomeUsuario, senha);

        // Verificação se o login foi realizado com sucesso
        Assertions.assertTrue(loginSucesso);
    }
}