package com.walle.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ��������
 * Created by Administrator on 2017/7/7.
 */
public class Server {
    public static void main(String[] args) throws IOException {
        //1.������������,ָ���󶨶˿ڣ��������˶˿�
        ServerSocket serverSocket = new ServerSocket(8888);
        System.err.print("��������ʼ����");
        //2.����accept()������ʼ�������ȴ��ͻ�������
        Socket socket = serverSocket.accept();
        //2.��ȡ������������ȡ�ͻ�����Ϣ
        InputStream inputStream = socket.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);//�����ֽ���ת�����ַ���
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);//�����ַ���
        String data=null;
        while ((data=bufferedReader.readLine())!=null){// ���ж�
            System.out.println("���Ƿ���ˣ����յ��Ŀͻ�����Ϣ�ǣ�"+data);
        }
        //��ȡ������������Ϣ���ͻ���
        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);
        printWriter.write("֪���ˣ����¼��");
        printWriter.flush();
        socket.shutdownOutput();
        printWriter.close();
        outputStream.close();
        bufferedReader.close();
        inputStreamReader.close();
        inputStream.close();
        socket.close();
        serverSocket.close();

    }
}
