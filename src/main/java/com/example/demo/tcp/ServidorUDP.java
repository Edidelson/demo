package com.example.demo.tcp;

import java.net.*;

/**
 * ServidorUDP is a simple UDP server that listens for incoming messages and responds with a confirmation message.
 */
public class ServidorUDP {

    /**
     * Main entry point of the application.
     *
     * @param args Command-line arguments (not used in this example)
     */
    public static void main(String[] args) {

        int porta = 9876; // Porta do servidor

        try (DatagramSocket socket = new DatagramSocket(porta)) {
            // Cria um buffer para armazenar mensagens recebidas
            byte[] buffer = new byte[1024];

            System.out.println("Servidor UDP aguardando mensagens...");

            // Escuta continuamente as mensagens recebidas
            while (true) {
                // Cria um DatagramPacket para armazenar a mensagem recebida
                DatagramPacket pacoteRecebido = new DatagramPacket(buffer, buffer.length);

                //Recebe a mensagem recebida
                socket.receive(pacoteRecebido); // Aguarda mensagem do cliente

                // Extrai a mensagem do DatagramPacket
                String mensagem = new String(pacoteRecebido.getData(), 0, pacoteRecebido.getLength());
                System.out.println("Mensagem recebida: " + mensagem);

                // Prepara uma mensagem de resposta
                String resposta = "Mensagem recebida!";
                byte[] respostaBytes = resposta.getBytes();

                // Cria um DatagramPacket para armazenar a mensagem de resposta
                DatagramPacket pacoteResposta = new DatagramPacket(
                        respostaBytes, respostaBytes.length,
                        pacoteRecebido.getAddress(), pacoteRecebido.getPort());

                // Envia a mensagem de resposta
                socket.send(pacoteResposta); // Envia resposta
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}