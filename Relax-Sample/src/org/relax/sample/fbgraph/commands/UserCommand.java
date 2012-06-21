package org.relax.sample.fbgraph.commands;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.relax.IServiceCommand;

import android.content.Context;
import android.os.Bundle;

public class UserCommand implements IServiceCommand {
	@Override
    public String execute(Context arg0, Bundle arg1) {
		try {
	        URL userUrl = new URL("https://graph.facebook.com/btaylor");
	        InputStream stream = userUrl.openStream();
	        BufferedReader br = new BufferedReader(new InputStreamReader(stream));
	        StringBuilder builder = new StringBuilder();
	        String str = br.readLine();
	        while (str!=null){
	        	builder.append(str + "\n");
	        	str = br.readLine();
	        }
	        stream.close();
	        return str.toString();
		} catch (MalformedURLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
        } catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
        }
	    return null;
    }
}
