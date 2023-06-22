
import com.mycompany.petshop.Agendamento;
import com.mycompany.petshop.Cliente;
import com.mycompany.petshop.Servico;
import com.mycompany.petshop.Sistema;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class TestAgendamentoServico {

    @Test
    public void testAgendamentoServico() {
        // Configurar o ambiente de teste
        Sistema sistema = new Sistema();
        Agendamento Agendamento = new Agendamento(sistema);
        Cliente cliente = new Cliente("João", "489565635", "089568954", "Rua das Palmeiras", "joao@gmail.com");
        Servico servico = new Servico("Banho e Tosa");

        // Realizar o agendamento
        Agendamento.agendarServico(cliente, servico, LocalDate.now(), LocalTime.of(10, 0));

        // Verificar se o agendamento foi registrado corretamente
        List<Agendamento> agendamentos = Agendamento.getAgendamento();
        Agendamento ultimoAgendamento = agendamentos.get(agendamentos.size() - 1);

        Assert.assertEquals(cliente, ultimoAgendamento.getCliente());
        Assert.assertEquals(servico, ultimoAgendamento.getServico());
        Assert.assertEquals(LocalDate.now(), ultimoAgendamento.getData());
        Assert.assertEquals(LocalTime.of(10, 0), ultimoAgendamento.getHorario());
    }
}
