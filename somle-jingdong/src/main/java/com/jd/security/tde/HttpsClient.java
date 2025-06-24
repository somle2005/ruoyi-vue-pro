package com.jd.security.tde;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.util.logging.Logger;
import javax.net.ssl.HttpsURLConnection;

public class HttpsClient {
   private static final Logger LOGGER = Logger.getLogger(HttpsClient.class.getName());

   public static String postJson(String requestUrl, String payload) {
      try {
         HttpsURLConnection connection = null;
         URL url = new URL(requestUrl);
         boolean hasConn = false;

         for(int i = 0; i < 2; ++i) {
            try {
               if (hasConn) {
                  break;
               }

               connection = (HttpsURLConnection)url.openConnection();
               connection.setDoInput(true);
               connection.setDoOutput(true);
               connection.setRequestMethod("POST");
               connection.setRequestProperty("Accept", "application/json");
               connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
               connection.setConnectTimeout(5000);
               connection.setReadTimeout(5000);
               OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream(), "UTF-8");
               writer.write(payload);
               writer.close();
               hasConn = true;
            } catch (IOException e) {
               LOGGER.warning(e.getLocalizedMessage());
            }
         }

         if (!hasConn) {
            LOGGER.severe("HTTPS Client cannot establish connections.");
            throw new RuntimeException("HTTPS Client cannot establish connections.");
         } else {
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
            StringBuffer jsonString = new StringBuffer();

            String line;
            while((line = br.readLine()) != null) {
               jsonString.append(line);
            }

            br.close();
            return jsonString.toString();
         }
      } catch (Exception e) {
         throw new RuntimeException(e);
      }
   }
}
