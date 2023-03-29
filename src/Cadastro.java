import java.util.Scanner;

import javafx.scene.transform.Rotate;

public class Cadastro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String opcao;

        System.out.println("Bem-vindo ao sistema de cadastro!");

        do {
            System.out.println("Você deseja se cadastrar como motorista ou cliente?");
            System.out.print("Digite 'M' para motorista ou 'C' para cliente: ");
            opcao = input.nextLine().toUpperCase();

            if (opcao.equals("M")) {
                System.out.println("Você escolheu se cadastrar como motorista.");
           
                System.out.println("Digite seu nome: ");
                String nome = input.nextLine();

                System.out.println("Digite seu telefone: ");
                String telefone = input.nextLine();

                System.out.println("Digite seu cpf: ");
                String cpf = input.nextLine();
                
                System.out.println("Digite seu email: ");
                String email = input.nextLine();
                
                System.out.println("Digite seu Carteira Nacional de habilitação: ");
                String cnh = input.nextLine();

                System.out.println("Digite o modelo do seu veiculo: ");
                String modeloVeiculo = input.nextLine();
                    
                System.out.println("Digite a cor do seu veiculo: ");
                String corVeiculo = input.nextLine();
                    
                System.out.println("Digite a placa do seu veiculo: ");
                String placaVeiculo = input.nextLine();
                    
                
                    Motorista motorista = new Motorista(nome, telefone, cpf, email, cnh, modeloVeiculo, corVeiculo, placaVeiculo );
                    motorista.imprimeMotorista();

            } else if (opcao.equals("C")) {
                System.out.println("Você escolheu se cadastrar como cliente.");
                
                
                System.out.println("Digite seu nome: ");
                String nome = input.nextLine();
                
                System.out.println("Digite seu cpf: ");
                String cpf = input.nextLine();
                
                System.out.println("Digite seu email: ");
                String email = input.nextLine();
                
                System.out.println("Digite seu endereco: ");
                String endereco = input.nextLine();
                
                System.out.println("Digite seu telefone: ");
                String telefone = input.nextLine();
                
                Cliente cliente = new Cliente(nome, cpf, email, endereco, telefone);
                cliente.imprimeCliente();
                
                System.out.println("Gostaria de realizar uma corrida? 1(para sim) 2(para não) ");
                
                String resposta = input.nextLine();
                
                if (resposta.equals("1")){

                    System.out.println("Digite o Local de partida: ");
                    
                    String localPartida = input.nextLine();
                    
                    System.out.println("Digite o local de chegada: ");

                    String chegada = input.nextLine();

                    System.out.println("A distancia em Km seria: ");
                    
                    int distanciaEmKm = input.nextInt();


                    Rota rota = new Rota(localPartida, chegada, distanciaEmKm);
                    
                    rota.calcularTempoDaCorrida(distanciaEmKm);
                    rota.valorCorrida(distanciaEmKm);
                        
                        rota.imprimirRota();
                    
                    Pagamento pagamento = new Pagamento();
                    pagamento.pagarCorrida(rota.getValorCorrida());

                    //

                    // System.out.println("Avalie nossa corrida: digite 1 para avali ou digite 2 para não avaliar");
                    // String avaliacao = input.nextLine();
                    // System.out.println(avaliacao);
                    // if(avaliacao == "2"){
                    
                    //     System.out.println("Obrigado pela preferencia 2 não avaliar! "); 
                        
                    // }

                }else{
                    //Negar corrida aparece isso
                    System.out.println("Obrigado pela preferencia! "); 
                }
                    
                   
            
                                          

            } else {
                System.out.println("Opção inválida! Digite 'M' para motorista ou 'C' para cliente.");
            }
        } while (!opcao.equals("M") && !opcao.equals("C"));

        input.close();
    }
}