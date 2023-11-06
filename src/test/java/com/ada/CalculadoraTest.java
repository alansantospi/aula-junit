package com.ada;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    // Casos de teste do método somar
    // 1. Dados 2 numeros positivos, quando o primeiro for maior que o segundo, então a soma deve ser positiva
    // 2. 2 numeros positivos, sendo o primeiro menor que o segundo
    // 3. numeros positivos iguais
    // 4. primeiro negativo, segundo positivo
    // 5. primeiro positivo, segundo negativo
    // 6. 2 números de mesmo valor absoluto, mas sinais diferentes
    // 7. zero e um numero positivo
    // 8. zero e um numero negativo
    // 9. um numero positivo e zero
    // 10. um numero negativo e e zero
    // 11. 2 numeros negativos, sendo o primeiro maior que o segundo
    // 12. 2 numeros negativos, sendo o primeiro menor que o segundo
    // 13. numeros negativos iguais

    private Calculadora calc;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Antes de tudo");
    }

    @BeforeEach
    public void init(){
        System.out.println("iniciando um novo caso de teste");
        calc = new Calculadora();
        System.out.println(calc.qtdeOperacoes);
    }

    @AfterEach
    public void after(){
        System.out.println("Caso de teste finalizado");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("Finalizando testes");
    }

    @Test
    public void dados2Positivos_quandoPrimeiroMaior_entaoResultadoPositivo(){

        int x = 5;
        int y = 2;
        int expected = 7;

        int result = calc.somar(x, y);

        assertEquals(expected, result);
    }

    @Test
    public void dados2Positivos_quandoPrimeiroMenor_entaoResultadoPositivo(){

        int x = 4;
        int y = 7;
        int expected = 11;

        int result = calc.somar(x, y);

        assertEquals(expected, result);
    }

    @Test
    public void dados2Negativos_quandoXMaiorQueY_entaoNegativo(){

        int x = -7;
        int y = -3;
        int expected = -10;

        int result = calc.somar(x, y);

        assertEquals(expected, result);
    }

    @Test
    public void dadoZeroEPositivo_entaoResultadoDeveSerOSegundo(){
        int x = 0;
        int y = 8;
        int expected = 8;

        int result = calc.somar(x, y);

        assertEquals(expected, result);
    }

    @Test
    public void quandoDivisaoPorZero(){
        int x = 3;
        int y = 0;

        Exception e = assertThrows(ArithmeticException.class, () -> {
            calc.dividir(x, y);
        });
        assertEquals("/ by zero", e.getMessage());
    }
}