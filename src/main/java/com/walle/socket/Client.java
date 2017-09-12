package com.walle.socket;

import java.io.*;
import java.net.Socket;

/**
 * �ͻ���
 * Created by Administrator on 2017/7/7.
 */
public class Client {
    public static void main(String[] args) {
        try {
            //�����ͻ���Socket��ָ����������ַ�Ͷ˿�
            Socket socket = new Socket("localhost", 8888);
            //��ȡ���������λ��������Ϣ
            OutputStream outputStream = socket.getOutputStream();//�ֽ������
            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.write("���ǿͻ��ˣ��ҵĵ�¼�û����ǣ����ү�������ǣ�nidaye");
            printWriter.flush();
            socket.shutdownOutput();//�ر������

            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String data = null;
            while((data=bufferedReader.readLine())!=null){
                System.out.println("���յ�����������Ϣ��"+data);
            }
            bufferedReader.close();
            inputStream.close();
            printWriter.close();
            outputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
