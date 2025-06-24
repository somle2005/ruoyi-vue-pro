package com.jd.security.tde;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpClient {
   public static String sendData(String requestUrl, String method, String payload) throws IOException {
      URL url = new URL(requestUrl);
      HttpURLConnection connection = (HttpURLConnection)url.openConnection();
      connection.setDoInput(true);
      connection.setDoOutput(true);
      connection.setConnectTimeout(5000);
      connection.setReadTimeout(5000);
      connection.setRequestMethod(method);
      connection.setRequestProperty("Content-Type", " application/json");
      OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream(), "UTF-8");
      writer.write(payload);
      writer.close();
      BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
      StringBuffer responseBuf = new StringBuffer();

      String line;
      while((line = br.readLine()) != null) {
         responseBuf.append(line);
      }

      br.close();
      connection.disconnect();
      return responseBuf.toString();
   }
}
