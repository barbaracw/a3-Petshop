import com.mycompany.petshop.Venda;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VendasTest {

    @Test
    public void testCalculoDesconto() {
        // Criação do objeto de vendas
        Venda venda = new Venda();

        // Definição do valor do produto e percentual de desconto
        double valorProduto = 100.0;
        double percentualDesconto = 10.0;

        // Cálculo do valor com desconto
        double valorComDesconto = venda.calcularDesconto(valorProduto, percentualDesconto);

        // Verificação se o cálculo foi realizado corretamente
        double valorEsperado = 90.0;
        Assertions.assertEquals(valorEsperado, valorComDesconto);
    }
}