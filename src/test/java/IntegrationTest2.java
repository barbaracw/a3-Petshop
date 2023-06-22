import com.mycompany.petshop.Estoque;
import com.mycompany.petshop.Venda;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegrationTest2 {
    @Test
    public void testIntegracaoEstoqueVendas() {
        // Criação dos objetos de teste
        Estoque estoque = new Estoque();
        Venda venda = new Venda();

        // Definição do produto e quantidade disponível no estoque
        String produto = "Ração para Cães";
        int quantidadeEstoque = 10;

        // Adicionar o produto ao estoque
        estoque.adicionarProduto(produto, quantidadeEstoque);

        // Realizar uma venda do produto
        boolean vendaSucesso = venda.realizarVenda(produto, 2);

        // Verificação se a venda foi realizada com sucesso
        Assertions.assertTrue(vendaSucesso);

        // Verificação se a quantidade disponível no estoque foi atualizada corretamente
        int quantidadeAtualizada = quantidadeEstoque - 2;
        int quantidadeDisponivel = estoque.getQuantidadeDisponivel(produto);
        Assertions.assertEquals(quantidadeAtualizada, quantidadeDisponivel);
    }
}
