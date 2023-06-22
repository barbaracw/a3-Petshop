import com.mycompany.petshop.Agendamento;
import com.mycompany.petshop.CadastroCliente;
import com.mycompany.petshop.Cliente;
import com.mycompany.petshop.Servico;
import java.time.LocalDate;
import java.time.LocalTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IntegrationTest {
    private CadastroCliente cadastroClientes;
    private Agendamento Agendamento;

    @BeforeEach
    public void setUp() {
        // Configuração inicial para cada teste
        cadastroClientes = new CadastroCliente();
        Agendamento = new Agendamento();
    }

    @Test
    public void testCadastroClienteEAgendamento() {
        // Criação de um cliente
        Cliente cliente = new Cliente("João", "48956565", "588646540", "Rua das Palmeiras", "joao@gmail.com");

        // Cadastro do cliente
        CadastroCliente.cadastrarCliente(cliente);

        // Agendamento de um serviço para o cliente
        Servico servico = new Servico("Banho", 50.0);
        Agendamento.agendarServico(cliente, servico, LocalDate.now(), LocalTime.of(10, 0) );

        // Verificação se o cliente foi cadastrado corretamente
        Cliente clienteCadastrado = cadastroClientes.buscarCliente("123456789");
        Assertions.assertEquals(cliente, clienteCadastrado);

        // Verificação se o agendamento foi realizado corretamente
        Servico servicoAgendado = Agendamento.buscarServicoAgendado(cliente);
        Assertions.assertEquals(servico, servicoAgendado);
    }
}