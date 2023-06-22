import com.mycompany.petshop.SaudeAnimal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SaudeAnimalTest {

    @Test
    public void testCalculoIMC() {
        // Criação do objeto de saúde do animal
        SaudeAnimal saudeAnimal = new SaudeAnimal();

        // Definição do peso e altura do animal
        double peso = 20.0;
        double altura = 0.5;

        // Cálculo do IMC
        double imc = saudeAnimal.calcularIMC(peso, altura);

        // Verificação se o cálculo foi realizado corretamente
        double imcEsperado = 80.0;
        Assertions.assertEquals(imcEsperado, imc);
    }
}