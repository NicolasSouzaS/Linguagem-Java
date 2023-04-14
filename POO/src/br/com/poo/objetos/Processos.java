package br.com.poo.objetos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Processos{
	public static void main(String[] args) {
		
		try {
			/*
			 * O comando Process executa um comando do sistema operacional, neste
			 * caso o sistema é Windows.
			 * O comando Runtime(tempo de execução) get Runtime(chamar para executar)
			 * são utilizado para executar um comando do sistema operacional. E, este
			 * comando será executado quando a aplicação do java for executada(Runtime).
			 * Abaixo estamos abrindo a calculadora
			 */
			Process pr = Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application//chrome http://127.0.0.1:8888");
			/*
			 * O comando BufferedReader(A classe BufferedReader) é um leitor que
			 * trabalha com os dados em memória. Ele é responsavel para ler 
			 * os dados em memória.
			 * Abaixo é feita uma inserção de leitura de dados com o comando
			 * InputStreamReder (Inserir um dado de leitura). Neste caso foi
			 * inserido e lido o processo que executa o comando que abre o Chrome.
			*/
			BufferedReader loading = new BufferedReader(new InputStreamReader(pr.getInputStream()));
			/*
			 * Para exibir as informações retornadas pelo Buffer, podemos usar uma variável
			 *no formato de String para armazenar estas informações e
			 *depois exibi-las
			 */
			String rs = "";
			/*
			 * Para pegar todos os dados de memória e exibir em tela, foi utilizado 
			 * o comando while e os dados foram passados para a variável rs.
			 * Assim foi possível exibir no console.
			 */
			
			while((rs = loading.readLine())!=null) {
				System.out.println(rs);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
