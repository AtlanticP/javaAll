package com.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {

    private int port;
    private DatagramSocket socket;
    private Thread serverRun, manage, receive;
    private boolean running = false;

    public Server (int port) {
        this.port = port;
        try {
//            "Я знаю отличную шутку про UDP, но не факт, что она до вас дойдет."
//            "Я знаю отличную шутку про TCP, но если она до вас не дойдет, то я повторю."
            socket = new DatagramSocket (port);
        } catch (SocketException e) {
            e.printStackTrace ();
        }
        serverRun = new Thread (new Runnable () {
            @Override
            public void run() {
                running = true;
                manage ();
                receive ();
            }
        }, "serverRun");
    }
    private void manage () {
        manage = new Thread (new Runnable () {

            @Override
            public void run() {
                while (running) {
                    // TODO: manage the clients
                }
            }
        });
        manage.start ();
    };

    private void receive () {
        receive = new Thread (new Runnable () {

            @Override
            public void run() {
                while (running) {
                    byte[] data = new byte[1024];
                    DatagramPacket packet = new DatagramPacket (data, data.length);
                    try {
                        socket.receive(packet);
                    } catch (IOException e) {
                        e.printStackTrace ();
                    }
                    String str = new String (packet.getData ());
                    System.out.println (str);
                }
            }
        });
    };
}
