package br.com.poo.objetos;

import java.io.BufferedReader;

/*
 * Este arquivo de java realiza um acesso remoto
 * via SSH em um servidor Linux(Fedora Server).
 * Para realizar está operação foi necessário a utilização de uma biblioteca chamada,
 * jsch(Java Secutiry Channel). Está biblioteca foi baixada do site:
 */



import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

public class AcessoSSH {
	
	/*
	 * Para o acesso à maquina remota Linux foi definido como constante
	 * os seguintes itens abaixo:
	 */
	
	public static final String REMOTE_HOST = "127.0.0.1";
	public static final String REMOTE_USER = "senac";
	public static final String REMOTE_PASSWORD = "senac@123";
	public static final int REMOTE_PORT = 2222;
	/*
	 * Para a sessão e o Channel(Canal) foi definido um tempo de execução
	 * de 10000 milisegundos, ou sejá, 10 segundos.
	 */
	public static final int SESSION_TIMEOUT = 10000;
	public static final int CHANEL_TIMEOUT = 10000;
	
	
	public static void main(String[] args) {
		//O comando que será executado para abrir a sessão ssh com os servidor Linux
		String comando = "python3 /home/senac/Python/populacao.py";
		
		Session sessao = null;
		/*
		 * Comando try serve para que sejá executado uma ação de risco
		 * O comando tem o intuito de fazer uma ação dentro do disco, por isso
		 * é necessário utilizar o try e catch
		 */
		try {
			/*
			 * Criação do objeto config para criar as configurações de acesso
			 * ao servidor
			 */
			Properties config = new Properties();
			
			//Foi setada a configuração restrita para checagem de criptografia como no(não)
			//Isso faz com que não haja a verificação da chave de criptografia
			//muito usado quando não se tem a chave.
			config.put("StrictHostKeyChecking", "no");
			
			//Criando o objeto JSch(Java Security Channel)
			JSch jsch = new JSch();
			
			//Setar o arquivo que contém a chave de criptografia para acesso SSH.
			jsch.setKnownHosts("/home/senac/.ssh/nome_arquivo_chave");
			
			//Comando para abrir a sessão remota com o servidor Linux. Foram passados:
			//Nome Usuário, Ip do Servidor e porta de comunicação nesta ordem
			sessao = jsch.getSession(REMOTE_USER,REMOTE_HOST,REMOTE_PORT);
			
			//Setando a senha do servidor remoto
			sessao.setPassword(REMOTE_PASSWORD);
			
			//Foi setado a configuração para a sessão não verificar a existência da chave
			//de acesso.
			sessao.setConfig(config);
			
			//Passando o tempo de execução da sessão
			sessao.connect(SESSION_TIMEOUT);
			
			/*
			 * Criando o elemento que representa o canal de execução de comandos. O comando
			 * sessao.openChannel, nos diz que quando a sessão for aberta também será aberto um
			 * canal para passagem dos comandos que serão executados(exec) no servidor
			 * remoto
			 */
			ChannelExec channelExec = (ChannelExec) sessao.openChannel("exec");
			
			/*
			 * O comando channelExec.setCommand aponta o comando que deve ser executado no servidor
			 * remoto. Este comando foi definido na declaração de variável String comando.
			 */
			channelExec.setCommand(comando);
			
			/*
			 * Quando há algum erro inesperado na execução do channelExec será exibido no sysout
			 */
			channelExec.setErrStream(System.err);
			
			/*
			 * O comando InputStream realizar uma entrada de dados por meo do canal criado.
			 * também permite obter os dados que estão entrando no canal como o comando 
			 * getInputStream()
			 */
			InputStream in = channelExec.getInputStream();
			
			/*
			 * Estabelece a conexão com o canal e passa o tempo em que no canal fica aberto para a passagem
			 * de dados.
			 */
			channelExec.connect(CHANEL_TIMEOUT);
			
			/*
			 * Os dados serão passados e recebidos por bytes e não diretamente com Strings ou Números(inteiros | reais)
			 * para que está ação sejá feita, criamos um array de bytes para realizar a transação.
			 */
			byte[] tmp = new byte[1024];
			
			/*
			 * Enquanto for possível executar ao laço(while(true)) ele deve
			 * verificar se há dados em in , portanto temos o comando in.available(disponível) se é
			 * maior que 0. Sendo positivo ele deve executar todas as linhas disponíveis que retornaram.
			 * Se o retorno de dados em mais linhas maiores que 0(zero), estas linhas deveram
			 * ser apresentadas no terminal. O uso do comando new String(tmp,0,i) faz a conversão de bytes
			 * que estão vindo como resposta e a variável i conta a quantidade de linhas que retornará
			 */
			
			while(true) {
				while(in.available()>0) {
					int i = in.read(tmp,0,1024);
					if(i < 0) break;
					System.out.println(new String(tmp,0,i));
				}
				
				/*
				 * Se o canal estiver fechado, mas mesmo assim tiver dados em in, o laço deve continuar,
				 * ou sejá, volta ao início e executa tudo outra vez
				 * Caso não haja mais nada a ser exibido em tela, o canal é fechado e é exibida a mensagem
				 * de canal fechado
				 */
				if(channelExec.isClosed()) {
					if(in.available()>0) continue;
					System.out.println("Saída do processo"+ channelExec.getExitStatus());
					break;
					
				}
				try {
					//Demora 1 segundo e repete o laço outra vez até o canal ser desconectado
					Thread.sleep(1000);
				}
				catch(Exception ex){
					ex.printStackTrace();
				}
				
				Process pr = Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application//chrome http://127.0.0.1:8084/grafico.html");
				BufferedReader loading = new BufferedReader(new InputStreamReader(pr.getInputStream()));
				String rs = "";
				
				while((rs = loading.readLine())!=null) {
					System.out.println(rs);
				}
				
				channelExec.disconnect();//Desconectar o canal
			
			}
					
			}
			catch(JSchException jse) {
				jse.printStackTrace();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		
			finally {
				if(sessao !=null) {
					sessao.disconnect();//Desconectar o canal
				}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

	}

}
