package com.example.demo.tcp;

import java.net.*;

/**
 * Cliente UDP é um cliente UDP simples que envia uma mensagem para um servidor e recebe uma resposta.
 */
public class ClienteUDP {

    public static void main(String[] args) {
        String servidor = "localhost"; // IP do servidor
        int porta = 9876; // Porta do servidor

        try (DatagramSocket socket = new DatagramSocket()) {
            //Cria uma mensagem para enviar ao servidor
            String mensagem = "Olá, servidor UDP!";
            byte[] buffer = mensagem.getBytes();

            //Obtém o endereço IP do servidor
            InetAddress endereco = InetAddress.getByName(servidor);

            //Cria um DatagramPacket para enviar ao servidor
            DatagramPacket pacoteEnvio = new DatagramPacket(buffer, buffer.length, endereco, porta);
            socket.send(pacoteEnvio); // Envia pacote UDP

            //Recebe a resposta do servidor
            byte[] bufferResposta = new byte[1024];
            DatagramPacket pacoteResposta = new DatagramPacket(bufferResposta, bufferResposta.length);
            socket.receive(pacoteResposta);

            // Extrai a resposta do DatagramPacket
            String resposta = new String(pacoteResposta.getData(), 0, pacoteResposta.getLength());
            System.out.println("Resposta do servidor: " + resposta);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}