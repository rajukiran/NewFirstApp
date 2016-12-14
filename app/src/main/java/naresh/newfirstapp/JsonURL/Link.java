package naresh.newfirstapp.JsonURL;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;

/**
 * Created by Naresh on 14-12-2016.
 */

public class Link
{
        public static JSONObject requestJSON(String url) {
            JSONObject response = new JSONObject();
            InputStream is = null;
            try {
                java.net.URL mUrl = new java.net.URL(url);
                HttpURLConnection conn = (HttpURLConnection) mUrl.openConnection();
                conn.setReadTimeout(20000 /* milliseconds */);
                conn.setConnectTimeout(20000 /* milliseconds */);
                conn.setRequestMethod("GET");
                conn.setDoInput(true);
                // Starts the query
                conn.connect();
                int responsee = conn.getResponseCode();
                is = conn.getInputStream();
                // Convert the InputStream into a string
                response=new JSONObject(readIt(is).toString());
                // Makes sure that the InputStream is closed after the app is
                // finished using it.
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (is != null) {
                    try {
                        is.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            return response;
        }

        static StringBuilder readIt(InputStream stream) throws IOException, UnsupportedEncodingException {
            BufferedReader reader = null;
            String line = "";
            StringBuilder builder=new StringBuilder();
            try {
                reader = new BufferedReader(new InputStreamReader(stream));
                while ((line = reader.readLine()) != null) {
                    builder.append(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (reader != null) {
                    try {
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return builder;
            }
        }

        public static JSONArray requestGETJSONArray(String url) {
            JSONArray response = new JSONArray();
            InputStream is = null;
            try {
                java.net.URL mUrl = new java.net.URL(url);
                HttpURLConnection conn = (HttpURLConnection) mUrl.openConnection();
                conn.setReadTimeout(20000 /* milliseconds */);
                conn.setConnectTimeout(20000 /* milliseconds */);
                conn.setRequestMethod("GET");
                conn.setDoInput(true);
                // Starts the query
                conn.connect();
                int responsee = conn.getResponseCode();
                is = conn.getInputStream();
                // Convert the InputStream into a string
                // System.out.println("========== in url "+readIt(is).toString());
                response=new JSONArray(readIt(is).toString());
                // Makes sure that the InputStream is closed after the app is

                // finished using it.
            } catch (Exception e) {

                e.printStackTrace();
            } finally {
                if (is != null) {
                    try {
                        is.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            return response;
        }
}

