import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class Exercicio {
        public static double calcularAreaRetanguloComInputUsuario() {
            Scanner calculo = new Scanner(System.in);

            System.out.println("Digite a base: ");
            double base = calculo.nextDouble();

            System.out.println("Digite a altura: ");
            double altura = calculo.nextDouble();

            double areaRetangulo = base * altura;
            System.out.println("O valor da área é de "+areaRetangulo);

            return areaRetangulo;
        }

        public static void calcularSomaAreas() {

            double somaAreas = calcularAreaRetanguloComInputUsuario() + calcularAreaRetanguloComInputUsuario();
            System.out.println("A area total de construção é de: "+somaAreas);
        }

        public static void mostrarTodosOsValoresListaNumero(List<Integer> numeros) {

            for (int i = 0; i < numeros.size(); i++) {
                System.out.println(numeros.get(i));
            }
        }

        public static List <Integer> retornarListaNumeros() {
            List<Integer> listaNumero = new ArrayList<>(3);
            listaNumero.add(2);
            listaNumero.add(5);
            listaNumero.add(1);
            return listaNumero;
        }

        public static List<String> mostrarnomesComPosicao(List<Integer> quantidade) {
            List<String> nomesExibir = new ArrayList<>();

            for (int i = 0; i < quantidade.size(); i++) {
                nomesExibir.add(quantidade.get(i) + " nomes");
                System.out.println(nomesExibir.get(i));
            }
            return nomesExibir;
        }


        public static void main(String[] args) {

            System.out.println("=========================================================");
            System.out.println("Exemplo do calculo do retangulo com funções");
            System.out.println("=========================================================");

            calcularSomaAreas();


            System.out.println("=========================================================");
            System.out.println("Exemplo de mostrar lista de números com funções");
            System.out.println("=========================================================");

            mostrarTodosOsValoresListaNumero(retornarListaNumeros());


            System.out.println("=========================================================");
            System.out.println("Exemplo de mostrar lista de quantidade de nomes com funções");
            System.out.println("=========================================================");
            List<String> listaNomesComQuantidade = mostrarnomesComPosicao(retornarListaNumeros());
            System.out.println("Exemplo de array = "+ listaNomesComQuantidade);

        }
    }

