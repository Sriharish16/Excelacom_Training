package com.training.jsax_client;

import jakarta.ws.rs.*;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.*;

public class ProductClient {
	
	public static void main(String[]args) {
		
		
		Client client= ClientBuilder.newClient();
		Response resp=builder.get();

		int ch=4;
		
		if(ch==1) {	
			
		
	String object=resp.readEntity(String.class);
	System.out.println(object);
		}
		
		if(ch==2) {
			WebTarget findByIdTarget = target.path("/srch/131");
			
			Invocation.Builder builder2 =
					findByIdTarget.request(MediaType.APPLICATION_JSON);
			
			Response findByResp = builder2.get();
			
			Product object2 = findByResp.readEntity(Product.class);
			
			System.out.println(object2);
		}		
		if(ch==4) {
				
	Product[] list=resp.readEntity(Product[].class);
for(Product eachProduct:list) {
	System.out.println(eachProduct);
}
		if(ch==3) {
		
		Product toAdd = new Product(785,"Upa",560);
		
		Response response = builder.post(Entity.entity(toAdd, MediaType.APPLICATION_JSON));
	System.out.println(response.getStatus());
	System.out.println(response.readEntity(String.class));
		
	}

}
